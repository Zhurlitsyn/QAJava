package lessonObjects;

public class CreditCard {
    private int accountNumber;
    private double accountMoney;

    public CreditCard() {

    }


    public CreditCard(int accountNumber, double accountMoney) {
        this.accountNumber = accountNumber;
        this.accountMoney = accountMoney;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void addMoney(double in) {
        this.accountMoney += in;
    }

    public void removalMoney(double out) {
        this.accountMoney -= out;
    }


}


