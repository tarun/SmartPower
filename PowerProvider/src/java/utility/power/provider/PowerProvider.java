/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utility.power.provider;

import java.util.Map;
import java.util.Random;

/**
 *
 * @author Tarun
 */
public class PowerProvider {
    
    Map<String, SmartMeterInfo> registeredMeters;

    public Map<String, SmartMeterInfo> getRegisteredMeters() {
        return registeredMeters;
    }

    public void setRegisteredMeters(Map<String, SmartMeterInfo> registeredMeters) {
        this.registeredMeters = registeredMeters;
    }
    
    public String registerSmartMeter(String customerNumber, String meterID, String meterLocation, String meterDeviceInformation, String supportedConfigurationsInfo) {
        SmartMeterInfo newMeter = new SmartMeterInfo(customerNumber, meterID, meterLocation, meterDeviceInformation, supportedConfigurationsInfo);
        registeredMeters.put(meterID, newMeter);
        return "ok";
    }
    
    public String requestPowerProfile(String meterID, String powerRequirements) {
        String response = "";
        if(registeredMeters.containsKey(meterID)){
            SmartMeterInfo meter = registeredMeters.get(meterID);
            String supportedProfiles = meter.getSupportedPowerProfiles();
            String supportedLevels[] = supportedProfiles.split(",");
            int numberOfLevels = supportedLevels.length;
            Random random = new Random();
            random.nextInt(numberOfLevels);
            response = supportedLevels[random.nextInt(numberOfLevels)];
        }else{
            response = "fail. meter not registered";
        }
        return response;
    }

    public String tellPowerProfile(String meterID, String currentPowerProfile) {
        String response = "";
        if(registeredMeters.containsKey(meterID)){
            SmartMeterInfo meter = registeredMeters.get(meterID);
            meter.setCurrentPowerProfile(currentPowerProfile);
            registeredMeters.put(meterID, meter);
            response = "ok";
        }else{
            response = "fail. meter not registered";
        }
        return response;     
    }

    public String requestBillingInformation(String meterID, String billingPeriod) {
        String response = "";
        if(registeredMeters.containsKey(meterID)){
            SmartMeterInfo meter = registeredMeters.get(meterID);
            Random random = new Random();
            response = random.nextInt(500)+"";
        }else{
            response = "fail. meter not registered";
        }
        return response;    
    }

    public String payBill(String meterID, String customerAccountNumber, String amount) {
        String response = "";
        // Perform Payment
        if(registeredMeters.containsKey(meterID)){
            soa.BankServiceService service = new soa.BankServiceService();
	soa.BankService port = service.getBankServicePort();
	// TODO process result here
	String  result = port.transferMoney(customerAccountNumber, "482649", amount);
        if(result.equalsIgnoreCase("1")){
            response = "Payment successful"+result;
        }else{
            response = "Payment Failed";
        }                        
        }else{
            response = "fail. meter not registered";
        }
        return response;
    }    

}
