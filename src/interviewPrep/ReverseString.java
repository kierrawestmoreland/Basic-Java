package interviewPrep;

public class ReverseString {
//without using StringBuffer
	
	public static void main(String[] args) {
		
	
	String str = "My name is Kierra";
	String array[] = str.split(" ");
	String reverse = ""; //used for 2nd way to reverse
	
	for(int i = 0; i<array.length; i++){
		System.out.print(array[i] + " ");
	}
	
	System.out.println(" ");

	for(int i=array.length - 1; i >= 0; i--){//1st way to reverse
		System.out.print(array[i] + " ");
	}
	
	for(int i=array.length - 1; i >= 0; i--){//1st way to reverse
		reverse = reverse + array[i] + " ";
	}
	System.out.println(" ");

	System.out.print("Way #2: " + reverse);
	}	
}
