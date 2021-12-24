/* 3. Write Java program which accept N numbers from user and display all such elements which are even and divisible by 5.
Input : N : 6

Elements :85 66 3 80 93 88

Output : 80
*/
import java.util.*;

class ArrayX
{
	public int Arr[];
	public ArrayX(int iSize)
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
	}
}
class ArrayDemo extends ArrayX
{
	public ArrayDemo(int iValue)
	{
		super(iValue);
	}
	public void Difference()
	{
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]%2==0)&&(Arr[iCnt]%5==0))
			{
				System.out.println("Number which are even and divisible by 5 is:"+Arr[iCnt]);
			}
		}
		
	}
}

class Program153
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int iLength=sobj.nextInt();
		
		ArrayDemo dobj=new ArrayDemo(iLength);
		dobj.Accept();
		dobj.Difference();
		
		
	}
}