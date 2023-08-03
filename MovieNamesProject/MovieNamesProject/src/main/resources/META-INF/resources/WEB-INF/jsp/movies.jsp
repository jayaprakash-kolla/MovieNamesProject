<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MovieNamesList</title>
</head>
<body>
    <table>
            <tr>
                <th>Movies</th>
            </tr>
            <c:forEach items="movie_name", var="movieName">
                    <td>${movieName}</td>
            </c:forEach>
    </table>
</body>
</html>