<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="/" %>
<!DOCTYPE html>
<html>
<head>
 <title>Quiz</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
 <form action="/quiz/submit" method="post">
  <c:forEach var="question" items="${questions}">
   <div class="mb-3">
    <h5>${question.questionText}</h5>
    <div>
     <c:forEach var="option" items="${question.options}">
      <div class="form-check">
       <input class="form-check-input" type="radio" name="answers" value="${option}">
       <label class="form-check-label">${option}</label>
      </div>
     </c:forEach>
    </div>
   </div>
  </c:forEach>
  <button type="submit" class="btn btn-primary">Submit</button>
 </form>
</div>
</body>
</html>
