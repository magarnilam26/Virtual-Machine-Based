
import java.util.*;

class myArray
{
	public boolean ChkPallindrome(int arr[])
	{
		int size=arr.length,iRev=0;
		boolean flag=false;
		
		for(int i=0;i<size;i++)
		{
			int iNo=arr[i];
			
			while(iNo>0)
			{
				int iDigit=iNo%10;
				iRev=iRev*10+iDigit;
				iNo=iNo/10;
			}
			
			if((arr[i]!=arr[size-i-1])&&(iRev!=arr[i]))
			{
				flag=true;
				break;
			}
			
		}
		return flag;
		
		
	}
}

class program255
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
		boolean bRet=obj.ChkPallindrome(arr);
		if(bRet==true)
		{
			System.out.println("Elements are not pallindrome");
		}
		else
		{
			System.out.println("Elements are pallindrome");
		}
		
		
	}
}