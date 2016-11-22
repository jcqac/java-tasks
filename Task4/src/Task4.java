import java.util.Scanner;

public class Task4 
{	
	public static void main(String[] args) 
	{
		Scanner myInput = new Scanner(System.in);
		System.out.println("What word would you like to reverse?");
		String s = myInput.nextLine();
		StringBuilder im = new StringBuilder(s);
		String r = (im.reverse()).toString();
		System.out.println(r);
		myInput.close();
	}
}