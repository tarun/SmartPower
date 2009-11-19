/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utility.power.provider;

/**
 *
 * @author Tarun
 */
public class SmartMeterInfo {
    
    private String customerNumber;
    private String meterID;    
    private String location;
    private String deviceInformation;
    
    private String supportedPowerProfiles;
    private String currentPowerProfile;
    
    private double powerConsumed;

    public SmartMeterInfo(String customerNumber, String meterID, String location, String deviceInformation, String supportedPowerProfiles) {
        this.customerNumber = customerNumber;
        this.meterID = meterID;
        this.location = location;
        this.deviceInformation = deviceInformation;
        this.supportedPowerProfiles = supportedPowerProfiles;
    }

    public String getCurrentPowerProfile() {
        return currentPowerProfile;
    }

    public void setCurrentPowerProfile(String currentPowerProfile) {
        this.currentPowerProfile = currentPowerProfile;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getDeviceInformation() {
        return deviceInformation;
    }

    public void setDeviceInformation(String deviceInformation) {
        this.deviceInformation = deviceInformation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMeterID() {
        return meterID;
    }

    public void setMeterID(String meterID) {
        this.meterID = meterID;
    }

    public double getPowerConsumed() {
        return powerConsumed;
    }

    public void setPowerConsumed(double powerConsumed) {
        this.powerConsumed = powerConsumed;
    }

    public String getSupportedPowerProfiles() {
        return supportedPowerProfiles;
    }

    public void setSupportedPowerProfiles(String supportedPowerProfiles) {
        this.supportedPowerProfiles = supportedPowerProfiles;
    }
    
    
    
}
