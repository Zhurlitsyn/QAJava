package lesson8.clinic;

public class Dentist extends Doctor {
    public final String speciality = "Dentist";

    public Dentist() {
        super.setName("unknown");
        super.setSurname("unknown");
    }

    public Dentist(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Your Doctor: " +  speciality + " " +
                super.getName() + " " + super.getSurname();
    }

    @Override
    public void treat() {
        System.out.println("Do you still need these teeth?");
    }
}
