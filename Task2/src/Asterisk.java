
public class Asterisk 
{
	//private int x= 0;
	private String asterisk = "";
	
	
	public void printAsterisk(int x)
	{
		for (int i=0; i<x; i++)
		{
			asterisk += "*";
			System.out.println(asterisk);
		}
	}
}
