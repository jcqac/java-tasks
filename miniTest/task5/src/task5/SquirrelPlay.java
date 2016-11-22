package task5;

import java.util.Scanner;

public class SquirrelPlay {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0;
		boolean isSummer = false;
		boolean play = false;
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Please input a temperature (Fahrenheit):");
		a = myInput.nextInt();
		
		System.out.println("Is it Summer? (Y/N)");
		String s = myInput.nextLine();
		s = myInput.nextLine();
		
		if (s.contains("y") || (s.contains(("Y"))))
		{
			isSummer = true;
		}
		else
		{
			isSummer = false;
		}
		
		myInput.close();
		
		int x = 0;
		
		if(isSummer)
		{
			x = 100;
		}
		else
		{
			x = 90;
		}
		
		if (a <= x && a >= 60)
		{
			play = true;
		}
		else
		{
			play = false;
		}
		
		System.out.println("The squirrels will play: " + play);
	}

}
