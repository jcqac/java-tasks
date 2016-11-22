import java.util.BitSet;

public class PrimeSieveFalse 
{ 
    private final int n;
    private final BitSet primeNo;
    /**
     * Constructor
     * x+1 used so that the last value of the array could be used.
     * @param x
     */
    public PrimeSieveFalse (int x)
    {
        n=x;
        primeNo = new BitSet(n+1);
    }

    /**
     * marks all values in the array as true
     */
    private void setBits()
    {
        for (int i = 2; i <=n; i++) 
        {
            primeNo.set(i);
        }
    }

    /**
     * Uses Sieve of Eratosthenes algorithm
     * Method that starts to mark non-prime numbers as false
     * Starts at 2 as 1 is not a prime number
     * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     */
    private void nonPrimes()
    {
        for (int i = 2; i*i <= n; i++) 
        {
            //Initally Multiples of n (2) are marked as false, then multiples of n+1
            // e.g multiples of 2 then 3 ....
            if(primeNo.get(i))
            {
                for (int x = i; i*x <=n; x++) 
                {
                    primeNo.clear(i*x);
                }
            }
        }
    }


    public BitSet calReturnPBit()
    {
        setBits();
        nonPrimes();
        return this.primeNo;
    }

    public void test(){
        BitSet temp = this.calReturnPBit();
        for(int i = 0; i<=n; i++){
            if (!temp.get(i))
            {
                System.out.println(i);
            }
        }
    }
}

