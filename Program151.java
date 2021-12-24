/* 1. Write Java program which accept N numbers from user and return difference between summation of even elements and summation of
odd elements.
	Input : N : 6
	Elements :85 66 3 80 93 88
	Output : 53 (234 - 181)
*/
import java.util.*;

class ArrayX
{
	int iCnt=0,Arr[];
	public ArrayX(int iSize)
	{
		Arr=new int[iSize];
	}
	public void Accept()
	{
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the elements");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
}
class ArrayDemo extends ArrayX
{
	int iCnt=0,iSum=0,iSum1=0;
	public ArrayDemo(int iValue)
	{
		super(iValue);
	}
	public int Difference()
	{
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]%2==0)
			{
				iSum=iSum+Arr[iCnt];
			}
			else
			{
				iSum1=iSum1+Arr[iCnt];
			}
		}
		return iSum-iSum1;
	}
}

class Program151
{
	public static void main(String arg[])
	{
		int iLength=0,iRet=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		iLength=sobj.nextInt();
		
		ArrayDemo dobj=new ArrayDemo(iLength);
		dobj.Accept();
		iRet=dobj.Difference();
		System.out.println("Difference is:"+iRet);
		
	}
}