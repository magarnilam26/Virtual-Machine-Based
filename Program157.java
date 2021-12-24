/* 2.Write a java program which accept number from user and return the count of  odd digits.
Input : 2395			Input : 1018
Output:3			Output : 0
Input : -1018			Input : 8462
Output : 2			Output : 0
*/
import java.util.*;

class Digit
{
	public int CountOdd(int iNo)
	{
		int iDigit=0,iCnt=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if((iDigit%2)!=0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
	
}

class Program157
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		Digit dobj=new Digit();
		iRet=dobj.CountOdd(iValue);
		
		System.out.println("Count of odd digit is:"+iRet);
	}
}