import java.util.*;

class MyArray
{
	public int Search(char Arr[],char ch)
	{
		int iCnt=0;
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]==ch)
			{
				iCnt++;
			}
			
		}
		return iCnt;
	}
}

class Program262
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		
		char arr[]=new char[iSize];
		
		System.out.println("Enter the array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.next().charAt(0);
		}
		
		System.out.println("Enter the searched character");
		char ch=sobj.next().charAt(0);
		
		MyArray obj=new MyArray();
		int iCnt=obj.Search(arr,ch);
		System.out.println("Number of count is : "+iCnt);
	}
}