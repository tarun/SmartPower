<%-- 
    Document   : registerDevice
    Created on : May 6, 2008, 12:56:50 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Smart Device Registration Page</title>
    </head>
    <body>
        <%
        home.devices.smartdevice.myDevice smartDevice = new home.devices.smartdevice.myDevice();
        home.devices.smartdevice.SmartDevice deviceState = smartDevice.getDevice();
        %>      
            <%-- start web service invocation --%><hr/>
    <%
    try {
	home.power.smartmeter.SmartMeterForDevicesService service = new home.power.smartmeter.SmartMeterForDevicesService();
	home.power.smartmeter.SmartMeterForDevices port = service.getSmartMeterForDevicesPort();
	
        
	
        /*
        java.lang.String deviceName = request.getParameter("deviceName"); // your personal device name
	java.lang.String deviceType = request.getParameter("deviceType"); // device class type
	java.lang.String deviceModel = request.getParameter("deviceModel"); // any custom string
	java.lang.String powerRating = request.getParameter("powerRating"); // Give power rating here with suffix kWh
        */

        java.lang.String deviceName = deviceState.getDeviceName(); // your personal device name
	java.lang.String deviceType = deviceState.getDeviceType(); // device class type
	java.lang.String deviceModel = deviceState.getDeviceModel(); // any custom string
	java.lang.String powerRating = deviceState.getPowerRating(); // Give power rating here with suffix kWh
                      
// Result
        java.lang.String result = port.registerDevice(deviceName, deviceType, deviceModel, powerRating);
        out.println(smartDevice.processRegistration(result));        
    } catch (Exception ex) {
	out.println("Error Registering Device");
    }
    %>
    <%-- end web service invocation --%><hr/>
    <br /><a href="index.jsp">Home</a>
    </body>
</html>
