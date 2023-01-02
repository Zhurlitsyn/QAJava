package lessonObjects;

import java.util.Scanner;

public class ValidateAmount {
    public static double validateNum(double getMoney) {
        Scanner sc = new Scanner(System.in);
        double correctMoney;
        do {
            System.out.println("Withdraw should be more than zero and less than " + getMoney);
            while (!sc.hasNextDouble()) {
                System.out.println("You are wrong! Enter right withdraw!");
                sc.next();
            }
            correctMoney = sc.nextDouble();
        } while (correctMoney < 0 || correctMoney > getMoney);
        return correctMoney;
    }
}


