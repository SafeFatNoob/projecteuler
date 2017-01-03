

    // Sum square difference
    // https://projecteuler.net/problem=6
    // 2015-10-31


public class $006
{
    public static void main(String args[])
    {
        int s = 0, sq = 0;

        for(int i = 1; i <= 100; i++)
        {
            s += i*i;
            System.out.println(s);
        }

        System.out.println(s);

        for(int i = 1; i <= 100; i++)
        {
            sq += i;
            System.out.println(sq);
        }

        sq *= sq;

        System.out.println();
        System.out.println(s);
        System.out.println(sq);

        System.out.println(sq-s);
    }
}
