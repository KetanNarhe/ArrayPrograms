package Array;

import java.util.Scanner;

public class RowColumWisheSum {

	public static void main(String[] args) {
		
	int arr[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Value");
	
		int Totalsum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		 
		  
		  
		  for(int i=0;i<arr.length;i++)
		  {  
			  int rowSum=0;
			  
			  for(int j=0;j<arr[i].length;j++)
			  {
				  System.out.print(arr[i][j]+" ");
				 
				  rowSum+=arr[i][j];
				  Totalsum+=arr[i][j];
			  }
			  System.out.println("Rowsum is " +rowSum);
			 
		  }
		     
		  
		  for(int j=0;j<arr[0].length;j++)
		 
		  {  
			  int ColSum=0;
			  
			  for(int i=0;i<arr.length;i++)
			  {
				  
				    ColSum+=arr[i][j];
			  }
			  System.out.println("Column is " + j + " " + ColSum);

             
			  
		  }
		  
		  System.out.println("Totalsum is "+Totalsum);
	}
	 

}




