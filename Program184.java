/* 4.Write a java program which accept string from user and display below pattern.
Input:	Hello
Output:	
H e l l o
H e l l
H e l
H e
H
H e 
H e l 
H e l l 
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
	public void Pattern()
	{
		char Arr[]=str.toCharArray();
		for(int i=Arr.length-1;i>=0;i--)
		{
			for(int j=0;j<=Arr.length;j++)
			{
				if(i>=j)
				{
					System.out.printf("\t"+Arr[j]);
				}
			}
			System.out.println("");
		}
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<=Arr.length;j++)
			{
				if(i>=j)
				{
					System.out.printf("\t"+Arr[j]);
				}
			}
			System.out.println("");
		}

	}
}

class Program184
{
	public static void main(String arg[])
	{
		
		PatternDemo pobj=new PatternDemo();
		pobj.Accept();
		pobj.Pattern();
	}
}
