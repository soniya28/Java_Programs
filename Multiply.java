/*============================================================
Problem statement:write a program which accept number from user
 and display its multiplication of factors.
============================================================*/

import java.util.Scanner;

class Multiply
{
	public static void main(String[] args)
	{
	int n,m=1;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value:");
	n=input.nextInt();
	for(int i=1;i!=n;i++)
	{
	if(n%i==0)
	{
	m=i*m;
	}
	}
	System.out.print("Multiplication of factors of "+n+" is "+m);
	}
}