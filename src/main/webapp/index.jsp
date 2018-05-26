<%--
  Created by IntelliJ IDEA.
  User: meng
  Date: 2018/5/22
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
 <form method="post" action="/IMGFilter-1.0-SNAPSHOT/Upload" enctype="multipart/form-data">
     选择一个图片：
     <input type="file" name="uploadFile"><br>
     <input type="submit" value="上传">
 </form>
</body>
</html>
