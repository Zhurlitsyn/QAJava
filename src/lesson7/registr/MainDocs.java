package lesson7.registr;

import java.time.LocalDate;
import java.util.Scanner;

public class MainDocs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = null;
        Registr registr = new Registr();

        ContractGoods contractGoods1 = new ContractGoods(LocalDate.of(2022, 5, 12), "P0876FR", "Ice cream", 100);
        Registr.saveDoc(contractGoods1);
        ContractEmployee worker1 = new ContractEmployee(LocalDate.of(2011, 6, 7), "ERT2201", "Ronnie O'Sullivan", LocalDate.of(2025, 11, 25));
        Registr.saveDoc(worker1);
        FinancialInvoice finInv = new FinancialInvoice(LocalDate.of(2022, 12, 25), "HYRP453", "X007", 12568.25);
        Registr.saveDoc(finInv);
        ContractGoods contractGoods2 = new ContractGoods(LocalDate.of(2021, 11, 23), "K5869IO", "Peanuts", 1500);
        Registr.saveDoc(contractGoods2);
        ContractGoods contractGoods3 = new ContractGoods(LocalDate.of(2022, 1, 13), "M7856LK", "Potatoes", 5800);
        Registr.saveDoc(contractGoods3);
        FinancialInvoice finInv2 = new FinancialInvoice(LocalDate.of(2022, 9, 23), "TRX098I", "D020", 58697.49);
        Registr.saveDoc(finInv2);
        ContractEmployee worker2 = new ContractEmployee(LocalDate.of(2008, 4, 11), "DCRT34U", "Neil Robertson", LocalDate.of(2025, 7, 21));
        Registr.saveDoc(worker2);
        FinancialInvoice finInv3 = new FinancialInvoice(LocalDate.of(2023, 1, 3), "NYT4567RT", "Mi6", 568947.21);
        Registr.saveDoc(finInv3);
        ContractGoods contractGoods4 = new ContractGoods(LocalDate.of(2020, 10, 17), "PPO9876", "Cheese Parmezan", 6400);
        Registr.saveDoc(contractGoods4);
        ContractEmployee worker3 = new ContractEmployee(LocalDate.of(2005, 2, 23), "FBR341GY", "Judd Tramp", LocalDate.of(2024, 5, 19));
        Registr.saveDoc(worker3);

        menu();

        /*System.out.println("Enter number of document ");
        String numDoc = sc.next();
        Registr.findDoc(numDoc);*/

        /*System.out.println("Choice type of document ");
        System.out.println(" 1. Goods contract | 2. Employee contract | 3. Financial Department");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Registr.displayDocument(ContractGoods.class);
                break;

            case 2:
                Registr.displayDocument(ContractEmployee.class);
                break;

            case 3:
                Registr.displayDocument(FinancialInvoice.class);
                break;

            default:
                System.out.println("Wrong choice!");
        }*/


    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" * * * * * DOCUMENTS * * * * * ");
        System.out.println("Enter number of document in the List (1-10): ");
        System.out.println("or enter 11 for exit");
        int numList = sc.nextInt() - 1;
        switch (numList){
            case 0,1,2,3,4,5,6,7,8,9:
                Registr.displayDocument(numList);
                menu();
                break;
            case 10: System.exit(0);
            default:
                System.out.println("Wrong! Try again");
                menu();

        }
    }
}
