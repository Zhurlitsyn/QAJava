package lesson8.clinic;

public class Practitioner extends Doctor{
    public final String speciality = "Practitioner";

    public Practitioner() {
        super.setName("unknown");
        super.setSurname("unknown");
    }

    public Practitioner(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Your Doctor: " + speciality + " " +
                super.getName() + " " + super.getSurname();
    }

    @Override
    public void treat() {
        System.out.println("This pill will save you from everything");
    }
}
