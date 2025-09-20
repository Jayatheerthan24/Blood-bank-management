package bloodbank;

public class Patient extends Person {
    private String bloodType;
    private String disease;

    public Patient(String name, String gender, String contact, String bloodType, String disease) {
        super(name, gender, contact);
        this.bloodType = bloodType;
        this.disease = disease;
    }
    public String getBloodType() {
        return bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    @Override
    public String toString() {
        return super.toString() + ", Blood Type: " + bloodType + ", Disease: " + disease;
    }
}
