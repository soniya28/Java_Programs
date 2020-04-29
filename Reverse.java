/*=================================================
problem statement:Reverse the string.
=================================================*/

import java.util.Scanner;

class Reverse 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string :");
		String string=input.nextLine();
		int size=string.length();
		char[] string1=new char[size];
		int j=0;
		for(int i=size-1;i>=0;i--)
		{
			string1[j]=string.charAt(i);
			j++;
		}	
		String string2="";
		string2=string2.copyValueOf(string1,0,size);
		System.out.println(string2);
	}
}