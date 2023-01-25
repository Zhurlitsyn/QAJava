package collectionAdvance.stack;

import java.util.Scanner;
import java.util.Stack;

public class QueueStackClass {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public QueueStackClass() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void pushNum() {
        System.out.println("Enter number");
        int num = new Scanner(System.in).nextInt();
        if (!s2.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            s1.push(num);
        } else {
            s1.push(num);
        }
    }

    public void outNum() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }

    public void printQueue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");

        } else if (s2.isEmpty()) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        System.out.println(s2);
    }
}

