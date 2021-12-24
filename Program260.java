import java.util.*;

class MyArray
{
	public void ArrayReplace(char Arr[])
	{
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='A')&&(Arr[i]<='Z'))
			{
					Arr[i]=Character.toLowerCase(Arr[i]);
			}
		}
		for(int i=0;i<Arr.length;i++)
		{
			System.out.printf("%c\t",Arr[i]);
		}
	}
}

class Program260
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		
		char arr[]=new char[iSize];
		
		System.out.println("Enter the array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.next().charAt(0);
		}
		
		MyArray obj=new MyArray();
		obj.ArrayReplace(arr);
	}
}