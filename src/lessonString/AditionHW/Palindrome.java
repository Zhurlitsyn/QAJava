package lessonString.AditionHW;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = new Scanner(System.in).nextLine();

        String[] words = str.split(" ");
        int nWord;
      // checking right number of word
        do {
            System.out.println("Enter number of word: ");
            while (!sc.hasNextInt()) {
                System.out.println("You are wrong! Enter number!");
                sc.next();
            }
            nWord = sc.nextInt();
        } while (nWord < 0 || nWord > words.length);


        sb.append(words[nWord - 1]);
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("The word #" + nWord + '{' + sb.toString() + '}' + " is palindrome");
        } else System.out.println("The word #" + nWord + '{' + sb.toString() + '}' + "is NOT palindrome");

    }
}
