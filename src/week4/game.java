package week4;

import java.util.Scanner;
public class game {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int gameOver = -1;
		int computerWin =0;
		int userWin = 0;
		while(gameOver == -1) {
			int computer = (int)(Math.random()*3);
			if(computer == 0) {
				System.out.println("computer is scissor");
			}else if (computer ==1) {
				System.out.println("computer is rock");
			}else {
				System.out.println("computer is paper");
			}
			System.out.println("scissor (0), rock (1), paper(2): ");
			
			int user = input.nextInt();
			
			if( computer == 0 && user == 1) {
				userWin++;
			}else if(computer == 0 && user == 2) {
				computerWin++;
			}else if(computer == 1 && user == 0) {
				computerWin++;
			}else if(computer == 1 && user == 2) {
				userWin++;
			}else if(computer == 2 && user == 0) {
				userWin++;
			}else if(computer == 2 && user == 1) {
				computerWin++;
			}
			
			if(Math.abs(computerWin-userWin)==2) {	
				if(userWin > computerWin) {
					System.out.println("you won");
				}else {
					System.out.println("computer won");
				}
				gameOver = 1;
			}
		}
	}
}
