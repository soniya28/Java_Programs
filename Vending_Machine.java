/* Consider a vending machine that offers the following options:
[1] Get gum [2] Get chocolate [3] Get popcorn [4] Get juice [5] Display total sold so far [6] Quit
Design and implement a program that continuously allows users to select from these options.
When options 1–4 are selected an appropriate message is to be displayed acknowledging their choice.
For example, when option 3 is selected the following message could be displayed:
Here is your popcorn
When option 5 is selected, the number of each type of item sold is displayed. For example:
3 items of gum sold 2 items of chocolate sold 6 items of popcorn sold 9 items of juice sold
When option 6 is chosen the program terminates. If an option other than 1–6 is entered an appropriate error message should be displayed, such as:
Error, options 1-6 only!
*/

import java.util.Scanner;

class Vending_Machine
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int choice,gum=0,chocolate=0,popcorn=0,juice=0;
	do
	{
		System.out.println(" [1] Get gum\n [2]Get chocolate\n [3]Get popcorn\n [4]Get juice\n [5]Display total\n [6]Quit");
		choice=input.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Here is your gum ");
			gum++;
		break;
		case 2:
			System.out.println("Here is your chhocolate ");
			chocolate++;
		break;
		case 3:
			System.out.println("Here is your popcorn ");
			popcorn++;
		break;
		case 4:
			System.out.println("Here is your juice ");
			juice++;	
		break;
		case 5:
			System.out.println();
			System.out.println(gum+" items of gum sold ");
			System.out.println(chocolate+" items of chocolate sold ");
			System.out.println(popcorn+" items of popcorn sold ");
			System.out.println(juice+" items of juice sold ");
			System.out.println();
		break;
		case 6:
		break;
		default:
			System.out.println("Error,options 1-6 only!");
		}
	}while(choice!=6);
	}
}