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
  <hr>
  <h2>Addition</h2>
  <form action="add">
    <label>Input 1: </label>
    <input type="text" name="t1" required>
    <br>
    <label>Input 2: </label>
    <input type="text" name="t2" required>
    <br>
    <input type="submit">
  </form>

  <h2>Subtraction</h2>
  <form action="subtract">
    <label>Input 1: </label>
    <input type="text" name="s1" required>
    <br>
    <label>Input 2: </label>
    <input type="text" name="s2" required>
    <br>
    <input type="submit">
  </form>

  <h2>Logical AND</h2>
  <form action="logicaladd">
    <label>Input 1: </label>
    <input type="text" name="l1" required>
    <br>
    <label>Input 2: </label>
    <input type="text" name="l2" required>
    <br>
    <input type="submit">
  </form>

  <h2>Logical OR</h2>
  <form action="logicalor">
    <label>Input 1: </label>
    <input type="text" name="l1" required>
    <br>
    <label>Input 2: </label>
    <input type="text" name="l2" required>
    <br>
    <input type="submit">
  </form>
  </body>
</html>
