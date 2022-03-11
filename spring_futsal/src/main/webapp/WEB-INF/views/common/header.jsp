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
			<c:if test="${user == null}">
			    <li class="nav-item">
			      <a class="nav-link" href="<%=request.getContextPath()%>/login">로그인</a>
			    </li>
			    <li class="nav-item">
			      <a class="nav-link" href="<%=request.getContextPath()%>/signup">회원가입</a>
			    </li>
		    </c:if>
		    <c:if test="${user != null}">
		    	<li class="nav-item">
			      <a class="nav-link" href="<%=request.getContextPath()%>/mypage">내 정보</a>
			    </li>
		    	<c:if test="${user.me_authority == '시스템 관리자'}">
			   		<li class="nav-item">
				      <a class="nav-link" href="<%=request.getContextPath()%>/admin/authority">회원 권한 관리</a>
				    </li>
			    </c:if>
			    <li class="nav-item">
					<a class="nav-link" href="<%=request.getContextPath()%>/store/register">구장 등록</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">구장 상세 등록</a>
				</li>
			    <li class="nav-item">
			    	<a class="nav-link" href="<%=request.getContextPath()%>/logout">로그아웃</a>
				</li>
		    </c:if>
		  </ul>
	  
	  
	</nav>
</body>
</html>