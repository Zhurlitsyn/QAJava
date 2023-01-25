package collectionAdvance.stack;

import java.util.Scanner;

public class MainQueueStackClass {
    public static void main(String[] args) {

        QueueStackClass q1 = new QueueStackClass();
        menu(q1);

    }

    public static void menu(QueueStackClass q)
    {
        System.out.println("Select an action");
        System.out.println("1: EnQ | 2: DeQ | 3: print Q | 4: exit");
        int action = new Scanner(System.in).nextInt();
        switch (action) {
            case 1: q.pushNum(); menu(q); break;
            case 2: q.outNum(); menu(q); break;
            case 3: q.printQueue(); menu(q); break;
            case 4: System.exit(0);
            default:
                System.out.println("Wrong. Try again.");
                menu(q);
        }
    }
}
