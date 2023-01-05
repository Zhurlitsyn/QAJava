package lessonObjects;

public class Computers {
    double price;
    String model;
    Ram ram;
    Hdd hdd;

    public Computers () {

    }

    public Computers(double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computers(double price, String model, Ram ram, Hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

  /*  public  void printComputers (Ram ram, Hdd hdd)
    {
        System.out.println("Computer Price: " + this.price + " Computer Model: " + this.model);
        ram.printRam();
        hdd.printHdd();
    }*/

    @Override
    public String toString() {
        return "Computers{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
