/*==========================================================
Problem statement:Calculate the area and perimeter of the circle.
============================================================*/

import java.util.Scanner;

class Circle
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		final double pi=3.14;
		System.out.println("Radius :");
		int radius=input.nextInt();
		double perimeter=pi*2*radius;
		double area=pi*(radius*radius);
		System.out.println("Area of a circle :"+area);
		System.out.println("Perimeter of a circle:"+perimeter);
	}
}