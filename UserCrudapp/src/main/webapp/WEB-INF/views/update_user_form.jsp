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
<h1 class="text-center mb-3">Update User Information</h1>

<form action="${pageContext.request.contextPath}/handle" method="post">
<input type="hidden" value="${user.id }" name="id"></input>

<div class="form-group">
<label for="fname">First name</label>
<input type="text" class="form-control" id="fname" aria-decribedby="emailHelp"
 name="fname"  value="${user.fname }" placeholder="Enter Your first name here">
</div>

<div class="form-group">
<label for="lname">Last name</label>
<input type="text" class="form-control" id="lname" aria-decribedby="emailHelp"
 name="lname"  value="${user.lname }" placeholder="Enter Your last name here">
</div>

<div class="form-group">
<label for="birthday">birthday</label>
<input type="date" class="form-control input-sm" name="birthday"  value="${user.birthday}" placeholder="yyyy-MM-dd">
</input>
</div>

<div class="container text-center">
<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-warning">update</button>
</div>
</form>
</div>
</div>
</div>


</body>
</html>