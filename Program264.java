import java.util.*;

class MyArray
{
	public void Pattern(int Arr[])
	{
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]%2==0)
			{
				for(int j=0;j<Arr[i];j++)
				{
					System.out.printf("*\t");
				}
				System.out.println();
			}
		}
	}
}

class Program264
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		
		int arr[]=new int[iSize];
		
		System.out.println("Enter the array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		MyArray obj=new MyArray();
		obj.Pattern(arr);
	}
}