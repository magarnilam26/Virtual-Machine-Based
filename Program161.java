/* 1. Write java program which accept N numbers from user and accept one another number as NO , check whether NO is present or not.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88

Output : TRUE
*/
import java.util.*;

class Number
{
	int Arr[],iNo=0;
	public Number(int iSize)
	{
		Arr=new int[iSize];
	}
	public void Accept()
	{
		
		Scanner sobj=new Scanner(System.in);
		
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		System.out.println("Enter number");
		iNo=sobj.nextInt();
	}
	
}
class NumberDemo extends Number
{
	boolean flag=false;
	public NumberDemo(int iSize)
	{
		super(iSize);
	}
	
	public boolean Check()
	{
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]==iNo)
			{
				flag=true;
				break;
				
			}
		}
		return flag;
	}
}

class Program161
{
	public static void main(String arg[])
	{
		boolean bRet=false;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int iLength=sobj.nextInt();
		
		NumberDemo dobj=new NumberDemo(iLength);
		dobj.Accept();
		bRet=dobj.Check();
		if(bRet==true)
		{
			System.out.println("number is present");
		}
		else
		{
			System.out.println("Number is not present");
		}
		
	}
}