

    // 10001st prime
    // https://projecteuler.net/problem=7
    // 2015-12-19


public class $007
{
    public static void main (String args[])
    {
        int count = 1;

        for(int i = 2; i < 1000000; i++)
        {
            if($007.isPrime(i))
            {
                System.out.println(i + " " + count);
                count++;
            }
            if(count == 10002)
            {
                System.exit(1);
            }
        }
    }

    public static boolean isPrime(int n)
    {
        for(int i = 2; i <= Math.sqrt(n) ; i++)
        {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
