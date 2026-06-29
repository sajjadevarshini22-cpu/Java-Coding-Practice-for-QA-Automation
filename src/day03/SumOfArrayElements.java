package day03;

public class SumOfArrayElements {
    public static void main(String[]args)
    {
        int[] numbers={10,20,30,40};
        int sum=0;

        for(int i=0;i<numbers.length;i++)
        {
            sum+=numbers[i];
        }
        System.out.println("sum of array elements: "+sum);
    }
}
