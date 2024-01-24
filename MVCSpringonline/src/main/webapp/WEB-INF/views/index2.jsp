
<%@page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<center>
<!--  using getattribute 
<h1>welcome to spring class</h1>
<h2>hope you are learning things</h2>

<%
    Integer id=(Integer)request.getAttribute("id");
    String name=(String)request.getAttribute("name");
   LocalDateTime lt=(LocalDateTime)request.getAttribute("time");
%>
<h1>id is:<%=id %></h1>
<h1>name is:<%=name %></h1>
<h1><%= lt%></h1>
-->

<!-- using JSTl -->
<h1>Id is:---
${id}
</h1>
<h1>Name is:---
${name}
</h1>
<h1>Time is:---
${time}
</h1>
</center>
</body>
</html>