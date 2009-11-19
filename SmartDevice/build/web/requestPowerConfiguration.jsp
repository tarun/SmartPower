<%-- 
    Document   : requestPowerConfiguration
    Created on : May 6, 2008, 1:02:30 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request Power Configuration</title>
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
	 // TODO initialize WS operation arguments here
	java.lang.String deviceID = deviceState.getDeviceID();
	// TODO process result here
	java.lang.String result = port.requestPowerConfiguration(deviceID);
	out.println("Result = "+result);        
        out.println("Smart Device Status : " + smartDevice.processPowerConfiguration(result));
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <br /><a href="index.jsp">Home</a>
    </body>
</html>
