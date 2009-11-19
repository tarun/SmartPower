<%-- 
    Document   : index
    Created on : May 4, 2008, 5:54:49 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Smart Device</title>
    </head>
    <body>
        <%
        home.devices.smartdevice.myDevice smartDevice = new home.devices.smartdevice.myDevice();
        home.devices.smartdevice.SmartDevice deviceState = smartDevice.getDevice();
        %>
        <h2>Welcome to SOAP Smart Device</h2>
        
        <b><i>Current Device Status : </i></b>
        <table border="1">
            <tr>                
                <th>Parameter</th>
                <th>State</th>
            </tr>
            <tr> <td>ID</td> <td>  <%= deviceState.getDeviceID() %> </td></tr>
            <tr> <td>Name</td> <td> <%= deviceState.getDeviceName() %> </td></tr>
            <tr> <td>Type </td> <td> <%= deviceState.getDeviceType() %> </td></tr>
            <tr> <td>Model </td> <td> > <%= deviceState.getDeviceModel() %> </td></tr>
            <tr> <td>Power Rating </td> <td> <%= deviceState.getPowerRating() %> </td></tr>
            <tr> <td>Supported Power Levels </td> <td>  <%= deviceState.getSupportedPowerLevels() %> </td></tr>
            <tr> <td>Current Power Configuration </td> <td> <%= deviceState.getCurrentPowerConfiguration() %></td> </tr>
            <tr> <td>Smart Feature Enabled </td> <td> <%= deviceState.isUseSmartFeatures() %> </td></tr>
        </table>
    <br />
    <a href="registerDevice.jsp">Register Device</a><br /><br />
    <a href="registerDeviceForProgramming.jsp">Register Device For Programming</a><br /><br />
    <a href="requestPowerConfiguration.jsp">Request Power Configuration</a><br /><br />
    
    </body>
</html>
