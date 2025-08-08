package Array;

import java.util.Arrays;

public class SecondMaxElemnt {

	public static void main(String[] args) {
		
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MAX_VALUE;
		
		int arr[]= {1,2,3,4,5,6,7,8,9,8};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
		
				secondmax=max;
				max=arr[i];
				
			}
			if(arr[i]>secondmax && arr[i]!=max)
			{
				 secondmax=arr[i];
			}
		}
		System.out.println("second max element is "+secondmax);

	}

}
