package week10;

import java.util.Scanner;
public class Index {
	public static void main(String[] args) {
	    int[] list = new int[120];
		for(int i = 0; i < 120; i++) {
		    double dValue = Math.random();
		    int iValue = (int)(dValue * 1000);
		    list[i] = iValue;
		}
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter an index: ");
			int num = input.nextInt();
			System.out.print("The element is "+list[num]);
		}catch(IndexOutOfBoundsException ex) {
			System.out.println("Index out of bound");
		}
	}
}
