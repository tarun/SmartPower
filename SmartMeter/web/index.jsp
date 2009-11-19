<%-- 
    Document   : index
    Created on : May 4, 2008, 5:08:13 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Smart Meter</title>
    </head>
    <body>
        <%
            home.power.smartmeter.myMeter smartMeter = new home.power.smartmeter.myMeter();
            home.power.smartmeter.SmartMeter meterState = smartMeter.getMeter();
        %>
        
        <h2><i>Welcome to SOAP Smart Meter</i></h2>
        
        <b><i>Current Meter Status : </i></b>
        <table border="1">
            <tr>
                <th>Parameter</th>
                <th>State</th>
            </tr>
            <tr><td>Meter ID</td><td> <%= meterState.getMeterID() %>  </td></tr>
            <tr><td>Customer Number</td><td> <%= meterState.getCustomerNumber()  %> </td></tr>
            <tr><td>Location</td><td> <%= meterState.getLocation() %> </td></tr>
            <tr><td>Meter Device Information </td><td> <%= meterState.getDeviceInformation() %> </td></tr>
            <tr><td>Supported Power Profiles </td><td> <%= meterState.getSupportedPowerProfiles() %> </td>
            <tr><td>Current Power Profiles </td><td><b> <%= meterState.getCurrentPowerProfile() %> </b></td>           
        </table>
        
        <h3><i>Registered Devices</i></h3>
                <table border="1">
                    <tr><th>DeviceID</th><th>Device Name</th><th>Device Type</th></tr>
        <% 
            java.util.Map registeredDevices = meterState.getRegisteredDevices();
            for(java.util.Iterator<home.power.smartmeter.SmartDevicePowerInfo> iterator = registeredDevices.values().iterator(); iterator.hasNext();){
                home.power.smartmeter.SmartDevicePowerInfo smartDevice = iterator.next();                
             %> <tr><td> <%= smartDevice.getDeviceID() %> </td>
             <td> <%= smartDevice.getDeviceName() %> </td>
             <td> <%= smartDevice.getDeviceType() %> </td>
             </tr><%
            }
        %>
    </table>
    <h3><i>Perform Operations</i></h3>
    <a href="registerSmartMeter.jsp">Register Smart Meter</a><br /><br />
    <a href="requestBillingInformation.jsp">Request Billing Information</a><br /><br />
    <a href="requestPowerProfile.jsp">Request Power Profile</a><br /><br />
    <a href="tellPowerProfile.jsp">Tell Power Profile</a><br /><br />
    <a href="payBill.jsp">Pay Bill</a>  <br /><br />
    </body>    
</html>
