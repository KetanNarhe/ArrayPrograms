package Array;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int n=arr.length;
		
		int mid=n/2;
		
		
	    int firstHalf[]=new int[mid];
		
		for(int i=0;i<mid;i++)
		{
			firstHalf[i]=arr[i];
		}
		
		int secndHalf[]=new int[n-mid];
		
		for(int i=mid;i<n;i++)
		{
			secndHalf[i-mid]=arr[i];
		}
		
		
       System.out.println(Arrays.toString(firstHalf));
       System.out.println(Arrays.toString(secndHalf));
	}
	


}
