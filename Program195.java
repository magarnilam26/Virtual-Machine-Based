/* 4.Write a java program which accept number of rows and number of cloumns from user and display below pattern.
Input:	iRow=4   iCol=4
Output:	

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
		if(iCol!=iRow)
		{
			return;
		}
		
		for(int i=1;i<=iRow;i++)
		{
			for(int j=1;j<=iCol;j++)
			{
				if(i==j||i==iRow||j==iCol||j==1||i==1)
				{
					System.out.printf("%d\t",j);
				}
				else
				{
					System.out.printf("\t");
				}
			}
			
			System.out.println("");
		}

	}
}

class Program195
{
	public static void main(String arg[])
	{
		
		PatternDemo pobj=new PatternDemo();
		pobj.Accept();
		pobj.Pattern();
	}
}
