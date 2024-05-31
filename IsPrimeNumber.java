package week1.homeassignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=22;
		boolean prime = false;

			//check from 2 to n-1
			for (int i=2;i<=num/2;i++) {
			if (num%i==0) {
				prime =true;
				break;
			}
			}
			
			if (prime!=true)
			System.out.println(num +" is a prime number");
			else
				System.out.println(num + "is not a prime number");
		
	}
	
}