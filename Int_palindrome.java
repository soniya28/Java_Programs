/*================================================================================
Problem Statement:Check input number is palindrome or not.Display appropriate msg.
================================================================================*/		  

import java.util.Scanner;

class Int_palindrome
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value:");	
		int num=input.nextInt();
		int[] reverse=new int[20];
		int i=1,k,j=0;
		while(num!=0)
		{
			reverse[j]=num%10;
			num=num/10;
			j++;
		}
		int size=j,count=0;
		for(i=0,k=size-1;i<=size/2|k>=size-1;i++,k--)
		{
			if(reverse[i]==reverse[k])
			{
			count++;
			}
		}
		if(count==size/2+1)
		{
			System.out.println("Integer string is pallindrome!!");
		}
		else
		{	
			System.out.println("Integer string is not a pallindrome!!");	
		}
	}
}
