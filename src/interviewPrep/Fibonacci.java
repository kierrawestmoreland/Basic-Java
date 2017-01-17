package interviewPrep;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int first = 1;
	int second = 0;
	int next;
	
	System.out.println("Enter the number of terms for Fibonacci sequence");
	int numberOfElements = scanner.nextInt();
	
	System.out.println(first + ", " + second);
	
	for(int elementCount = 3; elementCount <= numberOfElements; elementCount++){

		next = first + second;
		
		System.out.println();
		first = second; 
		second = next;
	}
	
	}
}
