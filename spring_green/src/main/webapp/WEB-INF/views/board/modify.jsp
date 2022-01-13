<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 수정</h1>
	${board}
	<form action="<%=request.getContextPath()%>/board/modify" method="post">
		<div class="form-group">
		  <label>제목</label>
		  <input type="text" class="form-control" name="bd_title" value="${board.bd_title}" placeholder="제목">
		</div>
		<div class="form-group">
		  <label>내용</label>
		  <textarea class="form-control" rows="10" name="bd_contents" placeholder="내용">${board.bd_contents}</textarea>
		</div>
		<input type="hidden" name="bd_num" value="${board.bd_num}">
		<button class="btn btn-outline-success col-12">등록</button>
	</form>
</body>
</html>