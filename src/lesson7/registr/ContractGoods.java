package lesson7.registr;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContractGoods extends Docs implements DisplayDoc {
    private String typeOfGoods;
    private int amountGoods;

    public ContractGoods() {

    }

    public ContractGoods(String typeOfGoods, int amountGoods) {
        this.typeOfGoods = typeOfGoods;
        this.amountGoods = amountGoods;
    }

    public ContractGoods(LocalDate date, String numOfDoc, String typeOfGoods, int amountGoods) {
        super(date, numOfDoc);
        this.typeOfGoods = typeOfGoods;
        this.amountGoods = amountGoods;
    }

    @Override
    public String toString() {
        return "* * ContractGoods * * \n" + " date: " + getDate() + "   Number: " + getNumOfDoc() +
                "   TypeOfGoods:  " + typeOfGoods +
                " AmountGoods: " + amountGoods + "\n";
    }

    @Override
    public void displayDoc() {
        System.out.printf("\n* * * ContractGoods * * * \n" + " Date: " + getDate() + " Number: " + getNumOfDoc() +
                "  TypeOfGoods= " + typeOfGoods +
                "  АmountGoods= " + amountGoods);
        System.out.println();
    }
}
