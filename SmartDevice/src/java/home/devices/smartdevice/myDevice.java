/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package home.devices.smartdevice;

/**
 *
 * @author Tarun
 */
public class myDevice {
   
    private static SmartDevice smartDevice = null;
       
    public SmartDevice getDevice(){
        if(smartDevice == null){
            smartDevice = new SmartDevice();
            
            smartDevice.setUseSmartFeatures(true);
            
            smartDevice.setDeviceName("my TV");
            smartDevice.setDeviceType("Television");
            smartDevice.setDeviceModel("Bravia HDTV");
            smartDevice.setPowerRating("700 W");
            
            smartDevice.setCurrentPowerConfiguration("normal");
            smartDevice.setSupportedPowerLevels("off,standby,powersave,normal,high,full,");
        }
        return smartDevice;
    }

    public myDevice() {
        getDevice();
    }
    
    public String processRegistration(String registrationResponse){
        String status = "";
        
        if(registrationResponse.startsWith("fail")){
            // Registration Failed
            status = "Registration Failed. Reason : " + registrationResponse;
        }else{
            smartDevice.setDeviceID(registrationResponse);
            status = "Registration Successful. Device ID = " + registrationResponse;
        }
        return status;
    }
    
    public String processPowerConfiguration(String newPowerConfig){
        String powerConfigurationStatus = "";
        
        String supportedPowerLevels = smartDevice.getSupportedPowerLevels();
        if(supportedPowerLevels.contains(newPowerConfig+",")){
            smartDevice.setCurrentPowerConfiguration(newPowerConfig);
            powerConfigurationStatus = "accepted";
        }else{
            powerConfigurationStatus = "declined (unsupported power level)";
        }
        
        return powerConfigurationStatus;
    }
       
    public String processUnregister(String unregisterMessage){
        String unregisterResponse = "ok";
            smartDevice.setUseSmartFeatures(false);
            smartDevice.setDeviceID("");
        return unregisterResponse;
    }
    
    public String processUnregisterResponse(String unregisterResponse){
        String status = "";
        
        if(unregisterResponse.startsWith("ok")){
            status = "successfully unregistered";
            smartDevice.setUseSmartFeatures(false);
            smartDevice.setDeviceID("");
//            smartDevice == null;
        }else{
            status = "UnRegistration Failed because of "+unregisterResponse;
        }
        
        return status;
    }
}
