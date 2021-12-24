/* 3.Write a java program which accept number from user and return the count of  digits in between 3 and 7.
Input : 2395			Input : 1018
Output:1			Output : 0
Input : 4521			Input : 9922
Output : 2			Output : 0
*/
import java.util.*;

class Digit
{
	public int CountRange(int iNo)
	{
		int iDigit=0,iCnt=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit>3&&iDigit<7)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
	
}

class Program158
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		Digit dobj=new Digit();
		iRet=dobj.CountRange(iValue);
		
		System.out.println("Count of digit in between 3 and 7 is::"+iRet);
	}
}