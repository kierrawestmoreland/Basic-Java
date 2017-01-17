package interviewPrep;

public class PerfectNumber {
//perfect number is when all the factor of a number are summed, they equal the number (6 -> 1 + 2 + 3)
	
	public static void main(String[] args) {
		int n = 28;
		boolean check = isPerfect(n);
		
		if(check){//if check is true
			System.out.println("This is a perfect number");
		}else{
			System.out.println("This is not a perfect number");
		}
	}

	private static boolean isPerfect(int n) {		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i = 0; i < n; i++){
			
			if(n%i == 0){//if i is a factor of n
				sum = sum + i;
				//or sum += i;
			}
		}
		
		if (sum == n){
			return true;
		}
		return false;
	}
}
