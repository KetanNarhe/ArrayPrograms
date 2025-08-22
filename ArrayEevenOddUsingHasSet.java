package Array;

import java.util.HashSet;
import java.util.Set;

public class ArrayEevenOddUsingHasSet {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6,7,8,9,10};
		
		                                         
		Set<Integer>Even =new HashSet<>();
		
		Set<Integer>Odd =new HashSet<>();
		
		int Ecount=0;
		int Ocount = 0;
		
		for(int i=0;i<=a.length-1;i++)
		{
	
			
			if(a[i] % 2==0)
			{
				Even.add(i);
				Ecount++;
			}
			else
			{
				Odd.add(i);
				Ocount++;
			}
		}
		System.out.println("Even NUmber:"+Even+" "+Ecount);
	   System.out.println("Odd Number"+Odd+" "+Ocount);
		
		

	}
}
