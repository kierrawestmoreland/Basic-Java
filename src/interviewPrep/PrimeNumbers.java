package interviewPrep;

public class PrimeNumbers {
 
	public static void main(String[] args) {
		int input = 9;
		
		boolean isPrime = true;
		
		for(int i = 2; i < input; i++){
			//start at 2 and end at input - 1 because all prime numbers are divisible by 1 and itself 
			
			if(input % i == 0){
				isPrime = false;
				System.out.println(input + " Is a not Prime Number.");
				break;
			}
		}
		
		if(isPrime){
			System.out.println(input + " Is a Prime Number.");
		}/*else{
			System.out.println(input + " Is a not Prime Number.");
		}*/
	}
}
