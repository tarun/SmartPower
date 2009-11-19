<%-- 
    Document   : requestBillingInformation
    Created on : May 6, 2008, 3:38:14 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request Billing Information</title>
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
	java.lang.String meterID = meterState.getMeterID();
	java.lang.String billingPeriod = "APR";
	// TODO process result here
	java.lang.String result = port.requestBillingInformation(meterID, billingPeriod);
	out.println("Result = "+result);
        out.println("Smart Meter Status "+smartMeter.processBillingInformation(result));
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    <br /><a href="index.jsp">Home</a>
    </body>
</html>
