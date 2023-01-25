package collectionAdvance;
import java.util.*;

public class BracketsNew {

    public static void main(String[] args) {
        Map<Character, Character> brMap = Map.of(
                '{', '}', '(', ')', '<', '>', '[', ']'
        );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        char[] brack = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char brackets : brack) {
            if (brMap.containsKey(brackets)) {
                stack.push(brackets);
            } else {
                try {
                    Character current = stack.pop();
                    if (brMap.get(current) == brackets) {
                        continue;
                    } else {
                        System.out.println("False");
                        return;
                    }
                } catch (EmptyStackException e) {
                    System.out.println("False");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("True");
        } else System.out.println("False");
    }
}