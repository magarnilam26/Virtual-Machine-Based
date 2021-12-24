
import java.util.*;

class myArray
{
	public void MinArray(int arr1[],int arr2[])
	{
		int min=0;
		min=arr1[0];
		for(int i=0;i<arr1.length;i++)
		{
			
			 if(arr1[i]<min)
			 {
				 min=arr1[i];
			 }
		}
		System.out.println("Minimum element of first array is : "+min);
		
		int iMin=arr2[0]; 
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]<iMin)
			{
				iMin=arr2[i];
			}
		}
		System.out.println("Minimum element of second array is :"+iMin);
	}
}

class program252
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
		obj.MinArray(arr1,arr2);
		
		
	}
}