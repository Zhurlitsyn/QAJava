package lessonString.AditionHW;

import java.util.Scanner;

public class DuplicateLetters {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String str = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        String[] sArr = str.split(" ");
        for (String s : sArr) {
            sb.append(duplicateLetters(s)+" ");
        }
        System.out.println("- - - - - - - - - - - - \n" + sb.toString());
    }

    public static String duplicateLetters(String word) {
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < word.length() * 2; i += 2) {
            sb.insert(i + 1, sb.charAt(i));
        }
        return sb.toString();
    }
}
