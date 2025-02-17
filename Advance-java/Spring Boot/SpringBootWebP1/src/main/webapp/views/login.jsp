<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<h4>Login Here </h4>



<c:if test="${not empty errorMsg}">
    <H4 style="color: red ">    ${errorMsg}</H4>

</c:if>
<form action="loginForm" method="post">
    Email : <input type="text" name="email"> <br> <br>
    Password : <input type="password" name="password"> <br> <br>
    <input type="submit" value="Login">
</form>
<br><br>


if alredy registered <a href="regPage" ><b>Click Here </b></a>

</body>
<script src="js/script.js" ></script>
</html>