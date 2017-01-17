package interviewPrep;

import java.util.Scanner;

public class ArmstrongNumber {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Please enter in a number.");
		int number = input.nextInt();
		int initial = number;// to hold th eoriginal value
		
		int remainder, sum=0;
	
		
		while (number > 0){
			remainder = number % 10;
			number = number / 10;
			sum = sum + (remainder * remainder * remainder);
		}
		
		if (initial == sum){
			System.out.println("This is an Armstrong Number!");
		}else {
			System.out.println("This is NOT an Armstrong Number");
		}
		
	}
}
