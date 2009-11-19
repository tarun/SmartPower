/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package home.devices.smartdevice;

/**
 *
 * @author Tarun
 */
public class SmartDevice {
    
    // Flags
    private boolean useSmartFeatures;
    
    // Device Information
    private String deviceName;
    private String deviceType;
    private String deviceModel;
    private String powerRating;
    
    // Registration Information
    private String deviceID;
    
    // Power Configuration Information
    private String supportedPowerLevels;
    private String currentPowerConfiguration;

    // Constructor
    public SmartDevice() {
        this.useSmartFeatures = false;
        this.deviceName = "";
        this.deviceType = "";
        this.deviceModel = "";
        this.powerRating = "";
        this.deviceID = "";
        this.supportedPowerLevels = "";
        this.currentPowerConfiguration = "";
    }

    public SmartDevice(boolean useSmartFeatures, String deviceName, String deviceType, String deviceModel, String powerRating, String deviceID, String supportedPowerLevels, String currentPowerConfiguration) {
        this.useSmartFeatures = useSmartFeatures;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceModel = deviceModel;
        this.powerRating = powerRating;
        this.deviceID = deviceID;
        this.supportedPowerLevels = supportedPowerLevels;
        this.currentPowerConfiguration = currentPowerConfiguration;
    }
    
    public String getCurrentPowerConfiguration() {
        return currentPowerConfiguration;
    }

    public void setCurrentPowerConfiguration(String currentPowerConfiguration) {
        this.currentPowerConfiguration = currentPowerConfiguration;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
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

    public String getSupportedPowerLevels() {
        return supportedPowerLevels;
    }

    public void setSupportedPowerLevels(String supportedPowerLevels) {
        this.supportedPowerLevels = supportedPowerLevels;
    }

    public boolean isUseSmartFeatures() {
        return useSmartFeatures;
    }

    public void setUseSmartFeatures(boolean useSmartFeatures) {
        this.useSmartFeatures = useSmartFeatures;
    }
        
}
