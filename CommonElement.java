package Array;

public class CommonElement {

	public static void main(String[] args) {
		
		int arr1[]= {23,14,22,8,29,12,29};

		int arr2[]= {45,67,29,90,11,22};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+ " ");
				}
			}
		}
	}

}
