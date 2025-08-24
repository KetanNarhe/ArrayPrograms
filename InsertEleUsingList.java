package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertEleUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer arr[]= {1,2,3,5,7};
		
		ArrayList<Integer> List= new ArrayList<>(Arrays.asList(arr));
		
	
		
		List.add(3,4);
		List.add(5,6);
		
		System.out.println(List);
	}

}
