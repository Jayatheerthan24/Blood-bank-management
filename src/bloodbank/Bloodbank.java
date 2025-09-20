package bloodbank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BloodBank {

    private List<Donor> donors;
    private List<Patient> patients;
    private List<BloodUnit> bloodUnits;
    private List<Staff> staffMembers;

    public BloodBank() {
        donors = new ArrayList<>();
        patients = new ArrayList<>();
        bloodUnits = new ArrayList<>();
        staffMembers = new ArrayList<>();
    }
// Donor&patient
    public void addDonor(Donor donor) {
        donors.add(donor);
        System.out.println("Donor added: " + donor.getName());
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient.getName());
    }
    // Staff
    public void addStaff(Staff staff) {
        staffMembers.add(staff);
        System.out.println("Staff added: " + staff.getName());
    }
    //Blood unit 
    public void addBloodUnit(BloodUnit unit) {
        bloodUnits.add(unit);
        System.out.println("Blood unit added: " + unit.getUnitId());
    }
    public void issueBlood(Patient patient, String bloodType, int unitsRequired) {
        int issued = 0;
        for (BloodUnit unit : bloodUnits) {
            if (unit.isAvailable() && unit.getBloodType().equalsIgnoreCase(bloodType)) {
                unit.markAsUsed();
                issued++;
                if (issued == unitsRequired) break;
            }
        }
        if (issued == unitsRequired) {
            System.out.println("Issued " + unitsRequired + " unit(s) of " + bloodType + " to " + patient.getName());
        } else {
            System.out.println("Not enough blood units available for " + bloodType);
        }
    }
    public void showAllDonors() {
        System.out.println("---- Donors ----");
        for (Donor d : donors) System.out.println(d);
    }
    public void showAllPatients() {
        System.out.println("---- Patients ----");
        for (Patient p : patients) System.out.println(p);
    }
    public void showAllBloodUnits() {
        System.out.println("---- Blood Units ----");
        for (BloodUnit b : bloodUnits) System.out.println(b);
    }
    public void showAllStaff() {
        System.out.println("---- Staff ----");
        for (Staff s : staffMembers) System.out.println(s);
    }
    //Expiry check
    public void checkExpiredUnits() {
        LocalDate today = LocalDate.now();
        System.out.println("---- Expired Blood Units ----");
        for (BloodUnit unit : bloodUnits) {
            if (unit.getExpiryDate().isBefore(today) && unit.isAvailable()) {
                System.out.println(unit + " [EXPIRED]");
            }
        }
    }
}
