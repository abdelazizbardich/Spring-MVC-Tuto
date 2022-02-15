<%--
  Created by IntelliJ IDEA.
  User: abdelazizbardich
  Date: 15‏/2‏/2022
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-12 text-center my-3">
            <h1 class="text-center">SignUp Form</h1>
        </div>
        <form class="col-md-6 m-auto" method="post" action="${pageContext.request.contextPath}/signup">
            <div class="form-group mb-2">
                <label class="form-label">First name:</label>
                <input class="form-control" name="fname" placeholder="first name...">
            </div>
            <div class="form-group mb-2">
                <label class="form-label">Last name:</label>
                <input class="form-control" name="lname" placeholder="last name...">
            </div>
            <div class="form-group mb-2">
                <label class="form-label">Email:</label>
                <input class="form-control" type="email" placeholder="email...">
            </div>
            <div class="form-group mb-2">
                <label class="form-label">Password:</label>
                <input class="form-control" name="pawwsord" type="password" placeholder="password...">
            </div>
            <div class="form-group my-2">
                <button type="submit" class="btn btn-primary w-100">Signup</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
