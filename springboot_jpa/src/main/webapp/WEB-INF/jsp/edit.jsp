<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>

<script type="text/javascript">
    window.onload = function () {
        document.querySelector('#updateBtn').addEventListener('click', function () {
            let formData = new FormData();
            let name = (document.querySelector('input[name="name"]')).value;
            let id = (document.querySelector('input[name="id"]')).value;
            formData.append('id', id);
            formData.append('name', name);

            let ajax = new XMLHttpRequest();

            ajax.open('put', 'http://localhost:8080/categories/');
            ajax.send(formData);
            ajax.onreadystatechange = function () {
                if (ajax.readyState === 4 && ajax.status === 200) {
                    window.location.replace('../categories/');
                }
            };
        });
    };

    function doTest() {
        console.log(123);

        let formData = new FormData();
        formData.append('id', '1');
        formData.append('name', 'name');

        let ajax = new XMLHttpRequest();

        ajax.open('patch', 'http://localhost:8080/categories/test');
        ajax.send(formData);
        ajax.onreadystatechange = function () {
            if (ajax.readyState === 4 && ajax.status === 200) {
                console.log('success');
            }
        };
    }
</script>

<body>

<div>
    <button type="button" onclick="doTest()">测试</button>
</div>

<div>
    name: <input name="name" value="${category.name}"> <br>
    <input name="id" type="hidden" value="${category.id}">
    <button id="updateBtn" type="button">提交</button>
</div>

</body>
</html>
