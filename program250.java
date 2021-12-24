
import java.util.*;

class myArray
{
	public void SumArray(int arr1[],int arr2[])
	{
		int iSum=0,iSum1=0;
		for(int i=0;i<arr1.length;i++)
		{
			 iSum=arr1[i]+iSum;
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			 iSum1=arr2[i]+iSum1;
		}
		System.out.printf("Summation of array is : %d\t%d",iSum,iSum1);
	}
}

class program250
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
		obj.SumArray(arr1,arr2);
		
	}
}