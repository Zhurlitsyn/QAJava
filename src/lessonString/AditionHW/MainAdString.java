package lessonString.AditionHW;

import java.util.*;

public class MainAdString {
    public static void main(String[] args) {

        System.out.println("Enter the String: ");
        String str = new Scanner(System.in).nextLine();
        List<AdString> listWords = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        String[] words = str.split(" ");
        for (String s : words)
        {
            listWords.add(new AdString(s));
        }
        Collections.sort(listWords, Comparator.comparing(AdString::getLength));

  //find a shortest word if there are several of them
        sb.append("Shortest word is '");
        for (int i = 1; i<listWords.size(); i++)
        {
            if (listWords.get(i).getLength() > listWords.get(0).getLength())
            {
               sb.append(listWords.get(i-1).getStr() + "'");
               break;
            }
        }
        sb.append("\nThe Longest word is '" + listWords.get(listWords.size()-1) + "'");
        System.out.println(sb.toString());

    }
}
