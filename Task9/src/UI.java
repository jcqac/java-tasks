import java.util.Scanner;

public class UI 
{
	public static void main(String[] args)
	{
		Scanner myInput = new Scanner(System.in);
		
		String s1 = null;
		String s2 = null;

		System.out.println("Please enter two words to find the longest substring");
		System.out.println("Word 1: ");
		s1 = myInput.nextLine();
		
		System.out.println("Word 2: ");
		s2 = myInput.nextLine();
		myInput.close();
		
		LongSubstring test = new LongSubstring();
		System.out.println("The longest substring is:");
		System.out.println(test.longestSubstring(s1, s2));		
	}
}
