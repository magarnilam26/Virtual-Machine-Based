
import java.util.*;

class myArray
{
	public void Display(int arr1[],int arr2[])
	{
		System.out.println("Contents of first array is :");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.printf("%d\t",arr1[i]);
		}
		
		System.out.println("\nContents of second array is :");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.printf("%d\t",arr2[i]);
		}
	}
}

class program246
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the size of first array");
		int size1=sobj.nextInt();
		
		int arr1[]=new int[size1];
		
		System.out.println("Enter the elements of first array");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sobj.nextInt();
		}
		
		System.out.println("Enter the size of second array");
		int size2=sobj.nextInt();
		
		int arr2[]=new int[size2];
		
		System.out.println("Enter the elements of second array");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sobj.nextInt();
		}
		
		myArray obj=new myArray();
		obj.Display(arr1,arr2);
		
	}
}