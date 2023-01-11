package lesson7.employee;

public class MainEmployee {
    public static void main(String[] args) {
        Director director = new Director("Michael", "Jordan", 37, "Director");
        Accountant accountant1 = new Accountant("Priscilla", "Miles", 64, "Accountant");
        Accountant accountant2 = new Accountant("Monika", "Prides", 21, "Accountant");
        Worker worker1 = new Worker("George", "Mintren", 32, "Worker");
        Worker worker2 = new Worker("Bud", "Weiser", 55, "Worker");

        director.displayPosition();
        accountant1.displayPosition();
        accountant2.displayPosition();
        worker1.displayPosition();
        worker2.displayPosition();

    }
}
