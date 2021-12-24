/* 4. Write Java program which accept number of rows and number of columns from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : 
* # * #
* # * #
* # * #
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
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				if((j%2)!=0)
				{
					System.out.printf("#\t");
				}
				else
				{
					System.out.printf("*\t");
				}
			}
			System.out.printf("\n");
		}
	}
}

class Program179
{
	public static void main(String arg[])
	{
		Pattern pobj=new Pattern();
		pobj.Accept();
		pobj.Pattern();
	}
}