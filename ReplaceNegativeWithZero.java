package Array;

import java.util.Arrays;

public class ReplaceNegativeWithZero {

	public static void main(String[] args) {
	
		int arr[]= {2,-1,3,-5,7,-4,9,-6};
		
		System.out.println("Original Array"+Arrays.toString(arr));
		
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<0)
			 {
				 arr[i]=0;
			 }
		 }
		 
		 System.out.println("Modified array"+Arrays.toString(arr));

	}

}
