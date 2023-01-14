package lesson8.phone;

public class MainPhone {
    public static void main(String[] args) {
        ApplePhone iphone = new ApplePhone(12356, "Apple iPhone 13", 165.87);
        SamsungPhone galaxy = new SamsungPhone(4589658, "Samsung A43", 113.25);
        NokiaPhone nokia = new NokiaPhone(1452558, "Nokia 3310", 87.12);

        System.out.println(iphone);
        System.out.println(galaxy);
        System.out.println(nokia);

        iphone.receiveCall("John");
        int iphoneNumber = iphone.getNumber();
        System.out.println("Number: " + iphoneNumber + "\n -----------------");
        galaxy.receiveCall("Mucho");
        int galaxyNumber = galaxy.getNumber();
        System.out.println("Number: " + galaxyNumber + "\n -----------------");
        nokia.receiveCall("Mark");
        int nokiaNumber = nokia.getNumber();
        System.out.println("Number: " + nokiaNumber + "\n -----------------");

        iphone.receiveCall("Margo Inn", "37529589654");

        galaxy.sendMessage("2356874", "254789", "2145875", "1235");

    }
}
