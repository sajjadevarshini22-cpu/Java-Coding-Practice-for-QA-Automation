package day01;

public class RemoveSpaces {
    public static void main(String[] args)
    {
        String str="Selenium Java Automation";
        String result=str.replace(" ","");

        System.out.println("Original String:"+str);
        System.out.println("String Without Spaces: " + result);

    }
}
