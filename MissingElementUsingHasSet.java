package Array;

import java.util.HashSet;
import java.util.Set;

public class MissingElementUsingHasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,5};
		
		int n=5;
		
		
		Set<Integer> Missing= new HashSet<>();
		
		for(int no:arr)
		{
			Missing.add(no);
		}
		
		
		for(int i=1;i<=n;i++)
		{
			if(!Missing.contains(i))
			{
				System.out.println("Missing elelemnt is "+i);
			}
		}
		
		
		
	}

}
