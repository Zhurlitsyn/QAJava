package lessonString;

import java.util.*;

public class MainClassWork {
    public static void main(String[] args) {
        List<TemporaryString> tempString = new ArrayList<>();
        StringBuilder sb = new StringBuilder(" ");
        int sum = 0;
        System.out.println("Enter amount of Strings");
        int amount = new Scanner(System.in).nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter String: ");
            String newString = new Scanner(System.in).nextLine();
            tempString.add(new TemporaryString(newString));
            sum += tempString.get(i).getLenght();
        }
  // sort and output of shortest and longest string

        Collections.sort(tempString, Comparator.comparing(TemporaryString::getLenght));
        sb.append("The shortest string: '" + tempString.get(0).getStr() + "'" +
                "; the longest string: '" + tempString.get(tempString.size()-1).getStr() + "'");
        System.out.println(sb.toString());

   // finding average length and output strings with length more than average

        System.out.println(" - - - - - - - -- - - - - - - - - - - -");
        float avg = sum / tempString.size();
        for (TemporaryString ts : tempString)
        {
            if (ts.getLenght() > avg)
                System.out.println(ts);
        }



    }
}
