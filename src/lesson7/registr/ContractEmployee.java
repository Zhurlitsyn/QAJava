package lesson7.registr;

import java.time.LocalDate;

public class ContractEmployee extends Docs implements DisplayDoc {
    private  String name;
    private  LocalDate endOfContract;

    public ContractEmployee(String name, LocalDate endOfContract) {
        this.name = name;
        this.endOfContract = endOfContract;
    }

    public ContractEmployee(LocalDate date, String numOfDoc, String name, LocalDate endOfContract) {
        super(date, numOfDoc);
        this.name = name;
        this.endOfContract = endOfContract;
    }
    @Override
    public void displayDoc() {
        System.out.printf("* * * Employee * * * \n" + " Date: " + getDate() + " Number: " + getNumOfDoc() +
                "  Name= " + name +
                "  Contract completion= " + endOfContract);
        System.out.println();

    }

    @Override
    public String toString() {
        return "* * * Employee * * * \n" + " Date: " + getDate() + " Number: " + getNumOfDoc() +
                "  Name= " + name + "  Contract completion= " + endOfContract + "\n";
    }
}
