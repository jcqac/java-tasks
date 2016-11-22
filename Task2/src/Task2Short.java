import java.util.Scanner;

public class Task2Short 
{
	public static void main(String[] args)
	{
		Scanner myInput = new Scanner(System.in);
		String asterisk = "";
		System.out.println("How many lines of Stars would you like?");
		int x = myInput.nextInt();
		
		for (int i=0; i<x; i++)
			{
				asterisk += "*";
				System.out.println(asterisk);
			}
		myInput.close();
	}
}
