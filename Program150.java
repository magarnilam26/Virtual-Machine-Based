// 5. Write a java program which accept string from user and display it in reverse order.

import java.util.*;

class StringX
{
	public String str;
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		 str=sobj.nextLine();
	}
}
class StringDemo extends StringX
{
	public String Reverse()
	{
		char temp;
		char Arr[]=str.toCharArray();
		int iEnd=Arr.length-1,iStrat=0;
		
		while(iStrat<iEnd)
		{
			temp=Arr[iStrat];
			Arr[iStrat]=Arr[iEnd];
			Arr[iEnd]=temp;
			iStrat++;
			iEnd--;
			
		}
		return new String(Arr);
	}
}

class Program150
{
	public static void main(String arg[])
	{
		StringDemo dobj=new StringDemo();
		dobj.Accept();
		String s=dobj.Reverse();
		
		System.out.println("Reverse string is : "+s);
	}
}