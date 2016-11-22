package task6;

import java.util.Scanner;

public class CaughtSpeeding 
{
	public static void main(String[] args) 
	{		
		// TODO Auto-generated method stub
		int speed=0;
		boolean isBirthday = false;
		int ticketType = 0;
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Please input your Speed (MPH):");
		speed = myInput.nextInt();
		
		System.out.println("Is it your Birthday? (Y/N)");
		String s = myInput.nextLine();
		s = myInput.nextLine();
		
		if (s.contains("y") || (s.contains(("Y"))))
		{
			isBirthday = true;
		}
		else
		{
			isBirthday = false;
		}
		
		myInput.close();
		
		int boundaryOne = 60;
		int boundaryTwo = 80;
		
		if(isBirthday)
		{
			boundaryOne = boundaryOne + 5;
			boundaryTwo = boundaryTwo + 5;
		}

		if( speed > boundaryOne && speed <= boundaryTwo)
		{
			ticketType = 1;
		}
		else if (speed > boundaryTwo)
		{
			ticketType = 2;
		}
		
		System.out.println("The ticket type is " + ticketType);
	}
}
