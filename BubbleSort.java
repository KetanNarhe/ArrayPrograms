package DsaAlgorithum;

public class BubbleSort {

	public static void main(String[] args) {


		int arr[]= {5,2,7,3,8,4,9};
		
		int n=arr.length;
		
		boolean isswapped=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					isswapped=true;
				}
			}
			
			if(isswapped)
			{
			   break;
			}
		}
		
		
		
		   System.out.println("Sorted Array");
		   
		   for(int no:arr)
		   {
			   System.out.println(no);
		   }

	}

}
