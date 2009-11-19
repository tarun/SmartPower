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
public class SmartMeterForDevices {   
    
/**
     * SmartDevices should call this service to register
     * 
     * @param deviceName    your personal device name (e.g. my kitchen microwave)
     * @param deviceType    device class type (e.g. microwave, refrigerator, heating, air conditioner
     * @param deviceModel   any custom model number string (e.g. GE 1590x, Sony Bravio 597z)
     * @param powerRating   power rating wattage (e.g. 1.5 kW)
     * @return  If successful the unique device id (e.g. <deviceID=6>) or any other error message. this device id must be used in all calls made to the smart meter again
     */
    @WebMethod(operationName = "registerDevice")
    public String registerDevice(@WebParam(name = "deviceName")
    String deviceName, @WebParam(name = "deviceType")
    String deviceType, @WebParam(name = "deviceModel")
    String deviceModel, @WebParam(name = "powerRating")
    String powerRating) {
        myMeter mySmartMeter = new myMeter();
        return mySmartMeter.registerDevice( deviceName, deviceType, deviceModel,powerRating);
    }

/**
     * SmartDevices should call this service to register as devices capable for power profile configuration
     * 
     * @param deviceID  the device ID got during registration, this uniquely identifies the device making the call
     * @param supportedPowerLevels  a comma separated list of supported power levels (for now please use off,standby,powersave,normal,high,full )
     * @return  acknowledgement/response - 'success' or 'fail'
     */
    @WebMethod(operationName = "registerDeviceForProgramming")
    public String registerDeviceForProgramming(@WebParam(name = "deviceID")
    String deviceID, @WebParam(name = "supportedPowerLevels")
    String supportedPowerLevels) {
        myMeter mySmartMeter = new myMeter();
        return mySmartMeter.registerDeviceForProgramming(deviceID, supportedPowerLevels);
    }

/**
     * A smart device is requesting what power configuration it needs to use.
     * 
     * @param deviceID  the device ID got during registration, this uniquely identifies the device making the call
     * @return  The power level at which the device should operate
     */
    @WebMethod(operationName = "requestPowerConfiguration")
    public String requestPowerConfiguration(@WebParam(name = "deviceID")
    String deviceID) {
        myMeter mySmartMeter = new myMeter();
        return mySmartMeter.requestPowerConfiguration(deviceID);
    }

/**
     * The smart device voluntarily tells the smart meter its current power configuration
     * 
     * @param deviceID  the device ID got during registration, this uniquely identifies the device making the call
     * @param currentPowerConfiguration The current power level at which the device is operating
     * @return
     */
    @WebMethod(operationName = "tellPowerConfiguration")
    public String tellPowerConfiguration(@WebParam(name = "deviceID")
    String deviceID, @WebParam(name = "currentPowerConfiguration")
    String currentPowerConfiguration) {
        myMeter mySmartMeter = new myMeter();
        return mySmartMeter.tellPowerConfigurationString( deviceID, currentPowerConfiguration);
    }

/**
     * SmartDevices call this service to unregister from the SmartMeter
     * 
     * @param deviceID  the device ID got during registration, this uniquely identifies the device making the call
     * @return  acknowledgement - 'ok' or any other message
     */
    @WebMethod(operationName = "unregisterDevice")
    public String unregisterDevice(@WebParam(name = "deviceID")
    String deviceID) {
        myMeter mySmartMeter = new myMeter();
        return mySmartMeter.unregisterDevice(deviceID);
    }

/**
     * Web service operation
     */
}
