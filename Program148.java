/* 3. Write a java program which accept string from user and return
difference between frequency of small characters and frequency
of capital characters.
*/
import java.util.*;

class StringX
{
	public String str;
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		 str=sobj.nextLine();
	}
}
class StringDemo extends StringX
{
	public int CountDiff()
	{
		int iCnt=0,i=0,iCnt1=0;
		char Arr[]=str.toCharArray();
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='a')&&(Arr[i]<='z'))
			{
				iCnt++;
			}
			else
			{
				iCnt1++;
			}
		}
		return iCnt-iCnt1;
	}
}

class Program148
{
	public static void main(String arg[])
	{
		int iRet=0;
		StringDemo dobj=new StringDemo();
		dobj.Accept();
		iRet=dobj.CountDiff();
		
		System.out.println("Difference from small and capital character is : "+iRet);
	}
}