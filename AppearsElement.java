package Array;

import java.util.HashSet;
import java.util.Set;

public class AppearsElement {

	public static void main(String[] args) {
		
		int arr[]= {2,4,2,3,3};
		
		Set<Integer> Appears=new HashSet<>();
		
		Set Duplicate=new HashSet<>();
		
		for(int no:arr)
		{
		if(!Appears.add(no))
		{
			Duplicate.add(no);
		
		}
	}
		Appears.removeAll(Duplicate);
		
		System.out.println(Appears);
	
	}
}
