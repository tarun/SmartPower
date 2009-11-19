/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package home.power.smartmeter;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Tarun
 */
public class SmartMeter {

    private String meterID;
    private String customerNumber;
    private String location;
    private String deviceInformation;
    
    private String supportedPowerProfiles;
    private String currentPowerProfile;
    
    private double powerConsumed;
    private double outStandingAmount;

    public double getOutStandingAmount() {
        return outStandingAmount;
    }

    public void setOutStandingAmount(double outStandingAmount) {
        this.outStandingAmount = outStandingAmount;
    }
    
    private Map<String, SmartDevicePowerInfo> registeredDevices;
    
    private int devicesSequence = 1;
    
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

    public Map<String, SmartDevicePowerInfo> getRegisteredDevices() {
        return registeredDevices;
    }

    public void setRegisteredDevices(Map<String, SmartDevicePowerInfo> registeredDevices) {
        this.registeredDevices = registeredDevices;
    }

    
    // Perform Operations    
     public String registerDevice(String deviceName, String deviceType, String deviceModel, String powerRating) {        
        String registrationStatus = "";
        
        // Register Device
        String deviceID = ++devicesSequence + "";
        SmartDevicePowerInfo newDevice = new SmartDevicePowerInfo(deviceID,deviceName,deviceType,deviceModel,powerRating);
        registeredDevices.put(deviceID, newDevice);
        registrationStatus = deviceID;

        return registrationStatus;
    }
    
     public String registerDeviceForProgramming(String deviceID, String supportedPowerLevels) {
         String status = "";
         if(registeredDevices.containsKey(deviceID)){
             SmartDevicePowerInfo device = registeredDevices.get(deviceID);
             device.setSupporedPowerLevels(supportedPowerLevels);
             status = "success";
         }else{
             status = "fail. Device Not Registered";
         }
         return status;
     }
     
    public String requestPowerConfiguration(String deviceID) {
        String reply;
//        int numberOfMeterPowerProfiles = supportedPowerProfiles.split(",").length;
        reply = this.currentPowerProfile;
        return reply;
    }
    
     public String tellPowerConfigurationString(String deviceID, String currentPowerConfiguration) {
        String status = "";
         if(registeredDevices.containsKey(deviceID)){
             SmartDevicePowerInfo device = registeredDevices.get(deviceID);
             device.setCurrentPowerLevel(currentPowerConfiguration);
             registeredDevices.put(deviceID, device);
             status = "success";
         }else{
             status = "fail. Device Not Registered";
         }
         return status;         
    }

   public String unregisterDevice(String deviceID) {
       String status = "";
         if(registeredDevices.containsKey(deviceID)){
             registeredDevices.remove(deviceID);             
             status = "ok";
         }else{
             status = "fail. Device Not Registered";
         }
         return status;
    }
   
   
    public String requestConsumptionProfile(String frequency) {
        return this.getCurrentPowerProfile();
    }
    
    public String requestConsumptionSummary(String fromDate, String toDate) {
        String reply = this.getPowerConsumed()+" kWH";
        return reply;        
    }

    public String setConsumptionProfile(String newPowerLevel) {
                String powerConfigurationStatus = "";        
        if(supportedPowerProfiles.contains(newPowerLevel+",")){
            this.setCurrentPowerProfile(newPowerLevel);
            powerConfigurationStatus = "accepted";
        }else{
            powerConfigurationStatus = "declined (unsupported power level)";
        }
                
        return powerConfigurationStatus;
    }

    public String processRegistrationResponse(String response){
        String status;
        if(response.startsWith("ok")){
            status = "Registration Successful";
        }else{
            status = "Registration Failed. Cause :"+response;
        }
        return status;
    }
    
    public String processRequestProfileResponse(String response){
                String status;
        if(!response.startsWith("fail")){
            status = this.setConsumptionProfile(response);
        }else{
            status = "Getting Consumption Profile Failed. Cause :"+response;
        }
        return status;
    }
    
    public String processBillingInformation(String response){
        String status;
        if(!response.startsWith("fail")){
            outStandingAmount = Double.parseDouble(response);
            status = "Outstanding Bill Amount : "+this.outStandingAmount;
        }else{
            status = "Getting Billing Information Failed. Cause :"+response;
        }
        return status;        
    }
}
