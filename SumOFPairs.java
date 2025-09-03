package Array;

import java.util.Scanner;

public class SumOFPairs {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		
		System.out.println("Enter element of  array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the sum to find");
		int sum=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+" " + arr[j]+" = "+sum);
				}
			}
		}
		
	}

}
