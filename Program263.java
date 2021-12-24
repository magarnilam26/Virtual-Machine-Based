import java.util.*;

class MyArray
{
	public int Diffrence(char Arr[])
	{
		int iCnt=0,Cnt=0;
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='A')&&(Arr[i]<='Z'))
			{
				iCnt++;
			}
			if((Arr[i]>='a')&&(Arr[i]<='z'))
			{
				Cnt++;
			}
			
		}
		return iCnt-Cnt;
	}
}

class Program263
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
		
		MyArray obj=new MyArray();
		int iCnt=obj.Diffrence(arr);
		System.out.println("Diffrence is : "+iCnt);
	}
}