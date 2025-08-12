package Array;

import java.util.Arrays;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		int arr1[]= {2,4,6,4,2,7,3,9,3,2,3};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				//if(arr1[i]==arr1[j])
				if(arr1[i]==arr1[j] &&(i!=j))
				{
				 System.out.println(arr1[i]);
				}
			}
		}

	}

}
