
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
  <meta charset="UTF-8">
  <title>Employee Details</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
  * {box-sizing: border-box;}
  
  body {
    margin: 0;
    font-family: Arial, Helvetica, sans-serif;
  }
  
  .topnav {
    overflow: hidden;
    background-color: #e9e9e9;
  }
  
  .topnav a {
    float: left;
    display: block;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
  }
  
  .topnav a:hover {
    background-color: #ddd;
    color: black;
  }
  
  .topnav a.active {
    background-color: #2196F3;
    color: white;
  }
  
  .topnav .search-container {
    float: right;
  }
  
  .topnav input[type=text] {
    padding: 6px;
    margin-top: 8px;
    font-size: 17px;
    border: none;
  }
  
  .topnav .search-container button {
    float: right;
    padding: 6px;
    margin-top: 8px;
    margin-right: 16px;
    background: #ddd;
    font-size: 17px;
    border: none;
    cursor: pointer;
  }
  
  .topnav .search-container button:hover {
    background: #ccc;
  }
  
  @media screen and (max-width: 600px) {
    .topnav .search-container {
      float: none;
    }
    .topnav a, .topnav input[type=text], .topnav .search-container button {
      float: none;
      display: block;
      text-align: left;
      width: 100%;
      margin: 0;
      padding: 14px;
    }
    .topnav input[type=text] {
      border: 1px solid #ccc;  
    }
  }
  </style>
  </head>
  <body>
  
  <div class="topnav">
    <a>Employee Details</a>
    
    <div class="search-container">
      <!-- Enter the action as the find by uri find by  -->
      <form action="showemployee" method="GET">
        <input type="text"  placeholder="Enter Employee Id" name="id">
        <button type="submit">Search</button>
      </form>
    </div>
  </div>
  
  <br> 
<br>

<!-- Show all Employee Details -->
<form action="showall" method="GET">
<input type="submit" value="Get All Employee Details">
</form>

<!-- Show Specific Employee Details -->
<form action="showemployee" method="GET">
<input type="text"  placeholder="Enter employee id" name="id">
<input type="submit" value="Get Details">
</form>

<!-- Delete Employee Details -->
<form action="deleteemployee" method="GET">
  <input type="text"  placeholder="Enter employee id" name="id">
<input type="submit" value="Delete Employee">
</form>

<!-- Add Employee Details -->
<form action="addemployee" method="POST">
  <br><br>
<input type="text"  placeholder="employee id" name="employee_id"><br>
<input type="text"  placeholder="Name" name="employee_name"><br>
<input type="text"  placeholder="Role" name="employee_role"><br>
<input type="text"  placeholder="Salary" name="employee_salary"><br>
<input type="submit" value="Add Employee">
</form>

</body>
</html>