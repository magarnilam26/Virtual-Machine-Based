/* 1.Write a java program which accept number from user and return the count of even digits.
Input : 2395			Input : 1018
Output:1			Output : 2
Input : -1018			Input : 8462
Output : 2			Output : 4
*/
import java.util.*;

class Digit
{
	public int CountEven(int iNo)
	{
		int iDigit=0,iCnt=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
	
}

class Program156
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		Digit dobj=new Digit();
		iRet=dobj.CountEven(iValue);
		
		System.out.println("Count of even digit is:"+iRet);
	}
}