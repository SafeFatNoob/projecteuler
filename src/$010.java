

    // Summation of primes
    // https://projecteuler.net/problem=10
    // 2015-12-20


public class $010
{
    public static void main (String args[])
    {
        long sum = 0L;

        for(long l = 2; l < 2000000L; l++)
        {
            if(isPrime(l))
            {
                sum += l;
                System.out.println(l + " " + sum);
            }
        }

        System.out.println(sum);
    }

    public static boolean isPrime(long n)
    {
        for(int i = 2; i <= Math.sqrt(n) ; i++)
        {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
