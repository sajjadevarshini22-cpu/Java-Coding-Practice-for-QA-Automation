package day03;

public class SwapWithoutThirdVariable {
    public static void main(String[]args)
    {
        int a=5;
        int b=15;

        System.out.println("Before Swapping:");
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);

        a=a+b;//5+15=20
        b=a-b;//20-15=5;
        a=a-b;//20-5=15;

        System.out.println("After Swapping: ");
        System.out.println("a= " + a);
        System.out.println("b= " +b);

    }
}
