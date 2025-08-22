package Array;

import java.util.Scanner;

public class SumOfBorderElement2DArray {

	public static void main(String[] args) {
	
int arr[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Value");
	
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		  for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr[i].length;j++)
			  {
				  if(i==0 || j==0 || i==arr.length-1 || j==arr[i].length-1)
				  {
					  sum+=arr[i][j];
				  }
			  }
		  }
		 
		  System.out.println("Total sum is " + sum);
		 

	}

}
