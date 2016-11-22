import java.util.BitSet;

public class PrimeEfficient {
	private static int LIMIT = 2147000000;//Integer.MAX_VALUE broke things.
    private static BitSet marked;

    public static void main(String[] args) {
         long startTime = System.nanoTime();
        init();
        sieve();
         long estimatedTime = System.nanoTime() - startTime;
        System.out.println((float)estimatedTime/1000000); //23.835363 seconds
        System.out.println(marked.cardinality());
        //System.out.println(marked.size()); //1070000000 ~= 127MB
    }

    private static void init()
    {
        double size = LIMIT * 0.5 - 1;
        marked = new BitSet();
        marked.set(0,(int)size, true);
    }

    private static void sieve()
    {
        int i = 0;
        int cur = 0; 
        int add = 0;
        int pos = 0;

        while(((i<<1)+1)*((i<<1)+1) < LIMIT)
        {
            pos = i;
            if(marked.get(pos++))
            {
                cur = pos;
                add = (cur<<1);
                pos += add*cur + cur - 1;
                while(pos < marked.length() && pos > 0)
                {
                    marked.clear(pos++);
                    pos += add;
                }
            }
            i++;
        }
    }        
}
