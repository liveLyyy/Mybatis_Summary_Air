<html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
 <select>
     <option>请选择</option>
     <c:forEach items="${takeport}" var="takeport">
        <option value="${takeport.id}">${takeport.portName}</option>
     </c:forEach>
 </select>
</body>
</html>
