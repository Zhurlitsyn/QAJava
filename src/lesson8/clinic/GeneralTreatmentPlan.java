package lesson8.clinic;

public enum GeneralTreatmentPlan {
    SURGEON("- initial examination, \n- preparation for surgery, \n- surgery, \n- rehabilitation"),
    DENTIST("- initial examination, \n- panoramiс shot, \n- treatment/removal of teeth"),
    PRACTITIONER("- initial examination, \n- temperature and pressure measurement,\n- analysis control, \n- treatment appointment");

    private String generalTreatment;

    public String getGeneralTreatment() {
        return generalTreatment;
    }

    GeneralTreatmentPlan(String generalTreatment) {
        this.generalTreatment = generalTreatment;
    }

    @Override
    public String toString() {
        return "GeneralTreatmentPlan: \n" + generalTreatment;
    }
}
