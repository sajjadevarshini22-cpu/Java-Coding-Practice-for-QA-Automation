package day04;

public class CountUppercaseLowercase {
    public static void main(String[]args)
    {
        String str="SeleniumJAVA";
        int upperCaseCount=0;
        int lowerCaseCount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upperCaseCount++;
            }else if(Character.isLowerCase(ch))
            {
                lowerCaseCount++;
            }
        }
        System.out.println("Uppercase Count "+upperCaseCount);
        System.out.println("Lowercase Count: "+lowerCaseCount);

    }
}
