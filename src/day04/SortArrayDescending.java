package day04;

public class SortArrayDescending {
    public static void main(String[]args)
    {
        int[]numbers={40,10,30,20};

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]<numbers[j])
                {
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Array iin Descending Order: ");

        for(int num:numbers)
        {
            System.out.print(num+ " ");
        }
    }
}
