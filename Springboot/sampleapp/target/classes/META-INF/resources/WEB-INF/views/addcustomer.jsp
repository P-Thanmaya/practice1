<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h1>Add Customer</h1>
<form method="post" action="addCustomer">
    Enter Customer ID:<br/>
    <input type='number' name='customerid'/><br/>
    Enter Customer Name:<br/>
    <input type='text' name='customername'/><br/>
    Enter Phone:<br/>
    <input type='number' name='phone'/><br/>
    <input type='submit' value='Save'/>
</form>
</body>
</html>