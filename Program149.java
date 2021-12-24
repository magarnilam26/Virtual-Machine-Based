/* 4. Write a java program which accept string from user and check
whether it contains vowels in it or not.
*/
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
	public boolean ChkVowel()
	{
		boolean flag=false;
		int iCnt=0;
		char Arr[]=str.toCharArray();
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]=='a')||(Arr[iCnt]=='e')||(Arr[iCnt]=='i')||(Arr[iCnt]=='o')||(Arr[iCnt]=='u')||(Arr[iCnt]=='A')||(Arr[iCnt]=='E')||(Arr[iCnt]=='I')||(Arr[iCnt]=='O')||(Arr[iCnt]=='U'))
			{
				flag=true;
				break;				
			}
		}
		return flag;
	}
}

class Program149
{
	public static void main(String arg[])
	{
		boolean bRet=false;
		StringDemo dobj=new StringDemo();
		dobj.Accept();
		bRet=dobj.ChkVowel();
		
		if(bRet==true)
		{
			System.out.println("It contains vowels");
		}
		else
		{
			System.out.println("It does not contains vowels");
		}
	}
}