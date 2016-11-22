package task1;

import java.util.*;

public class LoneSum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
		int a=0;
		int b=0;
		int c=0;
		int res = 0;
		
		System.out.println("Please insert 3 different numbers: ");
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("A: ");
		a = myInput.nextInt();
		System.out.println("B: ");
		b = myInput.nextInt();
		System.out.println("C: ");
		c = myInput.nextInt();
		
		myInput.close();
		
		if (a==b)
		{
			if(b==c)
			{
				a=0;
				b=0;
				c=0;
			}
			a=0;
			b=0;
		}
		else if (a==c)
		{
			a=0;
			c=0;
		}
		else if (b==c)
		{
			b =0;
			c =0;
		}
		
		res = a + b + c;
		
		System.out.println("\nSum of 3 numbers: " + res);
		
	}

}
