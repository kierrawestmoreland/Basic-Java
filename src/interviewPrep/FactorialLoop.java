package interviewPrep;

public class FactorialLoop {
//pg51 of cracking the code 
	
	public static void main(String[] args) {
		System.out.println("The factorial of is " + factorial(6));
		
	}
	
	public static int factorial(int n){
		if( n < 0 ){
			return -1;
		}else if( n == 0){
			return 1;
		}else{
			return n * factorial(n-1); //this is recursion
		}
		
	}
}
