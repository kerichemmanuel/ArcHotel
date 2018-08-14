<%-- 
    Document   : Welcome
    Created on : Oct 13, 2017, 2:16:16 PM
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
        <body text ="black">
        <%! String phoneNo,name,email, mariageStatus; %>
        <%
            name =request.getParameter("name");
            phoneNo = request.getParameter("phoneNo");
            email = request.getParameter("email");
            mariageStatus = request.getParameter("status");
            %>
            <h3>  Registration successful,</h3> <%=name%>,
            
            <br/>
          
            <p> These are the details you entered: <p>
         <table cell spacing="2" cellpadding="2" border="5"  >
<tr>
           <td><p> User Name, <%=phoneNo%> <p><td>
          <td><p> email, <%=email%><p><td>
              <td><p> maritalStatus, <%=mariageStatus%><p><td>
                   <td><p>phoneNo, <%=phoneNo%><p><td>
           
      <tr>
          
            
        
    </body>
</html>
