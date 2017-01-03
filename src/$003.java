

    // Largest Prime Factor
    // https://projecteuler.net/problem=3


public class $003
{

    public static void main(String args[])
    {

        long num = 600851475143L;
        long divide = 2;
        boolean con = false;
        $003 a = new $003();

        while(!con)
        {

            while (num % divide != 0)
            {
                divide++;
                System.out.println("d" + divide);
            }

            if(a.isPrime(num/divide))
            {
                System.out.println(con);
                con = true;
            }

            num = num/divide;
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(divide);
        System.out.println(600851475143L/divide);
    }

    public boolean isPrime(long n)
    {
        if(n > 2 && (n & 1) == 0)
            return false;

        for(int i = 3; 600851475143L > i; i++)
        {
            if (n % i == 0)
                return false;
        }


        return true;
    }

}
