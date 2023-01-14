package lesson8.phone;

public class Phone {
    private int serialNumber;
    private String phoneModel;
    private double phoneWeight;

    public Phone(int serialNumber, String phoneModel, double phoneWeight) {
//        this.serialNumber = serialNumber;
//        this.phoneModel = phoneModel;
        this(serialNumber, phoneModel);
        this.phoneWeight = phoneWeight;
    }

    public Phone(int serialNumber, String phoneModel) {
        this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = 00.00;
    }

    public Phone() {
        this.serialNumber = 0;
        this.phoneModel = "unknown";
        this.phoneWeight = 00.00;
    }

    public void receiveCall(String callersName) {
        System.out.println("It's " + callersName + " calling");
    }

    public void receiveCall(String callersName, String numberPhone) {
        System.out.println("It's " + callersName + " calling");
        System.out.println("Number: " + numberPhone);
    }

    public int getNumber() {
        return this.serialNumber;
    }
    public void sendMessage (String...msg)
    {
        for (String a : msg)
        {
            System.out.println("Number of sending message: " + a);
        }
    }

    @Override
    public String toString() {
        return "Phone: " +
                " Serial Number: " + serialNumber +
                ", Model: '" + phoneModel + '\'' +
                ", Weight: " + phoneWeight +
                '}';
    }
}
