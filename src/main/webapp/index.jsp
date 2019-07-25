<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
 <select>
     <option>请选择</option>
     <c:forEach items="${takeport}" var="takeport">
        <option value="${takeport.id}">${takeport.portName}</option>
     </c:forEach>
 </select>
</body>
</html>
