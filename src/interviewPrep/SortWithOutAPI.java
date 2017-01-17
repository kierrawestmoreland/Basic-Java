package interviewPrep;

import java.util.Scanner;

public class SortWithOutAPI {

	private static Scanner sc = new Scanner(System.in); 
	//need to put private static for it to work in static method without Object
	
	public static void main(String[] args) {
		
		System.out.println("Enter the amount of numbers you want to sort.");
		int numberOfInts = sc.nextInt();
		
		int[] sortedArray = new int[numberOfInts];
		int i, j, temp = 0;
	
		//get all array elements from user...
		System.out.println("Enter " + numberOfInts + " Array ELements: ");
		for(i = 0; i < numberOfInts; i++){
			sortedArray[i] = sc.nextInt();					
		}
		
		//print all Array Elements
		System.out.print("Array elements are: ");
		for(i = 0; i < numberOfInts; i++){
			System.out.print(" " + sortedArray[i]);
		}
		
		//now arrange array in ascending order
		for(i = 0; i < numberOfInts; i++){
			for(j = i + 1; j < numberOfInts; j++){
				if(sortedArray[i] > sortedArray[j]){ 
					temp = sortedArray[i];//start swap w/ temp as value holder
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}
		//Print array in ascending order
		System.out.print("\nThe Array in ascending order is: ");
		for(i = 0; i < numberOfInts; i++){
			System.out.print(sortedArray[i] + " ");
		}
		
		//Now arrange Array in decsending order
		for(i = 0; i < numberOfInts; i++){
			for(j = i + 1; j < numberOfInts; j++){
				if(sortedArray[i] < sortedArray[j]){ 
					temp = sortedArray[i];//start swap w/ temp as value holder
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}
		//Print array in ascending order
		System.out.print("\nThe Array in descending order is: ");
		for(i = 0; i < numberOfInts; i++){
			System.out.print(sortedArray[i] + " ");
		}
	}
	
	
}
