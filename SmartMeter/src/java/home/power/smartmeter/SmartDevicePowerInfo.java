/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package home.power.smartmeter;

/**
 *
 * @author Tarun
 */
public class SmartDevicePowerInfo {
    
    private String deviceID;
    String deviceName;
    String deviceType;
    String deviceModel;
    String powerRating;    
    
    private String supporedPowerLevels;
    private int numberOfPowerLevels;
    private String currentPowerLevel;

    public SmartDevicePowerInfo(String deviceID, String deviceName, String deviceType, String deviceModel, String powerRating) {
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceModel = deviceModel;
        this.powerRating = powerRating;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(String powerRating) {
        this.powerRating = powerRating;
    }
    
    
    
    public String getCurrentPowerLevel() {
        return currentPowerLevel;
    }

    public void setCurrentPowerLevel(String currentPowerLevel) {
        this.currentPowerLevel = currentPowerLevel;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public int getNumberOfPowerLevels() {
        return numberOfPowerLevels;
    }

    public void setNumberOfPowerLevels(int numberOfPowerLevels) {
        this.numberOfPowerLevels = numberOfPowerLevels;
    }

    public String getSupporedPowerLevels() {
        return supporedPowerLevels;
    }

    public void setSupporedPowerLevels(String supporedPowerLevels) {
        this.supporedPowerLevels = supporedPowerLevels;
    }
    
    

}
