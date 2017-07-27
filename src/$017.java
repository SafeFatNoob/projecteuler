

    // Number letter counts
    // https://projecteuler.net/problem=17
    // the king is back lmao rip me


    import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

    public class $017
{
    public static void main(String args[])
    {
        int numbers[][] = new int[][]{
                {0, 0},
                {3, 0},
                {3, 6},
                {5, 6},
                {4, 5},
                {4, 5},
                {3, 5},
                {5, 7},
                {5, 6},
                {4, 6}};

        int onetonine = 0;
        for(int i = 0; i < 10; i++)
        {
            onetonine += numbers[i][0];
        }

        int tens = 0;
        for(int i = 0; i < 10; i++)
        {
            tens += numbers[i][1];
        }

        int oneto99 = (onetonine * 9) + (tens * 10) + 70;

        int total = (oneto99 * 10) + (onetonine * 100) + (7 * 900) + (3 * 891) + (11);

        System.out.println("a" + tens);
        System.out.println("o" + total);
    }
}
