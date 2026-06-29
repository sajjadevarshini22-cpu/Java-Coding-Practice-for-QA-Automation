package day04;

public class CountPositiveNegativeNumbers {
    public static void main(String[]args)
    {
        int[] numbers={-2,5,-8,10,0,3};

        int positiveCount=0;
        int negativeCount=0;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>0)
            {
                positiveCount++;
            }else if(numbers[i]<0)
            {
                negativeCount++;
            }

        }
        System.out.println("Positive count: "+positiveCount);
        System.out.println("Negative Count: "+negativeCount);
    }
}
