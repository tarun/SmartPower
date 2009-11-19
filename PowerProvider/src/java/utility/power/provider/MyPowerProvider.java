/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utility.power.provider;

import java.util.HashMap;

/**
 *
 * @author Tarun
 */
public class MyPowerProvider {
    
    private static PowerProvider powerProvider = null;
    
    public PowerProvider getPowerProvider(){
        if(powerProvider == null){
            powerProvider = new PowerProvider();
            powerProvider.setRegisteredMeters(new HashMap<String, SmartMeterInfo>());
        }
        if(powerProvider.getRegisteredMeters() == null){
            powerProvider.setRegisteredMeters(new HashMap<String, SmartMeterInfo>());
        }
        return powerProvider;
    }

    public MyPowerProvider() {
        getPowerProvider();
    }
    
    public String registerSmartMeter(String customerNumber, String meterID, String meterLocation, String meterDeviceInformation, String supportedConfigurationsInfo) {
        return powerProvider.registerSmartMeter(customerNumber, meterID, meterLocation, meterDeviceInformation, supportedConfigurationsInfo);
    }
    
    public String requestPowerProfile(String meterID, String powerRequirements) {
        return powerProvider.requestPowerProfile(meterID, powerRequirements);
    }

    public String tellPowerProfile(String meterID, String currentPowerProfile) {
        return powerProvider.tellPowerProfile(meterID, currentPowerProfile);
    }

    public String requestBillingInformation(String meterID, String billingPeriod) {
        return powerProvider.requestBillingInformation(meterID, billingPeriod);
    }

    public String payBill(String meterID, String amount, String customerAccountNumber) {
        return powerProvider.payBill(meterID, amount, customerAccountNumber);
    }

}
