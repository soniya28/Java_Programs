/*=============================================================
Problem Statement:working of calculator. 
===============================================================*/

import java.util.Scanner;

class Calculator
{
	float num1,num2;
	char op;	
	Calculator(float num1,char op,float num2)
	{
	this.num1=num1;
	this.op=op;
	this.num2=num2;
	}
	public float calculate()
	{
	switch(op)
	{
	case '+':
	return(num1+num2);
	case '-':
	return(num1-num2);
	case '*':
	return(num1*num2);
	case '/':
	return(num1/num2);
	default:
	System.out.println("wrong choice!!");
	return 0;
	}
	}
}

class CalculatorController
{
	public static void main (String args[])
	{
	float num_1,num_2,result;
	char op;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the two numbers with operator (a + b):");
	num_1=input.nextFloat();
	op=input.next().charAt(0);
	num_2=input.nextFloat();
	Calculator obj=new Calculator(num_1,op,num_2);
	result=obj.calculate();
	System.out.println("Result is :"+result);	
	}
}