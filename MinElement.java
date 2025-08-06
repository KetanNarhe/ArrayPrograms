package Array;

public class MinElement {

	public static void main(String[] args) {
		
		int arr[]= {5,10,20,30,40,50};
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				
				min=arr[i];
			}
			System.out.println("min value is:"+min);
		}

	}

}
