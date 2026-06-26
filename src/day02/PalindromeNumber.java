package day02;

public class PalindromeNumber {
    public static void main(String[]args)
    {
        int num=121;
        int originalNumber=num;
        int rev=0;

        while(num!=0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;


        }
        if(originalNumber==rev)
        {
            System.out.println("palindrome");

        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
