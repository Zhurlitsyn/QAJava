package lessonString.AditionHW;

import java.util.*;

public class MainDifLetters {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        String str = new Scanner(System.in).nextLine();
        List<AdWords> listWords = new ArrayList<>();
        String[] words = str.split(" ");
        for (String s : words) {
            int d = AdWords.differentLetters(s);
            listWords.add(new AdWords(s,d));
        }
        Collections.sort(listWords, Comparator.comparing(AdWords::getDifLetters));
        System.out.println("This word is " + listWords.get(0).toString());
    }
}
