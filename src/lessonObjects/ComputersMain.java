package lessonObjects;

import java.util.Scanner;

public class ComputersMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price for computer 1: ");
        double price1 = sc.nextDouble();
        System.out.println("Enter model for Computer 1: ");
        String model1 = sc.next();

        Computers comp1 = new Computers(price1, model1);
        System.out.println(comp1);

        System.out.println("Enter price for computer 2: ");
        double price2 = sc.nextDouble();
        System.out.println("Enter model for Computer 2: ");
        String model2 = sc.next();
        System.out.println("Enter model RAM: ");
        String modelRam = sc.next();
        System.out.println("Enter volume RAM: ");
        int volumeRam = sc.nextInt();
        Ram ram2 = new Ram(modelRam, volumeRam);
        System.out.println("Enter model HDD: ");
        String modelHdd = sc.next();
        System.out.println("Enter volume HDD: ");
        int volumeHdd = sc.nextInt();

        System.out.println("Enter type of HDD (enternal or external): ");
        String typeHdd = sc.next();
        Hdd hdd2 = new Hdd(modelHdd, volumeHdd, typeHdd);
        Computers computer2 = new Computers(price2, model2, ram2, hdd2);
        System.out.println(computer2);

    }
}
