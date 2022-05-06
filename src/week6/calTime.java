package week6;


public class calTime {
	public static void main(String[] args) {
		int[][] empolyeeTime = {
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}
		};
		
		int [][] list = cal(empolyeeTime);
		 		
		java.util.Arrays.sort(list, (b, a) -> Integer.compare(a[0], b[0]));
		
		for (int i = 0; i < list.length; i++) {
		    System.out.print("empolyee"+list[i][1] + ": "+list[i][0]);
		    System.out.println();
		}
		
	} 
	public static int[][] cal(int[][] time) {
		int[][] list = new int[time.length][2];
		int sum=0;
		int k = 0;
		for(int i=0; i<time.length; i++) {
			for(int j=0; j<time[0].length; j++) {
				sum+=time[i][j];
				list[i][1]=i;
				list[i][0]=sum;
				k++;
			}
			sum=0;
		}
		return list;
	}
	
}
