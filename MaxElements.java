package Array;

public class MaxElements {

	public static void main(String[] args) {
	
      int arr[]= {23,29,22,8,12,10,27};
      int max=Integer.MIN_VALUE;
      
      for(int i=0;i<arr.length;i++)
      {
             if(arr[i]>max)
    		  
    		  
    	  {
    		  max=arr[i];
    		
    	  }
      }
      System.out.println("Max Element is "+max);
      }
	}


