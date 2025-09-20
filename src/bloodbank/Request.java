package bloodbank;

public class Request {
    private Patient patient;
    private String bloodType;
    private int unitsRequired;

    public Request(Patient patient, String bloodType, int unitsRequired) {
        this.patient = patient;
        this.bloodType = bloodType;
        this.unitsRequired = unitsRequired;
    }
    public Patient getPatient() {
        return patient;
    }
    public String getBloodType() {
        return bloodType;
    }
    public int getUnitsRequired() {
        return unitsRequired;
    }
    @Override
    public String toString() {
        return "Patient: " + patient.getName() + ", Blood Type: " + bloodType + ", Units Required: " + unitsRequired;
    }
}
