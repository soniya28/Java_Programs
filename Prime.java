/*==============================================================================
Problem Statement:Check input number is prime or not.Display appropriate msg.
==============================================================================*/
import java.util.Scanner;

class Prime
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value:");
	int num=input.nextInt();
	int flag=0;
	for(int i=2;i<10;i++)
	{
		if(num%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("The number is prime!!");
	}
	else
	{
		System.out.println("The number is not a prime!!");
	}
	}
}
