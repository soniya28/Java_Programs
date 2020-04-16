/*===========================================
Problem statement:Accept one character from user andconvert case of that character.
============================================*/

import java.util.Scanner;

class Upper
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	char ch;
	System.out.println("Enter the character:");
	ch=input.next().charAt(0);
	int n=ch;
	if(n>90)
	{
	n=n-32;
	ch=(char)n;
	System.out.println("'"+ch+"'");
	}
	else
	{
	n=n+32;
	ch=(char)n;
	System.out.println(ch);
	}
	}
}