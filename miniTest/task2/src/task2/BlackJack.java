package task2;

import java.util.Scanner;

public class BlackJack 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int res = 0;
		
		System.out.println("Please input 2 different numbers up to 21: ");
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("A: ");
		a = myInput.nextInt();
		System.out.println("B: ");
		b = myInput.nextInt();
		
		if (a>b)
		{
			if (a>21)
			{
				res = b;
			}
			else
			{
				res = a;
			}
		}
		if (b>a)
		{
			if(b>21)
			{
				res = a;
			}
			else
			{
				res = b;
			}	
		}
		
		myInput.close();
		System.out.println("\nBiggest of the two numbers: " + res);
	}
}
