package lesson8;

import java.util.Scanner;

public class MainPractice {
    public static void main(String[] args) {
        DayOfWeek.printDays();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius for convert (xx,xx): ");
        double inputTemp = sc.nextDouble();
        BaseConvert tempC = new BaseConvert(inputTemp);
        tempC.convertTemp(inputTemp);

    }
}
