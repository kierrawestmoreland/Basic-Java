package interviewPrep;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter in the max number of elements for your  to create a multiplication table.");
		 
		int i = scanner.nextInt();
		
		int[] x = new int[i + 1];
		
		try {
			
		for(int k = 1; k <= x.length; k++){
			x[k] = k;
			
			for(int l = 0; l <= x.length; l++){
				
				System.out.print(x[k]*l + " ");
			}
			System.out.println();
		}
		} catch (Exception e) {
			
		}
	}
}
