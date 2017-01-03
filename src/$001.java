

    // Multiples of 3 and 5
    // https://projecteuler.net/problem=1
    // 2015-9-4


import java.util.ArrayList;

public class $001
{
    public static void main(String args[])
    {
        ArrayList list = new ArrayList();
        int total = 0;

        for(int i = 0; i < 1000; i++)
        {
            if(((i%3) == 0) || ((i%5) == 0))
                list.add(i);
        }

        for(int i = 0; i < list.size(); i++)
        {
            total += (int) list.get(i);
        }

        System.out.println(total);
    }
}
