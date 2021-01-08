<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<div class="container mt-3">
<div class="row">
<div class="col-md-12">

<h1 class="text-center">Welcome to UserCrud Application</h1>


</div>

</div>
</div>



<body>

<table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col"> Id</th>
      <th scope="col">First name</th>
      <th scope="col">Last name</th>
      <th scope="col">D.O.B</th>
        <th scope="col">Delete</th>
        <th scope="col">Edit</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${users}" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.fname}</td>
      <td>${p.lname}</td>
       <td class="font-weight-bold"> ${p.birthday}</td>
       <td >
       <a href="delete/${p.id}"><i class="fas fa-user-times  text-danger"></i></a>
       </td>
     <td>  <a href="update/${p.id}"><i class="fas fa-user-edit"></i></a></td>
    </tr>
    </c:forEach>
  
  </tbody>
</table>
`<div class="container text-center">
<a href="add" class="btn btn-outline-success" >Add user</a>
</div>
</body>
</html>
