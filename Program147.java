/* 2. Write a java program which accept string from user and count
number of small characters.

Input : “Marvellous”

Output : 9
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
	public int CountSmall()
	{
		int iCnt=0,i=0;
		char Arr[]=str.toCharArray();
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='a')&&(Arr[i]<='z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

class Program147
{
	public static void main(String arg[])
	{
		int iRet=0;
		StringDemo dobj=new StringDemo();
		dobj.Accept();
		iRet=dobj.CountSmall();
		
		System.out.println("count of small character is : "+iRet);
	}
}