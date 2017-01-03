
    // Even Fibonacci numbers
    // https://projecteuler.net/problem=2

public class $002
{

    public static void main(String args[]){


        int high = 0;
        int[] fibNum = new int[800];
        fibNum[0] = 1;
        fibNum[1] = 2;
        int currentCount = 2;
        int even = 2;

        while (high < 1000000){
            fibNum[currentCount] = fibNum[currentCount - 1] + fibNum[currentCount - 2];
            high = fibNum[currentCount];


            if((high % 2) == 0){
                even += high;
            }

            currentCount++;

        }
        System.out.println(even);
    }


}



