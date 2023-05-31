<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Document</title>
</head>
<body>
<div  class="container">

<form action="/them" method="post">
    <div class="mb-3 mt-3">
        <label for="id" class="form-label">ID:</label>
        <input type="id" class="form-control" id="id" placeholder="Enter ID" name="id" value="${id}">
    </div>
    <select class="form-select" name = "loaisach" value = "${loaisach}">
        <option value="Sach1">Sach1</option>
        <option value="Sach2">Sach2</option>
        <option value="Sach3">Sach3</option>
        <option value="Sach4">Sach4</option>
    </select>
    <div class="mb-3 mt-3">
        <label for="ten" class="form-label">Ten:</label>
        <input type="ten" class="form-control" id="ten" placeholder="Enter Ten" name="ten" value="${ten}">
    </div>
    <div class="mb-3">
        <label for="tacgia" class="form-label">Tac Gia:</label>
        <input type="tacgia" class="form-control" id="tacgia" placeholder="Enter Tac Gia" name="tg" value="${tacgia}">
    </div>
    <div class="mb-3">
        <label for="Gia" class="form-label">Gia:</label>
        <input type="Gia" class="form-control" id="Gia" placeholder="Enter Gia" name="Gia" value="${Gia}">
    </div>
    <input type="radio" name="action" value="add" checked> Add
    <input type="radio" name="action" value="update"> Update
    <button type="submit" class="btn btn-primary">Submit</button>

</form>
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Ten</th>
        <th>Loai Sach</th>
        <th>Tac Gia</th>
        <th>Gia</th>
        <th>Action</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSach}" var="sach" varStatus="index">
        <tr>
            <td>${sach.ID}</td>
            <td>${sach.ten}</td>
            <td>${sach.loaiSach}</td>
            <td>${sach.tacGia}</td>
            <td>${sach.gia}</td>
            <td><a href="/xoa?idXoa=${sach.ID}" class="btn btn-primary">Delete</a></td>
            <td><form action="/sua?${sach.ID}" method="post">
                <input type="hidden" name="id" value="${sach.ID}">
                <input type="hidden" name="ten" value="${sach.ten}">
                <input type="hidden" name="tacgia" value="${sach.tacGia}">
                <input type="hidden" name="Gia" value="${sach.gia}">
                <button type="submit" class="btn btn-primary">Edit</button>
            </form></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>

