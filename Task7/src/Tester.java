import java.util.BitSet;

public class Tester {

	public static void main(String[] args) 
	{
		PrimeSieveFalse test = new PrimeSieveFalse(2147000000);
		
		long startTime = System.nanoTime();
		BitSet temp = test.calReturnPBit();
		long endTime = System.nanoTime();
		System.out.println(temp.cardinality());
		long duration = (endTime - startTime);
		long mili = duration/1000000;
		System.out.println("Time to calculate: " + mili + "ms");

	}

}