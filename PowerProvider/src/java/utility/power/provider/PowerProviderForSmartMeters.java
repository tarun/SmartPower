/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utility.power.provider;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Tarun
 */
@WebService()
public class PowerProviderForSmartMeters {

    MyPowerProvider powerProvider = new MyPowerProvider();
/**
     * Web service operation
     */
    @WebMethod(operationName = "registerSmartMeter")
    public String registerSmartMeter(@WebParam(name = "customerNumber")
    String customerNumber, @WebParam(name = "meterID")
    String meterID, @WebParam(name = "meterLocation")
    String meterLocation, @WebParam(name = "meterDeviceInformation")
    String meterDeviceInformation, @WebParam(name = "supportedConfigurationsInfo")
    String supportedConfigurationsInfo) {
        return powerProvider.registerSmartMeter(customerNumber, meterID, meterLocation, meterDeviceInformation, supportedConfigurationsInfo);
    }

/**
     * Web service operation
     */
    @WebMethod(operationName = "requestPowerProfile")
    public String requestPowerProfile(@WebParam(name = "meterID")
    String meterID, @WebParam(name = "powerRequirements")
    String powerRequirements) {
        return powerProvider.requestPowerProfile(meterID, powerRequirements);
    }

/**
     * Web service operation
     */
    @WebMethod(operationName = "tellPowerProfile")
    public String tellPowerProfile(@WebParam(name = "meterID")
    String meterID, @WebParam(name = "currentPowerProfile")
    String currentPowerProfile) {
        return powerProvider.tellPowerProfile(meterID, currentPowerProfile);
    }

/**
     * Web service operation
     */
    @WebMethod(operationName = "requestBillingInformation")
    public String requestBillingInformation(@WebParam(name = "meterID")
    String meterID, @WebParam(name = "billingPeriod")
    String billingPeriod) {
        return powerProvider.requestBillingInformation(meterID, billingPeriod);
    }

/**
     * Web service operation
     */
    @WebMethod(operationName = "payBill")
    public String payBill(@WebParam(name = "meterID")
    String meterID, @WebParam(name = "amount")
    String amount, @WebParam(name = "customerAccountNumber")
    String customerAccountNumber) {
        return powerProvider.payBill(meterID, amount, customerAccountNumber);
    }

}
