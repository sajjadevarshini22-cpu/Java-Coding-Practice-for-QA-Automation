package day01;

public class DuplicateCharacters {
    public static void main(String[]args)
    {
        String str="programming";
        char[] chars=str.toCharArray();

        System.out.println("Duplicate characters in string: " + str);

        for(int i=0;i<chars.length;i++)
        {
            int count =1;

            for(int j=i+1;j<chars.length;j++)
            {
                if(chars[i]==chars[j] && chars[i]!=' ')
                {
                    count++;
                    chars[j]='0';
                }
            }
            if(count >1 && chars[i]!='0')
            {
                System.out.println(chars[i] + " appears " + count + " times");
            }
        }
    }
}
