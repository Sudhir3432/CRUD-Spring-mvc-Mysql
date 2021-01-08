<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@include file="./base.jsp"  %>
 
</head>
<body>
<div class="container mt-3">

<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center mb-3">Fill the user details</h1>
<form action="handle" method="post">

<div class="form-group">
<label for="fname">First name</label>
<input type="text" class="form-control" id="fname" aria-decribedby="emailHelp"
 name="fname" placeholder="Enter Your first name here">
</div>

<div class="form-group">
<label for="lname">Last name</label>
<input type="text" class="form-control" id="lname" aria-decribedby="emailHelp"
 name="lname" placeholder="Enter Your last name here">
</div>

<div class="form-group">
<label for="birthday">Date Of Birth</label>
<input type="date" class="form-control input-sm" name="birthday" placeholder="yyyy-MM-dd"></input>
</div>

<div class="container text-center">
<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Add</button>
</div>
</form>
</div>
</div>
</div>


</body>
</html>