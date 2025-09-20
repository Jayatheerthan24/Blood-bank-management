package bloodbank;

public class Donor extends Person {
    private String bloodType;
    private int age;

    public Donor(String name, String gender, String contact, String bloodType, int age) {
        super(name, gender, contact);
        this.bloodType = bloodType;
        this.age = age;
    }
    public String getBloodType() {
        return bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return super.toString() + ", Blood Type: " + bloodType + ", Age: " + age;
    }
}
