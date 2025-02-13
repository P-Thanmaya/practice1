<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h1>Add Item</h1>
<form method="post" action="addItem">
    Enter Item ID:<br/>
    <input type='number' name='itemid'/><br/>
    Enter Item Name:<br/>
    <input type='text' name='itemname'/><br/>
    Enter Price:<br/>
    <input type='number' name='price'/><br/>
    Select Customer:<br/>
    <select name="customer.customerid">
        <c:forEach var="customer" items="${customers}">
            <option value="${customer.customerid}">${customer.customername}</option>
        </c:forEach>
    </select><br/>
    <input type='submit' value='Save'/>
</form>
</body>
</html>