/*===========================================
Problem satement:write a program which accept one 
number from user and print that number of even numbers on screen.
=============================================*/

import java.util.Scanner;

class Even
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int n;
	int[]num;
	num=new int [10];
	System.out.println("Enter the number :");
	n=input.nextInt();
	num=even(n);
	for(int i=0;i<n;i++)
	{
	System.out.print(num[i]+" ");
	}
	}
	public static int[] even(int n)
	{
	int j=0;
	int num1[]=new int[10];
	for(int i=1;j<=n;i++)
	{
	if(i%2==0)
	{
	num1[j]=i;
	j++;
	}
	}
	return num1; 
	}
}