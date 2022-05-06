package week7;

import java.util.Scanner;

public class intersect {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		int x4 = input.nextInt();
		int y4 = input.nextInt();
		
		double[] firstLine = new double[3];
		double[] secondLine = new double[3];
		
		calculate(x1,y1,x2,y2, firstLine);
		calculate(x3,y3,x4,y4, secondLine);
		
		LinearEquation test = new LinearEquation(firstLine[0],firstLine[1],secondLine[0],secondLine[1],firstLine[2],secondLine[2]);
		
		if(test.isSolved()) {
			System.out.println("There's no intersection.");
		}else {
			System.out.println("x: "+test.getX()+ " y: "+test.getY());
		}
		
		
	}
	public static void calculate (int x1, int y1, int x2, int y2, double arr[]) {
		double a = (y2-y1)/(x1-x2);
		double b = 1;
		double c = y1 + (y2-y1)*x1/(x1-x2);

		arr[0] = a;
		arr[1] = b;
		arr[2] = c;

	}
}
