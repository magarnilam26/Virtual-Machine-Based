import java.util.*;

class MyArray
{
	public void Percentage(float Arr[])
	{
		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]<35)
			{
				Arr[i]="Fail";
			}
			
			else if(Arr[i]<50)
			{
				Arr[i]="Pass Class";
			}
		
			else if(Arr[i]<60)
			{
				Arr[i]="Second Class";
			}
		
			else if(Arr[i]<70)
			{
				Arr[i]="First class";
			}
			
			else if(Arr[i]>70)
			{
				Arr[i]="First class with Distinction";
			}
			
		}
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
			
	}
}

class program259
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		
		float arr[]=new float[iSize];
		
		System.out.println("Enter the array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextFloat();
		}
		
		MyArray obj=new MyArray();
		obj.Percentage(arr);
	}
}