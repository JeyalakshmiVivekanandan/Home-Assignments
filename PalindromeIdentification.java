package week1.homeassignments;

public class PalindromeIdentification {

	public static void main(String[] args) {
		int input= 12345;
		int output = 0;
	
		
		for (int i=input; i!=0; i=i/10) {
			//121/10=12, 12%10=2, 
			int rem = i % 10;
			output = output *10 + rem;	
		}
	if (input==output) 
		System.out.println(input+ " is palindrome");
		else
			System.out.println(input+ " is not palindrome");
	}
		
	

}
