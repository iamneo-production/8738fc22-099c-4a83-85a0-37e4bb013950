<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*, model.Employee" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        table, th, td {
          border:1px solid black;
        }
        </style>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>

    <body>
        <center><h1>Employee Details</h1></center>
        <br>
        <%
        List<Employee> employee = (List<Employee>)request.getAttribute("employee");
        %>
        
        <table style="width:100%">
        <thead>
        <tr>
        <th> Id </th>
        <th> Name </th>
        <th> Role </th>
        <th> Salary </th>
        </tr>
        </thead>
        <tbody>
        <% for(Employee m:employee){%>
            <tr>
            <td><%= m.getEmployee_id() %></td>
            <td><%= m.getEmployee_name() %></td>
            <td><%= m.getEmployee_role() %></td>
            <td><%= m.getEmployee_salary() %></td>
            </tr>
        <%}%>

        </tbody>
        </table>
        </body>
        </html>