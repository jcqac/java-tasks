package task7;

import java.util.Scanner;

public class TwoAsOne 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
		int a=0;
		int b=0;
		int c=0;
		boolean res = false;
		
		System.out.println("Please insert 3 different numbers: ");
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("A: ");
		a = myInput.nextInt();
		System.out.println("B: ");
		b = myInput.nextInt();
		System.out.println("C: ");
		c = myInput.nextInt();
		
		myInput.close();
		
		if ((a+b)==c)
		{
			res = true;
		}
		else if ((a+c)==b)
		{
			res = true;
		}
		
		else if ((b+c)==a)
		{
			res = true;
		}
		else
		{
			res = false;
		}
	
		System.out.println("\nTwo numbers add up to the third: " + res);
		
	}

}
