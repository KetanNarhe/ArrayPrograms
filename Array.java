package Array;

public class Array {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String name[]= {"ketan","prashant","rushi","akshay"};
		{
			for(int i=0;i<name.length;i++)
			{
				System.out.println(name[i]);
				if(i<name.length-1)
				{
					System.out.println(i);
				}
			}
		}

	}

}
