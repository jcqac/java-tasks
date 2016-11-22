
public class LongSubstring 
{
	public String longestSubstring(String first, String second)
	{
		// Stores the two strings for entry
		String s1 = first;
		String s2 = second;
		//Stores the result of substring
		String res = null;
		// Two counters to calculate the length of the longest Substring
		int counter1 = 0;
		int counter2 = 0;
		
		//First for loop to compare all characters in String s1.
		//The idea is to find indexes of the start and end point in String s1
		//From these deduced indexes we will be able to apply the Substring method
		//This will produce the longest substring found.
		for (int i = 0; i <s1.length(); i++)
		{
			//Second for loop to compare all characters in String s2
			for (int j = 0; j < s2.length(); j++)
			{
				// This is an internal counter
				int x = 0;
				// While loop that breaks once the characters no longer match.
				while(s1.charAt(i+x) == s2.charAt(j+x))
				{
					x++;
					
					//Should the index of the for loop added with the counter for the while loop equals
					//Or exceeds the length of both string s1 and s2 then we have to break out of the while loop.
					if((i+x)>= s1.length() || ((j + x) >= s2.length()))
					{
						break;
					}
				}
				// This is to find the longest substring.
				if (x > counter2)
				{
					counter2 = x;
					counter1 = i;
				}
			}
			
			// returns the substring from the between the indexes found in the loops
			res = s1.substring(counter1, (counter1 + counter2));
		}
		return res;
	}
}
