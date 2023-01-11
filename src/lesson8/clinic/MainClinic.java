package lesson8.clinic;

import java.util.ArrayList;

import static lesson8.clinic.GeneralTreatmentPlan.*;

public class MainClinic {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>(3);
        Dentist dentist = new Dentist("Jahib", "Mahhamadi");
        Surgeon surgeon = new Surgeon("Michael", "O'Connor");
        Practitioner practitioner = new Practitioner("Katarine", "Mable");
// put doctors to ArrayList
        doctors.add(surgeon);
        doctors.add(dentist);
        doctors.add(practitioner);
// create patients with different treatCode
        Patient patient1 = new Patient(2568, new TreatmentPlan(1));
        Patient patient2 = new Patient(7896, new TreatmentPlan(2));
        Patient patient3 = new Patient();
// output information
        System.out.println("\nTreatment for Patient #1: \n * * * * * * * * * * * * *");
        int tp1 = patient1.getTreatPlan().getTreatCode();
        displayPatientDoctor(patient1, tp1, doctors);

        System.out.println("\nTreatment for Patient #2: \n * * * * * * * * * * * * *");
        int tp2 = patient2.getTreatPlan().getTreatCode();
        displayPatientDoctor(patient2, tp2, doctors);


        System.out.println("\nTreatment for Patient #3: \n * * * * * * * * * * * * *");
        int tp3 = patient3.getTreatPlan().getTreatCode();
        displayPatientDoctor(patient3, tp3, doctors);



    }

    public static void displayPatientDoctor(Patient patient, int tp, ArrayList<Doctor> doctors) {
        switch (tp) {
            case 1 -> {
                patient.setDoctor(doctors.get(0));
                doctors.get(0).treat();
                System.out.println(patient);
                System.out.println("---------------------------- \n" + SURGEON);
            }
            case 2 -> {
                patient.setDoctor(doctors.get(1));
                doctors.get(1).treat();
                System.out.println(patient);
                System.out.println("---------------------------- \n" + DENTIST);
            }
            default -> {
                patient.setDoctor(doctors.get(2));
                doctors.get(2).treat();
                System.out.println(patient);
                System.out.println("---------------------------- \n" + PRACTITIONER);
            }
        }
    }
}
