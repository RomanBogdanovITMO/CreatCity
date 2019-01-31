<html>
<body>
<form method="post" enctype="multipart/form-data" c:object="${maps}">
    <input type="file" name="file">
    <button type="submit">Добавить</button>
    <div c:if="${maps.filename}">
        <img src="/img/${maps.filename}">
    </div>

</form>
</body>
</html>


