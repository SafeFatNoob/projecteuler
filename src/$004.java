

    // Largest Palindrome Product
    // https://projecteuler.net/problem=4
    // 2015-9-28


public class $004
{
    public static void main(String args[])
    {
        int one = 999, two = 999, num;
        int Lone, Ltwo, Lnum = 0;
        String Snum;
        boolean found = false;

        while(!found)
        {
            num = one*two;
            Snum = Integer.toString(num);
            String rev = new StringBuffer(Snum).reverse().toString();

            if(Snum.equals(rev))
            {
                if(num > Lnum)
                {
                    Lone = one;
                    Ltwo = two;
                    Lnum = num;
                }
                two--;
                one = two;

                if((one*two) < Lnum)
                    found = true;
                System.out.println(Snum + " " + rev);
            }
            else
            {
                one--;
            }

            //System.out.println(Snum + " " + rev);
            //System.out.println(one + " " + two);
        }

        System.out.println(one + " " + two);
    }
}
