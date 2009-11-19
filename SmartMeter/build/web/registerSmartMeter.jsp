<%-- 
    Document   : registerSmartMeter
    Created on : May 6, 2008, 3:23:13 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Smart Meter With Power Provider</title>
    </head>
    <body>
        <%
            home.power.smartmeter.myMeter smartMeter = new home.power.smartmeter.myMeter();
            home.power.smartmeter.SmartMeter meterState = smartMeter.getMeter();
        %>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	utility.power.provider.PowerProviderForSmartMetersService service = new utility.power.provider.PowerProviderForSmartMetersService();
	utility.power.provider.PowerProviderForSmartMeters port = service.getPowerProviderForSmartMetersPort();
	 // TODO initialize WS operation arguments here
	java.lang.String customerNumber = meterState.getCustomerNumber();
	java.lang.String meterID = meterState.getMeterID();
	java.lang.String meterLocation = meterState.getLocation();
	java.lang.String meterDeviceInformation = meterState.getDeviceInformation();
	java.lang.String supportedConfigurationsInfo = meterState.getSupportedPowerProfiles();
	// TODO process result here
	java.lang.String result = port.registerSmartMeter(customerNumber, meterID, meterLocation, meterDeviceInformation, supportedConfigurationsInfo);
                
	out.println("Result = "+result);
        out.println("<br />Smart Meter Status : "+smartMeter.processRegistrationResponse(result));
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    <br /><a href="index.jsp">Home</a>
    </body>
</html>
