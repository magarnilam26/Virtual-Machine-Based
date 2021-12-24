/* 3. Write java program which accept N numbers from user and accept one another number as NO , return index of last occurrence of that NO.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88

Output : 3
*/
import java.util.*;

class Number
{
	int Arr[],iNo=0;
	public Number(int iSize)
	{
		Arr=new int[iSize];
	}
	public void Accept()
	{
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the elements");
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		System.out.println("Enter number");
		iNo=sobj.nextInt();
	}
	
}
class NumberDemo extends Number
{
	int iTemp=-1;
	public NumberDemo(int iSize)
	{
		super(iSize);
	}
	
	public int LastOcc()
	{
		for(int iCnt=Arr.length-1;iCnt>=0;iCnt--)
		{
			if(Arr[iCnt]==iNo)
			{
				iTemp=iCnt;
				break;
				
			}
		}
		return iTemp;
	}
}

class Program163
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int iLength=sobj.nextInt();
		
		NumberDemo dobj=new NumberDemo(iLength);
		dobj.Accept();
		iRet=dobj.LastOcc();
		
			System.out.println("Index of Last occurance is: "+iRet);

		
	}
}