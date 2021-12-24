/* 4. Write java program which accept N numbers from user and accept Range, Display all elements from that range
Input : N : 6
Start: 60
End : 90
Elements :85 66 3 76 93 88
*/
import java.util.*;

class Number
{
	int Arr[],iStart=0,iEnd=0;
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
		
		System.out.println("Enter number Start number");
		iStart=sobj.nextInt();
		
		System.out.println("Enter number End number");
		iEnd=sobj.nextInt();
	}
	
}
class NumberDemo extends Number
{
	public NumberDemo(int iSize)
	{
		super(iSize);
	}
	
	public void Display()
	{
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]>iStart)&&(Arr[iCnt]<iEnd))
			{
				System.out.println("Elements from range is: "+Arr[iCnt]);
			}
		}
	}
}

class Program164
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int iLength=sobj.nextInt();
		
		NumberDemo dobj=new NumberDemo(iLength);
		dobj.Accept();
		dobj.Display();
		
	}
}