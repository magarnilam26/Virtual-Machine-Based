import java.util.*;

class MyArray
{
	public int ArrayCountVowels(char Arr[])
	{
		int iCnt=0;
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]=='a'||Arr[i]=='e'||Arr[i]=='i'||Arr[i]=='o'||Arr[i]=='u'||Arr[i]=='A'||Arr[i]=='E'||Arr[i]=='I'||Arr[i]=='O'||Arr[i]=='U')
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

class Program261
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
		int iCnt=obj.ArrayCountVowels(arr);
		System.out.println("Number of vowels is : "+iCnt);
	}
}