package Array;

import java.util.Arrays;

public class PositiveNegative {
	
	public static void main(String[] args) {
		
		int arr[]= {-1,-4,5,-7,9,2,0,-8,3};
		
		segreagate(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	
	public static void segreagate(int arr[])
	{
		int i=0, j=arr.length-1;
		
		while(i<j)
		{
			while(arr[i]<0)
			{
				i++;
			}
			while(arr[j]>=0)
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}
	
}
	


