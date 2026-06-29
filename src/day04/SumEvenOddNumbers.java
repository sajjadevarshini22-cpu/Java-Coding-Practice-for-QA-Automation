package day04;

public class SumEvenOddNumbers {
    public static void main(String[]args)
    {
        int[] numbers={1,2,3,4,5};
        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2 ==0)
            {
                evenSum+=numbers[i];
            }else
            {
                oddSum+=numbers[i];
            }
        }
        System.out.println("Even Sum: "+evenSum);
        System.out.println("Odd Sum: "+oddSum);
    }
}
