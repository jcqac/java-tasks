import java.util.Scanner;

public class Task2 
{
	//private static Asterisk temp = new Asterisk();
	private static Scanner myInput = new Scanner(System.in);

	public static void main(String[] args)
		{
			getMenuItem();
			int selection = myInput.nextInt();
			Asterisk temp = new Asterisk();
			
			while (selection != -1)
				{
					getMenuItem();
					System.out.println("##BEGIN## \n");
					temp.printAsterisk(selection);
					System.out.println("##END## \n");
					break;
				}
			
			System.out.println("Exit Program \n");
		}
	
	private static void getMenuItem()
	{
		System.out.println("How many lines of Stars would you like?");
		System.out.println("Enter -1 to exit");
	}
}
