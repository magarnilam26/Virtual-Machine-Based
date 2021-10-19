import java.util.*;

class Program143
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		
		System.out.println("Enter numbers");
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		System.out.println("Entered elements are");
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}