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
	<h1>게시글 등록</h1>
	<form action="<%=request.getContextPath()%>/board/register" method="post" enctype="multipart/form-data">
		<div class="form-group">
		  <label>제목</label>
		  <input type="text" class="form-control" name="bd_title" placeholder="제목">
		</div>
		<div class="form-group">
		  <label>내용</label>
		  <textarea class="form-control" rows="10" name="bd_contents" placeholder="내용"></textarea>
		</div>
		<div class="form-group">
	        <label>첨부파일</label>
	        <input type="file" class="form-control" name="files"/>
	        <input type="file" class="form-control" name="files"/>
	        <input type="file" class="form-control" name="files"/>
	    </div>
		<button class="btn btn-outline-success col-12">등록</button>
	</form>
</body>
</html>