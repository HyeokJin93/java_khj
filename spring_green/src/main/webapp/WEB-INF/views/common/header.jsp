<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">

	  <a class="navbar-brand" href="<%=request.getContextPath()%>">HOME</a>
	  <ul class="navbar-nav">
	  	<c:if test="${user == null }">
		    <li class="nav-item">
		      <a class="nav-link" href="<%=request.getContextPath()%>/login">로그인</a>
		    </li>
		    <li class="nav-item">
		      <a class="nav-link" href="<%=request.getContextPath()%>/signup">회원가입</a>
		    </li>
	    </c:if>
	    <c:if test ="${user != null}">
	     	<li class="nav-item">
		      <a class="nav-link" href="#">로그아웃</a>
		    </li>
		</c:if>
	  </ul>
	</nav>
</body>
</html>