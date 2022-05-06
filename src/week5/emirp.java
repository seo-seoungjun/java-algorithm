package week5;


public class emirp {
	public static void main(String[] args) {
		int count = 0;
		while(count <= 120) {
			for(int i =1; i<4000; i++) {
				boolean isPrime = isPrime(i);
				boolean isReversePrime = isPrime(palindrome.reverse(i));
				boolean isPalindrome = palindrome.isPalindrome(i);
				if(isPrime && isReversePrime && isPalindrome == false) {
					count++;
					System.out.print(i+" ");
					if(count%10==0) {
						System.out.println();
					}
				}
			}
		}
	}
	public static boolean isPrime(int num) {
		boolean isPrime=true;
		if(num <=1) {
			isPrime= false;
		}else {
			for(int i = 2; i <num; i++) {
				if(num%i ==0) {
					isPrime= false;
					break;
				}
			}
		}
		return isPrime;
	}
}
