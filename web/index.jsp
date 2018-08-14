<%-- 
    Document   : index
    Created on : Oct 13, 2017, 1:56:55 PM
    Author     : Kim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css2/stylo.css"rel="stylesheet"> 
    </head>
    <body>
    
        
        <h1><b> Arc Online Booking System</b></h1>
        <h2>WELCOME CUSTOMER.</h2>
        <h2>PLEASE ENTER YOUR REGISTRATION DETAILS BELOW: </h2>
        <form action="verify.jsp" method="get" align="center">
            <tr>
           <td><br>Your full name : <input type="text" name="name"/></br><td>
            <td>Enter Phone. No. : <input type="char" name="phoneNo"/><td>
                <td> <br>Your email: <input type="email" name="email"/></br><td>
           
                <td>Marital Status: <input type="name" name="status"/><td>
               <tr>
            <br/><input type="submit"/>
            
        </form>
            
    </body>
</html>
