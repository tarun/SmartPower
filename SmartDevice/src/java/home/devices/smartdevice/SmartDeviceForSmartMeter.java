/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package home.devices.smartdevice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Tarun
 */
@WebService()
public class SmartDeviceForSmartMeter {

     myDevice smartDevice = new myDevice();
        
/**
     * SmartMeter Calls this method to set the power configuration of the device
     * 
     * @param newPowerLevel The new power level to switch to (mainly from the list of values submitted while registering)
     * @param priority The new power configuration priority (possible values are info,low,normal,high,critical)
     * @return acknowledgement/response - 'accepted', 'declined' or any other status/error message
     */
    @WebMethod(operationName = "setPowerConfiguration")
    public String setPowerConfiguration(@WebParam(name = "newPowerLevel")
    String newPowerLevel, @WebParam(name = "priority")
    String priority) {
        // Ignoring priority
        return smartDevice.processPowerConfiguration(newPowerLevel);
    }

/**
     * SmartMeter calls this method to tell the device that it is being de-registered (eg. in case smartmeter is shutting down for maintenance)
     *
     * @param timeBeforeConnectingAgain Time gap before trying to registed again with the smart meter (time in seconds eg. 500s, or 0 for no time specified)
     * @return acknowledgement/response - 'ok' or any other message
     */
    @WebMethod(operationName = "unregister")
    public String unregister(@WebParam(name = "timeBeforeConnectingAgain")
    String timeBeforeConnectingAgain) {
        return smartDevice.processUnregister(timeBeforeConnectingAgain);
    }

/**
     * SmartMeter calls the method to query the current power configuration of the device
     *
     * @param frequency The time interval of how often the device should send power configuration information again. can be ignored
     * @return  The current power configuration
     */
    @WebMethod(operationName = "requestPowerConfiguration")
    public String requestPowerConfiguration(@WebParam(name = "frequency")
    String frequency) {
        return smartDevice.getDevice().getCurrentPowerConfiguration();
    }

}
