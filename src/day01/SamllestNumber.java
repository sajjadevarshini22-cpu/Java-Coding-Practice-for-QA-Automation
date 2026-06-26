package day01;

public class SamllestNumber {

    public static void main(String[]args)
    {
        int [] num={10,25,5,40,15};
        int smallest=num[0];

        for(int i=1;i<num.length;i++)
        {
            if(num[i]<smallest)
            {
                smallest=num[i];
            }
        }

        System.out.println("Smallest Number: "+smallest);
    }

}
