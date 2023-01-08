package lesson7.employee;

public class Accountant extends Employee implements DisplayPosition {
    private String position;

    public Accountant(String name, String surname, int age, String position) {
        super(name, surname, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void displayPosition() {
        System.out.println("Position of " + getName() + " " + getSurname() + " is " + (getPosition().toUpperCase()));
    }
}
