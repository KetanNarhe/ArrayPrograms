package Array;

import java.util.Scanner;

public class SearchElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		                       
		                                      
		System.out.println("Enter a value");                  
		int ele=sc.nextInt();                                     
		                             
		int []arr= {2,3,5,4,2,7,9};            
		                                   
		
		for(int i=0;i<arr.length;i++)        
		{
			if(arr[i]==ele)      
			{                 
				System.out.println("Element found in index "+i);
				  return;                                                                                 
			}
		}
				System.out.println("Element not found");  
			}
		}
		

