package Array;

public class MinMaxElementUsingFunction {

	public static void main(String[] args) {


		int arr[]= {10,20,30,40,50};
		
		int min=FindMin(arr);
		
		int max=FindMax(arr);    
		
		
		System.out.println("Maximum element "+min);
		System.out.println("Minimum element "+max);
                           
	}
	
	public static int FindMin(int arr[])
	{
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	public static int FindMax(int arr[])
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

}
