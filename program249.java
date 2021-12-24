
import java.util.*;

class myArray
{
	public int[] ArrayConcate(int arr1[],int iSize1,int arr2[],int iSize2)
	{
		int arr3[]=new int[iSize1+iSize2];
		int pos=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[pos]=arr1[i];
			pos++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[pos]=arr2[i];
			pos++;
		}
		return arr3;
	}
}

class program249
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
		int ret[]=obj.ArrayConcate(arr1,size1,arr2,size2);
		System.out.println("New array is : ");
		for(int i=0;i<ret.length;i++)
		{
			System.out.printf("%d\t",ret[i]);
		}
	}
}