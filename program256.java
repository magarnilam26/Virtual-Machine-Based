
import java.util.*;

class myArray
{
	public void ReverseArray(int arr[])
	{
		int size=arr.length,iRev=0;
		
		for(int i=0;i<size;i++)
		{
			int iNo=arr[i];
			
			while(iNo>0)
			{
				int iDigit=iNo%10;
				iRev=iRev*10+iDigit;
				iNo=iNo/10;
			}
			arr[i]=iRev;
				iRev=0;
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t",arr[i]);
		}
		
		
	}
}

class program256
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
		obj.ReverseArray(arr);
		
	}
}