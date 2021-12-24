/* 3. Write Java program which accept number of rows and number of columns from user and display below pattern.
Input : iRow = 3 iCol = 5
Output :
A A A A A
B B B B B
C C C C C
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
		for(int i=0;i<iRow;i++,ch++)
		{
			for(int j=0;j<iCol;j++)
			{
				
					System.out.printf("%c\t",ch);
			}
			System.out.printf("\n");
		}
	}
}

class Program173
{
	public static void main(String arg[])
	{
		Pattern pobj=new Pattern();
		pobj.Accept();
		pobj.Pattern();
	}
}