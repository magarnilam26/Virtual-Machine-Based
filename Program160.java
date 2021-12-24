/* 5.Write a program which accept number from user and return difference between summation of even digits and summation of odd
digits.
Input : 2395				Input : 1018
Output : -15 (2 - 17)			Output : 6 (8 - 2)
Input : 8440				Input : 5733
Output : 16 (16 - 0)			Output : -18 (0 - 18)
*/
import java.util.*;

class Digit
{
	public int CountDiff(int iNo)
	{
		int iDigit=0,iSum1=0,iSum2=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iSum1=iSum1+iDigit;
			}
			
			else
			{
				iSum2=iSum2+iDigit;
			}
			iNo=iNo/10;
		}
		return iSum1-iSum2;
	}
	
}

class Program160
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		Digit dobj=new Digit();
		iRet=dobj.CountDiff(iValue);
		
		System.out.println("Difference  is::"+iRet);
	}
}