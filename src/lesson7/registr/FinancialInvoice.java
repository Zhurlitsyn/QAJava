package lesson7.registr;

import java.time.LocalDate;
import java.util.ArrayList;

public class FinancialInvoice extends Docs implements DisplayDoc {
    private String codeDep;
    private double totalAmount;

    public FinancialInvoice(LocalDate of, String codeDep, String x007, double totalAmount, int i) {
        this.codeDep = codeDep;
        this.totalAmount = totalAmount;
    }

    public FinancialInvoice(LocalDate date, String numOfDoc, String codeDep, double totalAmount) {
        super(date, numOfDoc);
        this.codeDep = codeDep;
        this.totalAmount = totalAmount;
    }

    public String getCodeDep() {
        return codeDep;
    }

    public void setCodeDep(String codeDep) {
        this.codeDep = codeDep;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public void displayDoc() {
        System.out.printf("* * * Financial Invoice * * * \n" + " Date: " + getDate() + " Number: " + getNumOfDoc() +
                "  Department code= " + codeDep +
                "  Profit= " + totalAmount);
        System.out.println();
    }

    @Override
    public String toString() {
        return "* * * Financial Invoice * * * \n" + " Date: " + getDate() + " Number: " + getNumOfDoc() +
                "  Department code= " + codeDep + "  Profit= " + totalAmount + "\n";
    }
}
