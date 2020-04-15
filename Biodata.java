/*===============================================
problem statement:Student database 
===============================================*/
import java.util.Scanner;

class Personal
{
	private String name;
 	private String add;
	private long mob_no;
	public Personal(String name,String add,long mob_no)
	{
	this.name=name;
	this.add=add;
	this.mob_no=mob_no;
	}
	void display()
	{
	System.out.println();
	System.out.println("              Personal Information         ");
	System.out.println("	Name 		:"+name);
	System.out.println("	Address 	:"+add);
	System.out.println("	Mobile Number   :"+mob_no);
	}
}
class Academics extends Personal
{
	
	int roll_no;
	char div;
	String year;
	
	public Academics(String name,String add,long mob_no,int roll_no,char div,String year)
	{
	super(name,add,mob_no);
	this.roll_no=roll_no;
	this.div=div;
	this.year=year;
	}
	void display()
	{
	super.display();
	System.out.println("            Academic Information           ");
	System.out.println("	Qualification 	:"+year);
	System.out.println("	Div 		:"+div);
	System.out.println("	Roll No. 	:"+roll_no);
	}
}
public class Biodata
{
	public static void main(String []args)
	{
	Scanner input=new Scanner(System.in);
	
	int strength;
	String name;
	String add;
	long mob_no;
	int roll_no;
	char div;
	String year;
	System.out.println("Enter the strength of class :");
	strength=input.nextInt();
	input.nextLine();
	Academics bio[];
	bio=new Academics[strength];

	for(int i=0;i<strength;i++)
	{
	
	System.out.println("      Inforamtion     ");
	
	System.out.println("Enter your name :");
	name=input.nextLine();
	System.out.println("Enter your address:");
	add=input.nextLine();
	System.out.println("Enter your mobile number :");
	mob_no=input.nextLong();
	System.out.println("Enter the year (FE/SE/TE/BE) :");
	year=input.next();
	System.out.println("Enter your div :");
	div=input.next().charAt(0);
	System.out.println("Enter your roll number :");
	roll_no=input.nextInt();
	
	bio[i]=new Academics(name,add,mob_no,roll_no,div,year);
	input.nextLine();
	}
	
	for(Academics i:bio)
	{
	System.out.println("============================================");
	i.display();
	}
	}
}