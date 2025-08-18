package Array;

public class EvenCountSum {

	public static void main(String[] args) {
		
		 int arr[]= {3,4,5,6,7,9,8,2,10};
			
		 int sum=0;
		 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
				
			}   
		}
		System.out.println("Even Count is "+sum);


	}

}
