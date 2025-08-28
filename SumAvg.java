package Array;

public class SumAvg {

		public static void main(String[] args) {
			
			
			int arr[]= {5,4,3,2,1};
			
			int sum=0;
		
			for(int i=0;i<arr.length;i++)
			{
			    sum=sum +arr[i];
			    
				
				
			}	

			int avg=sum/arr.length;
			
			System.out.println("Sum of all elements "+sum);
			System.out.println("Average of elements "+avg);


		

	}

}
