package Array;

import java.util.HashSet;

public class DuplicateEleUsingHashset {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 6, 8, 1, 3, 5, 6, 9};
		
		HashSet<Integer> set=new  HashSet<>();
		
		HashSet<Integer> duplicate = new HashSet<>();
		
		
		for(int num:arr)   
		{
			if(!set.add(num))
			{
				duplicate.add(num);
			}
		}
		System.out.println("Duplicate Element:"+duplicate);
		
		// Remove duplicate elemnt of an arrays
		
		 System.out.println("Remove duplicate element:"+set);
		

	}

}
