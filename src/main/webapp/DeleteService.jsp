<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Service</title>
</head>
<body>
    <%
        // Get the service ID from the query string
        String sid = request.getParameter("sid");
    %>
    <h1>Are you sure you want to delete this service?</h1>
    <form action="DeleteService" method="post">
        <input type="hidden" name="sid" value="<%=sid%>">
        <input type="submit" value="Yes">
        <button type="button" onclick="location.href='ActivatedServices.jsp'">No</button>
    </form>
</body>
</html>
