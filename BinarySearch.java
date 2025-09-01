package DsaAlgorithum;

public class BinarySearch {

	public static void main(String[] args) {

      int arr[]= {2, 4, 6, 8, 10, 12, 14};
      
      int target=10;
      
      int Result=binarySearch(arr,target);
      
      if(Result==-1)
      {
    	  System.out.println("Element not found");
      }
      else
      {
    	  System.out.println("Element found at index "+Result);
      }

	}

	
    public static int binarySearch(int arr[],int target)
    {
    	int start=0;
    	int end=arr.length-1;
    	
    	while(start<=end)
    	{
    		int mid=(start+end)/2;
    		
    		if(arr[mid]==target)
    		{
    			return mid;
    		}
    		
    		else if(arr[mid]<target)
    		{
    			start=mid+1;
    		}
    		else
    		{
    			end=mid-1;
    		}
    		
    	}
		return -1;
    	
    }
	
	
}
