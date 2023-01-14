package lesson8.clinic;

public class Patient {
    private int cardNumber;
    private TreatmentPlan treatPlan;
    private Doctor doctor;

    public Patient() {
        this.cardNumber = 0;
        this.treatPlan = new TreatmentPlan(3);
    }

    public Patient(int cardNumber, TreatmentPlan treatPlan) {
        this.cardNumber = cardNumber;
        this.treatPlan = treatPlan;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setTreatPlan(TreatmentPlan treatPlan) {
        this.treatPlan = treatPlan;
    }

    public TreatmentPlan getTreatPlan() {
        return treatPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient: " +
                " cardNumber:" + cardNumber +
                ", treatPlan: " + treatPlan.getTreatCode() + " " + doctor;
    }
}
