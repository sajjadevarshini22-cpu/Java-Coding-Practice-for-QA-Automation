package day03;

public class CountEvenOddInArray {

    public static void main(String[]args)
    {
        int[] numbers={1,2,3,4,5,6};
        int evenCount=0;
        int oddCount=0;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2 ==0)
            {
                evenCount+=numbers[i];
            }
            else {
                oddCount+=numbers[i];
            }
        }
        System.out.println("Even Count: " +evenCount);
        System.out.println("Odd count:  " +oddCount);

    }
}
