package Array;

import java.util.Arrays;

public class LongestSubsequence {

	public static void main(String[] args) {
		
		int arr[]= {4,6,3,3,2,2,9,8,7,7,7,7};
		
		subsequence(arr);
		
		
	}
	
	public static  void subsequence(int arr[])
	{
		Arrays.sort(arr);
		
		int max=0, cnt=0, index = 0;
		
		int i;
		
		for( i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]==arr[i+1])
			{
				cnt++;
				
			}	
			else
			{      
				if(cnt>0)
				{
					if(cnt>max)
					{
						max=cnt+1;
						index=i;
					}
					cnt=0;
					
				}	
			
			}	
			
		}
		System.out.println(arr[index]+ " is repeated for " +max+ " times");
		
	}
  
}
