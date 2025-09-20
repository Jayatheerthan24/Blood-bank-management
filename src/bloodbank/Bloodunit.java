package bloodbank;

import java.time.LocalDate;

public class BloodUnit {
    private String bloodType;
    private String unitId;
    private LocalDate expiryDate;
    private boolean isAvailable;

    public BloodUnit(String unitId, String bloodType, LocalDate expiryDate) {
        this.unitId = unitId;
        this.bloodType = bloodType;
        this.expiryDate = expiryDate;
        this.isAvailable = true;
    }
    public String getBloodType() {
        return bloodType;
    }
    public String getUnitId() {
        return unitId;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void markAsUsed() {
        this.isAvailable = false;
    }

    @Override
    public String toString() {
        return "Unit ID: " + unitId + ", Blood Type: " + bloodType + ", Expiry: " + expiryDate + ", Available: " + isAvailable;
    }
}
