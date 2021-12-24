/* 5. Write java program which accept N numbers from user and return product of all odd elements.
Input : N : 6
Elements :15 66 3 70 10 88
Output: 45
*/
import java.util.*;

class Number
{
	int Arr[];
	public Number(int iSize)
	{
		Arr=new int[iSize];
	}
	public void Accept()
	{
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the elements");
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	
}
class NumberDemo extends Number
{
	public NumberDemo(int iSize)
	{
		super(iSize);
	}
	
	public int Product()
	{
		int iMult=1;
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]%2)!=0)
			{
				iMult=iMult*Arr[iCnt];
			}
		}
		return iMult; 
	}
}

class Program165
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int iLength=sobj.nextInt();
		
		NumberDemo dobj=new NumberDemo(iLength);
		dobj.Accept();
		iRet=dobj.Product();
		System.out.println("Product of all odd element is : "+iRet);
	}
}