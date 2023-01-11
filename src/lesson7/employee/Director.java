package lesson7.employee;

public class Director extends Employee implements DisplayPosition {
    private String position;

    public Director(String name, String surname, int age, String position) {
        super(name, surname, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void displayPosition() {
        System.out.println("Position of " + getName() + " " + getSurname() + " is " + (getPosition().toUpperCase()));
    }
}
