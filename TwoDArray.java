package Array;

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		
		int arr[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Value");
	
		
		int count=0;
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
				  System.out.print(arr[i][j]+" ");
				 
				  count++;
			  }
			  System.out.println();
		  }
		  System.out.println("Total count is" + count);
		 
	}

}
