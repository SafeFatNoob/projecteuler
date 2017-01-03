

    // Smallest Multiple
    // https://projecteuler.net/problem=5
    // 2015-8-24


public class $005
{
    public static void main(String args[])
    {
        int current = 1;
        boolean found = false;

        while(!found)
        {
            if(current % 20 == 0)
            {
                if(current % 19 == 0)
                {
                    if(current % 18 == 0)
                    {
                        if(current % 17 == 0)
                        {
                            if(current % 16 == 0)
                            {
                                if(current % 15 == 0)
                                {
                                    if(current % 14 == 0)
                                    {
                                        if(current % 13 == 0)
                                        {
                                            if(current % 12 == 0)
                                            {
                                                if(current % 11 == 0)
                                                {
                                                    found = true;
                                                }
                                                else
                                                {
                                                    current += 12;
                                                    System.out.println(current);
                                                }
                                            }
                                            else
                                            {
                                                current += 13;
                                                System.out.println(current);
                                            }
                                        }
                                        else
                                        {
                                            current += 14;
                                            System.out.println(current);
                                        }
                                    }
                                    else
                                    {
                                        current += 15;
                                        System.out.println(current);
                                    }
                                }
                                else
                                {
                                    current += 16;
                                    System.out.println(current);
                                }
                            }
                            else
                            {
                                current += 17;
                                System.out.println(current);
                            }
                        }
                        else
                        {
                            current += 18;
                            System.out.println(current);
                        }
                    }
                    else
                    {
                        current += 19;
                        System.out.println(current);
                    }
                }
                else
                {
                    current += 20;
                    System.out.println(current);
                }
            }
            else
            {
                current++;
                System.out.println(current);
            }
        }
    }
}
