package Array;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30,30,30,40,50};
		
		int delete=30;
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(delete==arr[i])
			{
			  
				
				
				for(int j=i;j<arr.length-1;j++)
				{
				   arr[j]=arr[j+1];
				 }
				
				 count=count+1;
				 
				 break;
	}
		}

		 if(count==0)
		 {
			 System.out.println("Element not found");
		 }
		 else
		 {
			 for(int i=0;i<arr.length-1;i++)
			 {
			 
			 System.out.println(arr[i]+" ");
		 }
				
		}		
				
	 }
	}
