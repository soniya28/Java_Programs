/*==========================================================================
problem statement:Check whether the input string is palindrome or not.
		  Display appropriate msg.
===========================================================================*/
import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string :");
		String string=input.nextLine();
		int size=string.length();
		int count=0;
		for(int i=0,j=size-1;i<=(int)size/2||j>=(int)size/2;i++,j--)
		{
			if(string.charAt(i)==string.charAt(j))
			{
				count++;
			}
		}
		if(count==(size/2)+1)
		{
			System.out.println("String is palindrome!!");
		}
		else
		{
			System.out.println("String is not palindrome!!");
		}
	}
}
