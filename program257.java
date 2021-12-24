import java.util.*;

class MyArray
{
	public void SumArray(int Arr[])
	{
		int iSum=0;
		for(int i=0;i<Arr.length;i++)
		{
			int iNo=Arr[i];
			while(iNo!=0)
			{
				int iDigit=iNo%10;
				iSum=iSum+iDigit;
				iNo=iNo/10;
			}
			Arr[i]=iSum;
			iSum=0;
		}
		
		System.out.println("Addition array element is :");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.printf("%d\t",Arr[i]);
		}
		
	}
}

class program257
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		
		int arr[]=new int[iSize];
		
		System.out.println("Enter the array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		MyArray obj=new MyArray();
		obj.SumArray(arr);
	}
}