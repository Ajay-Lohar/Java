<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
<form action="upload" method="get" accept=".txt, .gif, .jpeg, .jpg" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Select to File to upload</td>
            <td><input type="file" name="file" required></td>
        </tr>
        <tr>
            <td><input type="submit" value="Upload File"></td>
        </tr>
    </table>
</form>

</body>
</html>
