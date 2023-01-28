package lessonString;

import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        String str = new Scanner(System.in).nextLine();
        Strings.first(str);
        Strings.second(str);
        System.out.println(Strings.third(str));
        Strings.fours(str);
        Strings.five(str);
        Strings.six(str);
        Strings.seven(str);
    }
}
