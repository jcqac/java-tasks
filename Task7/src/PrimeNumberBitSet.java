/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.BitSet;

/**
 *
 * @author johnny
 */
public class PrimeNumberBitSet { 
    private final int n;
    private final BitSet primeNo;
 
    /**
     * Constructor
     * x+1 used so that the last value of the array could be used.
     * @param x
     */
    public PrimeNumberBitSet(int x){
        n=x;
        primeNo = new BitSet(n+1);
    }
    
    /**
     * marks all values in the array as true
     */
    private void setBits(){
        for (int i = 2; i <=n; i++) {
            primeNo.set(i);
        }
    }
    
        
    /**
     * Uses Sieve of Eratosthenes algorithm
     * Method that starts to mark non-prime numbers as false
     * Starts at 2 as 1 is not a prime number
     * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * https://cs.fit.edu/~mmahoney/cis5100/examples/appI/figI_10/BitSetTest.java
     */
    private void nonPrimes(){
        for (int i = 2; i*i <= n; i++) {
           //Initally Multiples of n (2) are marked as false, then multiples of n+1
            // e.g multiples of 2 then 3 ....
            if(primeNo.get(i)){
                for (int x = i; i*x <=n; x++) {
                    primeNo.clear(i*x);
                }
            }
        }
    }
    
    
    /**
     * Public method to calculate prime numbers
     * @return 
     */
    public int calPrime(){
        setBits();
        nonPrimes();
        for(int i = 0; i<=n; i++)
        {
            if (primeNo.get(i)){
                return i;
            }
        }
        return 0;
    }   
    
    public BitSet calReturnPBit(){
        setBits();
        nonPrimes();
        return this.primeNo;
    }
    
    public void test(){
        BitSet temp = this.calReturnPBit();
        for(int i = 0; i<=n; i++){
            if (temp.get(i))
            {
                System.out.println(i);
            }
        }
    }
}

