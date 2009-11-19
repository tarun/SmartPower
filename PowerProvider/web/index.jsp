<%-- 
    Document   : index
    Created on : May 6, 2008, 8:30:12 AM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Power Provider</title>
    </head>
    <body>
        <h2>Welcome to Power Provider</h2>
        <% 
        utility.power.provider.MyPowerProvider powerProvider = new utility.power.provider.MyPowerProvider();
        utility.power.provider.PowerProvider providerState = powerProvider.getPowerProvider();                
        %>
        <br />
        <h2><i>Registered Meters</i></h2>
        <table border="1">        
            <tr><th>ID</th><th>Customer Number</th></tr>
        <% 
            java.util.Map registeredMeters = providerState.getRegisteredMeters();
            for(java.util.Iterator<utility.power.provider.SmartMeterInfo> iterator = registeredMeters.values().iterator(); iterator.hasNext();){
                utility.power.provider.SmartMeterInfo smartMeter = iterator.next();                
             %> <tr><td> <%= smartMeter.getMeterID() %> </td>
             <td> <%= smartMeter.getCustomerNumber() %> </td>
             </tr> <%
            }
        %>
    </table>    
    </body>
</html>
