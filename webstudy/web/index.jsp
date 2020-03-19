<%--
  Created by IntelliJ IDEA.
  User: Sky
  Date: 2020/3/18
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/day19" method="post">
    用户名<input type="text" name="username">
    密码<input type="password" name="password">
    爱好<input type="checkbox" name="hobby" value="篮球">篮球<input type="checkbox" name="hobby" value="足球">足球
    <input type="submit" value="登录">
  </form>
  </body>
</html>
