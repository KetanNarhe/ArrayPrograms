package Array;

import java.util.Scanner;

public class DeleteEle {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of array");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		
		
		System.out.println("Enter " + num +" elemnts");
		
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	       System.out.println("Enter element to delete");
	       int delete=sc.nextInt();
	       
	       int count=0;
	       
	       
	       for(int i=0;i<num;i++)
	       {
	    	   if(arr[i]==delete)
	    	   {
	    		   for(int j=i;j<num-1;j++)
	    		   {
	    			   arr[j]=arr[j+1];
	    		   }
	    		   count++;
	    		   
	    		     num--;
	    		   //i--;
	    	   }
	       }

	       if(count==0)
	       {
	    	   System.out.println("element not found");
	       }
	       else
	       {
	    	    for(int i=0;i<num;i++)
	    	    {
	    	    	System.out.println(arr[i]);
	    	    }
	       }
	}

}
