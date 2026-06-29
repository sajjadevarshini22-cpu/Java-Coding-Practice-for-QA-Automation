package day04;

public class ReverseArray {
    public static void main(String[]args)
    {
        int[] numbers={10,20,30,40};
        System.out.println("Original Array: ");
        for(int num: numbers)
        {
            System.out.println(num + " ");

        }
        System.out.println("\n Reversed Array");
        for(int i=numbers.length-1;i>=0;i--)
        {
            System.out.println(numbers[i]);
        }
    }
}
