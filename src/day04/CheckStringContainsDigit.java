package day04;

public class CheckStringContainsDigit {
    public static void main(String[]args)
    {
        String str="Selenium123";
        boolean containsDigit=false;
        for(int i=0;i<str.length()-1;i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                containsDigit=true;
                break;
            }
        }
        if(containsDigit)
        {
            System.out.println("String contains digits");
        }
        else {
            System.out.println("String does not contain digits");
        }
    }
}
