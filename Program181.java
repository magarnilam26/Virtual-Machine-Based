/* 1.Write a java program which accept string from user and display below pattern.
Input:	Hello
Output:	
H e l l o
H e l l o
H e l l o
H e l l o
*/

import java.util.*;
class PatternX
{
	public String str;
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string");
		str=sobj.next();
	}
}

class PatternDemo extends PatternX
{
	public char Arr[];
	public void Pattern()
	{
		Arr=str.toCharArray();
		int iRow=Arr.length-1;
		int iCol=Arr.length;
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				System.out.printf("\t"+Arr[j]);
			}
			System.out.println("");
		}
	}
}

class Program181
{
	public static void main(String arg[])
	{
		
		PatternDemo pobj=new PatternDemo();
		pobj.Accept();
		pobj.Pattern();
	}
}
