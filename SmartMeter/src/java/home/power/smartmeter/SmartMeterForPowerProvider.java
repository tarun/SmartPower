/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package home.power.smartmeter;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Tarun
 */
@WebService()
public class SmartMeterForPowerProvider {

    myMeter mySmartMeter = new myMeter();
    
/**
     * Web service operation
     */
    @WebMethod(operationName = "requestConsumptionProfile")
    public String requestConsumptionProfile(@WebParam(name = "frequency")
    String frequency) {
        return mySmartMeter.requestConsumptionProfile(frequency);
    }

/**
     * Web service operation
     */
    @WebMethod(operationName = "requestConsumptionSummary")
    public String requestConsumptionSummary(@WebParam(name = "fromDate")
    String fromDate, @WebParam(name = "toDate")
    String toDate) {
        return mySmartMeter.requestConsumptionSummary(fromDate, toDate);
    }

/**
     * Web service operation
     */
    @WebMethod(operationName = "setConsumptionProfile")
    public String setConsumptionProfile(@WebParam(name = "newPowerLevel")
    String newPowerLevel) {
        return mySmartMeter.setConsumptionProfile(newPowerLevel);
    }

}
