/*
Searching pair of brackets with simple Array
 */
package lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBracketsSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string of brackets without spaces: ");
        String inStr = sc.next();
        boolean result = checkPairs(inStr);
        if (result) {
            System.out.println("* * * * * * * All pairs!!! * * * * * * * * ");
        } else
        System.out.println("Oops! There is at least one bracket without pair");
    }

    static boolean checkPairs(String str) {
        char[] brackets = str.toCharArray();
        if (brackets.length % 2 != 0)
            return false;
        int counter = 0;
        for (int i = 0; i < brackets.length; i++) {
            counter += (brackets[i] == '(' || brackets[i] == '[' || brackets[i] == '{' || brackets[i] == '<') ? 1 : -1;
        }
        if (counter != 0) {
            return false;
        } else return true;
    }
}






