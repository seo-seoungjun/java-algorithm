package week4;

import java.util.Scanner;

public class pyramid {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int number = input.nextInt();
		int space = (number-1)*2;
		
		for(int i = 1; i <=number; i++) {
			int val = i;
			if(number >=10 && i <10) {
				for(int a =1; a <= number-9; a++) {
					System.out.print(" ");
				}
			}else if( number >=10 && i > 9 && i < number) {
				for (int b=1; b <=number-i; b++) {
					System.out.print(" ");
				}
			}
			for(int k =0; k < space; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<= 2*i-1; j++) {
				System.out.print(val);
				System.out.print(" ");
				
				if(j<i) {
					val--;
				}else {
					val++;
				}
			}
			System.out.println();
			space-=2;
		}
	}
}


