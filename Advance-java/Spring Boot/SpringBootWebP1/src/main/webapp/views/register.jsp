<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<h4>Register Here </h4>

<c:if test="${not empty successMsg}">
    <H4 style="color: green ">    ${successMsg}</H4>

</c:if>

<c:if test="${not empty errorMsg}">
    <H4 style="color: red ">    ${errorMsg}</H4>

</c:if>
<form action="regForm" method="post">
    Name : <input type="text" name="name"> <br> <br> 
    Email : <input type="text" name="email"> <br> <br>
    Password : <input type="password" name="password"> <br> <br> 
    Phone No : <input type="tel" name="phoneno"> <br> <br>
    <input type="submit" value="Register">
</form> 


</body>
<script src="js/script.js" ></script>
</html>