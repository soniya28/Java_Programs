/*====================================================================
Problem statement:Average of three numbers.
=====================================================================*/

import java.util.Scanner;

class Average
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		float average=(num1+num2+num3)/3;
		System.out.println("Average of three numbers :"+average);
	}
}