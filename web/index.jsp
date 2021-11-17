<%--
  Created by IntelliJ IDEA.
  User: BSE183030
  Date: 17/11/2021
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

  </head>
  <body>
  $END$
  <form  method="post" action="person">
    <p>Fname: <input  type="text" id="fname" name="fname"> </input></p>
    <p>Lname: <input  type="text" id="lname" name="lname"> </input></p>

    <p>GNEDER:</p>
    <input type="radio" id="male" name="age" value="male">
    <label for="male">male</label><br>
    <input type="radio" id="female" name="age" value="female">
    <label for="female">female</label><br>
<h2>
  Interests:
</h2>
    <input type="checkbox" id="book" name="book" value="book">
    <label for="book"> book</label><br>
    <input type="checkbox" id="cricket" name="cricket" value="cricket">
    <label for="cricket"> cricket</label><br>
    <input type="checkbox" id="football" name="football" value="football">
    <label for="football"> footballt</label><br><br>


    <input type="submit" value="Submit">
    <input type="submit" value="cancel">
  </form>
  </body>
</html>
