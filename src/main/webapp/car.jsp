<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add new Car</title>
    <link rel="stylesheet" href="css/base.css"/>
    <link rel="stylesheet" href="css/app.css"/>
</head>
<body>
<div class="container">
    <h2>Add new Car</h2>
    <form:form action="/practice_war_exploded/addCar" method="post" class="add-car-form">
        <div class="form-row">
            <form:label path="id">ID:</form:label>
            <form:input type="text" placeholder="1" path="id"/>
        </div>
        <div class="form-row">
            <form:label for="name" path="name">Name:</form:label>
            <form:input type="text" placeholder="Mercedes" path="name"/>
        </div>
        <div class="form-row">
            <form:label for="max-speed" path="maxSpeed">Max speed:</form:label>
            <form:input type="text" placeholder="280" path="maxSpeed"/>
        </div>
        <div class="form-row">
            <input type="submit" value="Ok"/>
        </div>
    </form:form>
</div>
</body>
</html>
