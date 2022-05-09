<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Category</title>
    <style>
        table {
            text-align: center;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid #000;
            padding: 10px;
        }
    </style>
    <script type="text/javascript">
        function doDelete(id) {
            let ajax = new XMLHttpRequest();
            ajax.open('delete', 'categories/' + id);
            ajax.send();
            ajax.onreadystatechange = function () {
                if (ajax.readyState === 4 && ajax.status === 200) {
                    location.reload();
                }
            };
        }
    </script>
</head>
<body>

<div>
    <table>
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>编辑</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${categories}" var="category" varStatus="st">
            <tr>
                <td>${category.id}</td>
                <td>${category.name}</td>
                <td>
                    <a href="categories/${category.id}">
                        编辑
                    </a>
                </td>
                <td>
                    <a href="javascript:doDelete(${category.id})">
                        删除
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<div>
    <div>
        <a href="">[首 页]</a>
        <a href="">[上一页]</a>
        <a href="">[下一页]</a>
        <a href="">[末 页]</a>
    </div>
</div>

<div>
    <form action="" method="post">
        name: <input name="name"><br>
        <button type="submit">提交</button>
    </form>
</div>

</body>
</html>
