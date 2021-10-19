import java.util.*;

class Marvellous
{
	public int Addition(int Brr[])
	{
		int iSum=0;
		for(int iCnt=0;iCnt<Brr.length;iCnt++)
		{
			iSum=iSum+Brr[iCnt];
		}
		return iSum;
	}
}

class Program144
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		int iRet=0;
		
		System.out.println("Enter number of elements");
		int iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		
		System.out.println("Enter numbers");
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		Marvellous mobj=new Marvellous();
		iRet=mobj.Addition(Arr);
		
		System.out.println("Addition is:"+iRet);
		
	
	}
}