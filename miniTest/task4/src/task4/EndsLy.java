package task4;

import java.util.Scanner;

public class EndsLy 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="";
		boolean con = false;
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Please input a word:");
		a = myInput.nextLine();
		
		myInput.close();
		
		if(a.contains("ly"))
		{
			con = true;
		}
		else
		{
			con = false;
		}
		
		System.out.println("The substring contains 'ly': " + con);
	}

}
