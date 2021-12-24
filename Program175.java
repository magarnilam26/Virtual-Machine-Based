/* 5.Write Java program which accept number of rows and number of columns from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : 
1 2 3 4
5 6 7 8
9 10 11 12
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
		int iCnt=1;
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++,iCnt++)
			{
				
					System.out.printf("%d\t",iCnt);
			}
			System.out.printf("\n");
		}
	}
}

class Program175
{
	public static void main(String arg[])
	{
		Pattern pobj=new Pattern();
		pobj.Accept();
		pobj.Pattern();
	}
}