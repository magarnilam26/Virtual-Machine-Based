/* 4.Write a program which accept number from user and return multiplication of all digits.
Input : 2395		Input : 1018
Output : 270		Output : 8
Input : 9440		Input : 922432
Output : 144		Output : 864
*/
import java.util.*;

class Digit
{
	public int Multiply(int iNo)
	{
		int iDigit=0,iMult=1;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit!=0)
			{
				iMult=iMult*iDigit;
			}
			iNo=iNo/10;
		}
		return iMult;
	}
	
}

class Program159
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		Digit dobj=new Digit();
		iRet=dobj.Multiply(iValue);
		
		System.out.println("Multiplication of all digit is::"+iRet);
	}
}