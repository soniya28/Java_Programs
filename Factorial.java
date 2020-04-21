/*===================================================================
problem statement:Display the factorial of given number. 
====================================================================*/
import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in); 
	System.out.println("Enter the number :");
	int num=input.nextInt();
	int result=fact(num);
	System.out.println("Factorial of number "+num+" is "+result);
	}
	static int fact(int num)
	{
	if(num==1)
	{
	return 1;
	}
	else
	{
	return num*fact(num-1);
	}
	}
}
