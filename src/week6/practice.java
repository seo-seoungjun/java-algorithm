package week6;

import java.util.Scanner;

public class practice {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int number = input.nextInt();
		int[] list = new int[number];
		System.out.println("Enter the list: ");
		for(int i=0; i<number; i++) {
			list[i] = input.nextInt();
		}
		
		int index = partition(list);
		
		System.out.print("After the partition, the list is ");
		for(int i=0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
		
		System.out.print("pivot index is "+index);
		
	}
	public static int partition(int[] list) {
		 int index=0;
		 int start = 0;
		 int end = list.length-1;
		 int pivot = list[start];
		 int left = start+1;
		 int right = end;
		 
		 while(left <= right) {
			 while(list[left] < pivot) {
				 left++;
			 }
			 while(list[right] > pivot){
				 right--;
			 }
			 if(left <=right) {				 
				 practice.swap(list, left, right);
			 }
		 }
		 practice.swap(list, 0, right);
		 index = right;
		 return index;
	}
	
	public static void swap (int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
