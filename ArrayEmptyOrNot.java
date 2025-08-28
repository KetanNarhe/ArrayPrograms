package Array;

public class ArrayEmptyOrNot {

	public static void main(String[] args) {
		
		
		int arr1[]= {1,2,3,4,5};
		
		int arr2[]= {};
		
		if(arr1.length==0)
		{
			System.out.println("Array 1 is  empty");
		}
		else
		{
			System.out.println("Array 1 is  not empty");
		}
		
		if(arr2.length==0)
		{
			System.out.println("Array 2 is empty");
		}
		else
		{
			System.out.println("Array 2 is not empty");
		}

	}

}
