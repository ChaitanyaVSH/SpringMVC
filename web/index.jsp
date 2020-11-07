<%--
  Created by IntelliJ IDEA.
  User: kotichai
  Date: 07/11/20
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Mathematics</title>
  </head>
  <body>
  <h1>Arithmetic Operations</h1>
  <form action="add">
    <label>Input 1: </label>
    <input type="text" name="t1" required>
    <br>
    <label>Input 2: </label>
    <input type="text" name="t2" required>
    <br>
    <input type="submit">
  </form>
  <form action="subtract">
    <label>Input 1: </label>
    <input type="text" name="s1" required>
    <br>
    <label>Input 2: </label>
    <input type="text" name="s2" required>
    <br>
    <input type="submit">
  </form>
  </body>
</html>
