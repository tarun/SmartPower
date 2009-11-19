<%-- 
    Document   : BankStuff
    Created on : May 6, 2008, 7:25:13 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	soa.BankServiceService service = new soa.BankServiceService();
	soa.BankService port = service.getBankServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String sourceAccountNo = "";
	java.lang.String destinationAccountNo = "";
	java.lang.String amount = "";
	// TODO process result here
	java.lang.String result = port.transferMoney(sourceAccountNo, destinationAccountNo, amount);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
