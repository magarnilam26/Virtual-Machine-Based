/* 1.Write a Java program which accept string from user and count
number of capital characters.

	Input : “Marvellous Multi OS”
	Output : 4
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
	public int CountCapital()
	{
		int iCnt=0,i=0;
		char Arr[]=str.toCharArray();
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='A')&&(Arr[i]<='Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

class Program146
{
	public static void main(String arg[])
	{
		int iRet=0;
		StringDemo dobj=new StringDemo();
		dobj.Accept();
		iRet=dobj.CountCapital();
		
		System.out.println("count of capital character is : "+iRet);
	}
}