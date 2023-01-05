package lessonObjects.Cat;

import java.util.Scanner;

public class MainCat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cat Jimbo = new Cat("Jimbo", 2.5, false);
        boolean catIsFed = Jimbo.fedCat;
        System.out.println("Enter amount of Cat Food (xx.xx): ");
        double catFood = sc.nextDouble();
        catIsFed = feedCat(Jimbo, catFood);
        if (catIsFed)
        {
            System.out.println("Meow! Cat is Fed");
        } else System.out.println("Try to feed better next time");

    }

    public static boolean feedCat(Cat cat, double catFood) {
        boolean flag = false;
        double compare = 3.65;
        if (catFood > compare) {
            flag = Cat.fedCat = true;
        }
        return flag;
    }
}
