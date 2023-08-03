<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MovieNamesList</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Movies</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="movie_name", var="movieName">
                    <td>${movieName}</td>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>