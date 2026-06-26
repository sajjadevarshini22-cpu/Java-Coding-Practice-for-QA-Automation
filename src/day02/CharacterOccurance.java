package day02;

public class CharacterOccurance {
    public static void main(String[]args)
    {
        String str="selenium";
        char target='e';
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target)
            {
                count++;
            }
        }
        System.out.println("String: "+str);
        System.out.println("Character: " +target);
        System.out.println("Occurance count: "+count);

    }
}
