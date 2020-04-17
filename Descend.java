/*=======================================================
Problem statement:Write a program which accept number from
 user and display its factors in descreasing order.
========================================================*/
import java.util.Scanner;

class Descend
{
	public static void main(String[] args)
	{
	int n,j=0,m[];
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value:");
	n=input.nextInt();
	int size=n/2;
	m=new int[size];
	for(int i=1;i!=n;i++)
	{
	if(n%i==0)		//Condition to find out factors of given number 
	{
	m[j]=i;
	j++;
	}
	}
	for(int i=0;i<j-1;i++)		//sorting logic(Insertion sort)
	{
	for(int k=i+1;k<=j;k++)
	{
	if(m[i]<m[k])
	{
	int temp=m[i];
	m[i]=m[k];
	m[k]=temp;
	}
	}
	}
	for(int i=0;i<j;i++)		//display the factors
	{
	System.out.print(m[i]+" ");
	}
	}
}
