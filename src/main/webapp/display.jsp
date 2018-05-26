<%--
  Created by IntelliJ IDEA.
  User: meng
  Date: 2018/5/23
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String Aurl= (String) request.getAttribute("Aurl");
    String Burl=(String) request.getAttribute("Burl");
    %>
<html>
<head>
    <title>display</title>
</head>
<body>
过滤后的图像：
<br>
<img src="<%=Burl%>" alt="1"/>
<br>
原图像：
<br>
<img src="<%=Aurl%>"  />

</body>
</html>
