package interviewPrep;

public class Swap2Numbers {

public static void main(String[] args) {
	swap2(4, 5);
}
	

public static void swap1(int a, int b){
	
	int holdNumber;//a placeholder during swap
	//wasting memory by creating another variable
	
	holdNumber = a;
	a = b;
	b = holdNumber;
	
	System.out.println("swap 1 -> a is now " + a);
	System.out.println("swap 1 -> b is now " + b);
}

public static void swap2(int a, int b){
	//without creating new variable
	
			  //a = 4; b = 5
	a = a + b;// a = 4 + 5 = 9; a = 9
	b = a - b;// b = 9 - 5 = 4; b = 4
	a = a - b;// a = 9 - 4 = 5; a = 5
	
	System.out.println("swap 2 -> a is now " + a);
	System.out.println("swap 2 -> b is now " + b);
	//this method increases the amount of bits used
}

public static void swap3(int a, int b){
// ^ is XOR where it saves the variables values	
			  //a = 4; b = 5
	a = a^b;//  101 XOR 100 ----> 001
	b = a^b;//  001 XOR 100 ----> 101 --> 5
	a = a^b;//  001 XOR 101 ----> 001 --> 4
	
	System.out.println("swap 2 -> a is now " + a);
	System.out.println("swap 2 -> b is now " + b);
}

}
