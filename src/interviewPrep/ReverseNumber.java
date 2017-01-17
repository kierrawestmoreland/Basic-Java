package interviewPrep;

import java.util.Scanner;

import org.omg.CORBA.portable.RemarshalException;

public class ReverseNumber {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number to reverse: ");
	System.out.println();
	
	int original = scanner.nextInt();
	System.out.println("You entered: "+ original);
	int reverse = 0;
	int remainder;
	
	while (original != 0){
		
		remainder = original % 10;// 2 // 4 // 5
		reverse = reverse * 10 + remainder;// 2 // 24 // 245
		original = original / 10;// 54 // 5 // 0
	}
	 System.out.println("The reverse is: " + reverse);
	
	}
}
