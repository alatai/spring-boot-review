<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>

<style>
    div {
        width: 500px;
        border: 1px solid lightgray;
        margin: 200px auto;
        padding: 80px;
    }
</style>

<body>

<div>
    系统出现异常，异常原因：${expection}
    <br>
    出现异常的请求：${url}
</div>

</body>
</html>
