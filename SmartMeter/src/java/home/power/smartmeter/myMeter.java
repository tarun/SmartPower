/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package home.power.smartmeter;

import java.util.HashMap;

/**
 *
 * @author Tarun
 */
public class myMeter {
    
    private static SmartMeter mySmartMeter = null;

    public myMeter() {
        getMeter();
    }
    
    public SmartMeter getMeter(){
        if(mySmartMeter == null){
            mySmartMeter = new SmartMeter();
            mySmartMeter.setCustomerNumber("PHLx"+Math.random());
            mySmartMeter.setDeviceInformation("GE Smart Meter 10x");
            mySmartMeter.setLocation("G86 MSC, Villanova");
            mySmartMeter.setMeterID("MZ "+Math.random());
            mySmartMeter.setSupportedPowerProfiles("off,standby,powersave,normal,high,full,");
            mySmartMeter.setCurrentPowerProfile("normal");
            mySmartMeter.setPowerConsumed(Math.random()*10);
            mySmartMeter.setRegisteredDevices(new HashMap<String, SmartDevicePowerInfo>());
        }
        
        return mySmartMeter;
    }

    public String registerDevice(String deviceName, String deviceType, String deviceModel, String powerRating) {        
        return mySmartMeter.registerDevice( deviceName, deviceType, deviceModel,powerRating);
    }
    
     public String registerDeviceForProgramming(String deviceID, String supportedPowerLevels) {
         return mySmartMeter.registerDeviceForProgramming(deviceID, supportedPowerLevels);
     }
     
    public String requestPowerConfiguration(String deviceID) {
        return mySmartMeter.requestPowerConfiguration(deviceID);
    }
    
     public String tellPowerConfigurationString(String deviceID, String currentPowerConfiguration) {
        return mySmartMeter.tellPowerConfigurationString( deviceID, currentPowerConfiguration);
    }

   public String unregisterDevice(String deviceID) {
       return mySmartMeter.unregisterDevice(deviceID);
    }
   
    public String requestConsumptionProfile(String frequency) {
        String reply;
        reply = "normal";       
        return reply;
    }
    
    public String requestConsumptionSummary(String fromDate, String toDate) {
        String reply;
        reply = "500 KWH";       
        return reply;        
    }

    public String setConsumptionProfile(String newPowerLevel) {
        String reply;
        reply = "accepted";       
        return reply;
    }

    public String processRegistrationResponse(String response){
        return mySmartMeter.processRegistrationResponse(response);
    }
    
    public String processRequestProfileResponse(String response){
        return mySmartMeter.processRequestProfileResponse(response);
    }
    
    public String processBillingInformation(String result){
        return mySmartMeter.processBillingInformation(result);
    }
}
