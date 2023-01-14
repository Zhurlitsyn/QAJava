package lesson8.clinic;

import javax.print.Doc;

public class Surgeon extends Doctor {
    public final String speciality = "Surgeon";

    public Surgeon() {
        super.setName("unknown");
        super.setSurname("unknown");
    }

    public Surgeon(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Your Doctor: " + speciality + " " +
                super.getName() + " " + super.getSurname();
    }

    @Override
    public void treat() {
        System.out.println("We'll cut everything out now!");
    }
}
