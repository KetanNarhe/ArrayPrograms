package Array;

import java.util.HashSet;
import java.util.Set;

public class Union {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {2,3,4,6};
		
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		
		for(int no:set)
		{
			System.out.println(no);
		}
	}

}
