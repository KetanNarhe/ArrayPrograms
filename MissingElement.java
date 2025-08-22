package Array;

public class MissingElement {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,5};
		
		int num=5;
		
	
		
		int expenum=num*(num+1)/2;
		
		int actualsum=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			actualsum+=arr[i];
			
			
		}
		
		int missing=expenum-actualsum;

		
		System.out.println("Missing number is "+missing);

	}

}
