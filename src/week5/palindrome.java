package week5;

import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("number: ");
		int number = input.nextInt();
		boolean result = isPalindrome(number);
		System.out.println(result);
	}
	public static int reverse(int num) {
		int reverseNum = 0;
		while(num !=0) {
			int remainder = num%10;
			reverseNum = reverseNum*10+remainder;
			num = num/10;
		}
		return reverseNum;
	}
	public static boolean isPalindrome(int num) {
		boolean isPalindrome;
		int reverseNum=reverse(num);
		if(num == reverseNum) {
			isPalindrome = true;
		}else {
			isPalindrome = false;
		}
		return isPalindrome;
	}
}

