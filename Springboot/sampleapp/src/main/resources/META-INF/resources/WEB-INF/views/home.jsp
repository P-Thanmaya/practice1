<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h1>Customer List</h1>
<table border="1">
    <tr>
        <th>Customer ID</th>
        <th>Customer Name</th>
        <th>Phone</th>
        <th>Items</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.customerid}</td>
            <td>${customer.customername}</td>
            <td>${customer.phone}</td>
            <td>
                <c:forEach var="item" items="${customer.items}">
                    ${item.itemname} (${item.price})<br/>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="customers/addCustomer">Add Customer</a>
<a href="customers/addItem">Add Item</a>
</body>
</html>