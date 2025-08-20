package Array;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElelemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[]= {5,4,8,9,3,2,4,11,34,56,3,11};
		
		System.out.println("Duplicate elementts are");
		
		Set<Integer>sh=new HashSet<>();
		
		for(int no:arr)
		{
			if(sh.add(no)==false)
			{
				System.out.println(no);
				break;
			}
		}
	}

}
