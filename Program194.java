/* 4.Write a java program which accept number of rows and number of cloumns from user and display below pattern.
Input:	iRow=6   iCol=6
Output:	
*       *       *       *       *       *
*       #       #       #       *       *
*       #       #       *       $       *
*       #       *       $       $       *
*       *       $		$		$       *
*       *       *       *       *       *

*/

import java.util.*;
class PatternX
{ public int iRow=0,iCol=0;
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		 iRow=sobj.nextInt();
		
		System.out.println("Enter number of columns");
	 iCol=sobj.nextInt();
		
	}
}

class PatternDemo extends PatternX
{
	public void Pattern()
	{
		for(int i=iRow;i>0;i--)
		{
			for(int j=1;j<=iCol;j++)
			{
				if(i==j||i==iRow||j==iCol||j==1||i==1)
				{
					System.out.printf("*\t");
				}
				else if(i>j)
				{
					System.out.printf("#\t");
				}
				else
				{
					System.out.printf("$\t");
				}
			}
			System.out.println("");
		}

	}
}

class Program194
{
	public static void main(String arg[])
	{
		
		PatternDemo pobj=new PatternDemo();
		pobj.Accept();
		pobj.Pattern();
	}
}
