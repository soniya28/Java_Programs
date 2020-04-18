/*====================================================
Problem Statement:Fibonacci series (Recurssive method).
=====================================================*/
import java.util.*;

class Fibonacci
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number :");
	int count=input.nextInt();
	for(int i=1;i<=count;i++)
	{
	System.out.print(fibo(i)+" ");
	}
	}
	static int fibo(int num)
	{
	if(num==1||num==2)
	{
	return 1;
	}
	else
	{
	return fibo(num-1)+fibo(num-2);
	}
	}
}