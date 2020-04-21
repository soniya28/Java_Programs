/*================================================================================
problem statement:Take the number as a input from user and check if it is a 
		  amstrong number.(Amstrong number a number whose sum of cube of 
		  its all digits is equal to given number.EX.abc is a number.
		  a^3+b^3+c^3=abc).
=================================================================================*/
import java.util.Scanner;

class Amstrong
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=input.nextInt();
	int temp=num;
	int []reverse=new int [20];
	int j=0,result=0;
	while(temp!=0)
	{
	reverse[j]=temp%10;
	j++;
	temp=temp/10;
	}
	for(int i=0;i<j;i++)
	{
	result=reverse[i]*reverse[i]*reverse[i]+result;
	}
	if(result==num)
	{
	System.out.println("The number is Amstrong number!!");
	}
	else
	{
	System.out.println("The number is not Amstrong number!!");
	}
	}

}
