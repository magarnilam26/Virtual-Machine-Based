/* 1. Write Java program which accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 
A B C D
A B C D
A B C D
A B C D
*/
import java.util.*;

class PatternX
{
	public int iRow=0,iCol=0;
		public void Accept()
		{
			Scanner sobj=new Scanner(System.in);
			
			System.out.println("Enter number of rows");
			 iRow=sobj.nextInt();
			
			System.out.println("Enter number of columns");
			iCol=sobj.nextInt();
		}
}
class Pattern extends PatternX
{
	public void Pattern()
	{
		char ch='A';
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++,ch++)
			{
				System.out.printf("%c\t",ch);
			}
			System.out.printf("\n");
			ch='A';
		}
	}
}

class Program171
{
	public static void main(String arg[])
	{
		Pattern pobj=new Pattern();
		pobj.Accept();
		pobj.Pattern();
	}
}