package bloodbank;
public class Person {
    private String name;
    private String gender;
    private String contact;

    // Constructor
    public Person(String name, String gender, String contact) {
        this.name = name;
        this.gender = gender;
        this.contact = contact;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Contact: " + contact;
    }
}
