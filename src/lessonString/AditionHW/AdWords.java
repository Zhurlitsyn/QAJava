package lessonString.AditionHW;

import java.util.HashSet;
import java.util.Set;

public class AdWords {
    private String word;
    private int difLetters;

    public AdWords(String word) {
        this.word = word;
    }

    public AdWords(String word, int difLetters) {
        this.word = word;
        this.difLetters = difLetters;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getDifLetters() {
        return difLetters;
    }

    public void setDifLetters(int difLetters) {
        this.difLetters = difLetters;
    }

    public static int differentLetters (String word)
    {
        char[] ch = word.toCharArray();
        Set<Character> sCh = new HashSet<>();
        for (Character c : ch)
        {
            sCh.add(c);
        }
        int difLetters = sCh.size();
        return difLetters;
    }

    @Override
    public String toString() {
        return word;
    }
}
