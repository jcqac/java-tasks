package task3;

import java.util.Scanner;

public class NTwice 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="";
		int st = 0;
		String res = "";
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Please input a word:");
		a = myInput.nextLine();
		
		System.out.println("Please enter a length (int)");
		st = myInput.nextInt();
		
		myInput.close();
		
		for (int i=0; i<st; i++)
		{
			res += a.charAt(i);
		}
		
		for (int i =(a.length()-st); i<a.length(); i++)
		{
			res += a.charAt(i);
		}
		
		System.out.println("The substring is: " + res);
		
	}
}
