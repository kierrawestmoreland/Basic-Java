package interviewPrep;

import java.util.Scanner;

public class PalindromeNumber {

	private static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
		System.out.println("Please enter in a number");
		
		int originalNumber = input.nextInt();
		int remainder = 0, reverse = 0;
		System.out.println("The number you entered is " + originalNumber);
		

		int number = originalNumber;
		
		
		while(originalNumber > 0){ //remainder is 0 -- reverse is 0
			remainder = originalNumber % 10; //remainder is 1 -- reverse is 1
			reverse = (reverse *10) + remainder;//remainder is 1 -- reverse is 0*10 + 1 = 1
			originalNumber = originalNumber/10; //originalNum is 12
			//pop originalNumber == 12 back in while loop to go through same thing
		}
		
		if(number == reverse){
			System.out.println(number + " IS a Palindrome number!");
		}else{
			System.out.println(number + "is NOT a Palindrome number!");
		}
		
	}
	
	
		
		
	
}
