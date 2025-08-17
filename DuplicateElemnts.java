package Array;

public class DuplicateElemnts {

	public static void main(String[] args) {
		
		
		int arr[]= {2,3,6,8,1,3,5,6,9};
		
		boolean b1[]= new boolean[arr.length];
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(!b1[i])
			{
				int count=1;
				
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						b1[j]=true;
						count++;
					}
					
				}
				if(count>1)
				{
					System.out.println(arr[i]);
				}
			}
		}
		

	}

}
