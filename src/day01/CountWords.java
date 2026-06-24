package day01;

public class CountWords {
    public static void main(String[] args)
    {
        String sentence= "I am learning selenium java";

        String[] words=sentence.split(" ");
        System.out.println("Sentence:"+sentence);
        System.out.println("Words Count: "+words.length);
    }
}
