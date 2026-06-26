package day02;

public class FibonacciSeries {
    public static void main(String[]args)
    {
        int first=0;
        int second=1;
        int terms=10;

        System.out.println("Fibonacci Series");
        for(int i=1;i<=terms;i++)
        {
            System.out.println(first +" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }

}
