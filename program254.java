
import java.util.*;

class myArray
{
	public int[] CopyArray(int arr[])
	{
		int size=arr.length;
		int pos=0;

		int arr2[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr2[pos]=arr[i];
			pos++;
		}
		return arr2;
	}
}

class program254
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sobj.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		myArray obj=new myArray();
		int iRet[]=obj.CopyArray(arr);
		
		System.out.println("New array is :");
		for(int i=0;i<iRet.length;i++)
		{
			System.out.printf("%d\t",iRet[i]);
		}
		
	}
}