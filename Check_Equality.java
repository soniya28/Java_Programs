/*=============================================================
problem statement:Take 4 numbers as input and check whether the numbers are equal or not.
==============================================================*/
import java.util.Scanner;

class Check_Equality
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int arr[]=new int[4];
		System.out.println("Enter the four numbers:");
		for(int i=0;i<4;i++)
		{
			arr[i]=input.nextInt();
		}
		int flag=1;
		for(int i=0,j=i+1;j<4;)
		{
			if(arr[i]==arr[j])
			{
				j++;
			}
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Numbers are not equal!!");
		}
		else
		{
			System.out.println("Numbers are equal!!");
		}
	}
}