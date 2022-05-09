<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
    <script type="text/javascript">

    </script>
</head>
<body>

<div>
    <form action="../categories/${category.id}" method="post">
        <input type="hidden" name="_method" value="patch">
        name: <input name="name" value="${category.name}"> <br>
        <button type="submit">提交</button>
    </form>
</div>

</body>
</html>
