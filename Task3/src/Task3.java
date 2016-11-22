import java.util.Scanner;

public class Task3 
{	
	public static void main(String[] args) 
	{
		Scanner myInput = new Scanner(System.in);
		System.out.println("What word would you like to reverse?");
		String s = myInput.nextLine();
		String r = "";
		for (int i = s.length(); i > 0 ; i--)
		{
			r+= s.charAt(i-1);
		}
		System.out.println(r);
		myInput.close();
	}
}
