package week1.homeassignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
	int arr[] = {1,4,3,2,8,6,7};
		  
		Arrays.sort(arr);
		// 1,2,3,4,6,7,8
		
		/*for (int i=arr[0]; i<arr.length; i++) {
			if (arr[i+1]!=arr[i]+1) {
			
				System.out.println("Missing number:"+(arr[i]+1));
				break;
			}
			
		}
		
	}*/
		int maxnum = arr[6];
		int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6];
		int missing = (maxnum*(maxnum+1)/2)-sum;
		
		System.out.println(missing);
		


}
}