package day02;

public class PrimeNumber {
    public static void main(String[]args)
    {
        int number=7;
        boolean isPrime=true;
        if(number<=1)
        {
            isPrime=false;
        }
        else {
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println("Prime");

        }
        else {
            System.out.println("Not Prime");
        }
    }
}
