package Array;

import java.util.HashSet;
import java.util.Set;

public class CoommonUsintTwoArray {

	public static void main(String[] args) {
	
		
		int arr1[]= {10,20,30,50,60};
		int arr2[]= {70,30,20,80,90};
		
		
		
		Set<Integer>Set1 =new HashSet<>();
		Set<Integer>Common =new HashSet<>();
	  
		
        for(int no:arr1)
        {
           	Set1.add(no);
           	
        }	
        
        for(int no:arr2)
        {
          if(Set1.contains(no))
          {
        	  Common.add(no);
          }
        }
        
        System.out.println(Common);
        
        }
       
       
   	}


