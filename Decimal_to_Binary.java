/*=====================================================
Problem Statement:Decimal to binary conversion.
======================================================*/

import java.util.Scanner;

class Decimal_to_Binary
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in); 
		System.out.println("Enter the number:");
		int num=input.nextInt();
		int remainder[];
		int m,i=0;
		for(m=0;m<num;m++)
		{
			if(Math.pow(m,2)>=num)
			{
				break;
			}
		}
		int size=m+1;
		remainder=new int[size];
		while(num!=0)
		{
			remainder[i]=num%2;
			num=(int)num/2;
			i++;
		}
		for(int j=size-1;j>=0;j--)
		{
			System.out.print(remainder[j]);
		}
	}
}