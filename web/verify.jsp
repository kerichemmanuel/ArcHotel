<%-- 
    Document   : verify
    Created on : Oct 13, 2017, 2:04:37 PM
    Author     : Kim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <%!String phoneNo,email,mariageStatus,name ;%>
        <%
            phoneNo = request.getParameter("phoneNo");
            email = request.getParameter("email");
           
            if(phoneNo.equals("0791032701")&&
                    
                    email.equals("arc@gmail.com") )
            {%>
            <jsp:forward page="Welcome.jsp"/>
            <%} else
{%>
                      Wrong Information, Try Again!!!
                      <jsp:include page="index.jsp"/>
                      <%}%>
    </body>
</html>
