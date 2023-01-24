/*
Searching pair of brackets with Map, ArrayList
 */
package lesson11;

import java.util.*;

public class MainBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Character> sb = new HashMap<Character, Character>();
        sb.put('(', ')');
        sb.put(')', '(');
        sb.put('[', ']');
        sb.put(']', '[');
        sb.put('{', '}');
        sb.put('}', '{');
        sb.put('<', '>');
        sb.put('>', '<');

        System.out.println("Enter string of brackets without spaces: ");
        String inStr = sc.next();

        ArrayList<Character> brackets = new ArrayList<>();
        for (char c : inStr.toCharArray()) {
            brackets.add(c);
        }

        if (brackets.size() % 2 != 0) {
            System.out.println("There at least one is bracket without pair or string is empty!");

        } else {
            if (searchPair(sb, brackets)) {
                System.out.println("There is at least one bracket without pair");
            } else System.out.println("Each brackets in pairs");
        }
    }

    public static boolean searchPair(Map<Character, Character> sb, ArrayList<Character> brackets) {
        boolean result = false;
        if (brackets.size() == 0) return result;
        if (brackets.size() == 2) {
            if (sb.get(brackets.get(0)) == brackets.get(1)) {
                return result;
            } else return !result;
        }
        if (brackets.size() >= 4) {
            char temp = sb.get(brackets.get(0));
            for (int i = 1; i < brackets.size(); i++) {
                if (temp == brackets.get(i)) {
                    brackets.remove(i);
                    brackets.remove(0);
                    result = searchPair(sb, brackets);
                    return result;
                }
            }
            return result = true;
        }
        return result;
    }

}





