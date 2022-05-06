package week7;

import java.util.Scanner;

public class testLinear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		LinearEquation test = new LinearEquation(a,b,c,d,e,f);
		
		if(test.isSolved()) {
			System.out.println("the equation has no solution");
		}else {
			System.out.println("x: "+test.getX()+ " y: "+test.getY());
		}
	}
}

