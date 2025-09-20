package bloodbank;

public class Staff extends Person {
    private String role;

    public Staff(String name, String gender, String contact, String role) {
        super(name, gender, contact);
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return super.toString() + ", Role: " + role;
    }
}
