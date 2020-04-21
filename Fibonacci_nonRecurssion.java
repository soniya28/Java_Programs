/*=======================================================================
Problem statement:Fibonacci series (Non_recurssive).
=======================================================================*/
import  java.util.Scanner;

class Fibonacci_nonRecurssion
{
	public static void main(String[] args)
	{
	int []fibo;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number :");
	int size=input.nextInt();
	fibo=new int[size];
	fibo[0]=1;
	fibo[1]=1;
	for(int i=2;i<size;i++)
	{
	fibo[i]=fibo[i-1]+fibo[i-2];
	}
	System.out.println("Fibonacci Series :");
	for(int i=0;i<size;i++)
	{
	System.out.println(fibo[i]+" ");
	}
	}
}
