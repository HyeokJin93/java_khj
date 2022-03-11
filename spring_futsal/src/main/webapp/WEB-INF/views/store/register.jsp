<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구장 등록</title>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.13.0/themes/base/jquery-ui.css">
	<script src="https://code.jquery.com/ui/1.13.0/jquery-ui.js"></script>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</head>
<body>
	<form class="container body" action="<%=request.getContextPath()%>/store/register" method = "post">
		<h1 class="title text-center">구장 등록</h1>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="구장명" name="st_name" value="${store.st_name}">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="전화번호(-를 포함하여 입력하세요.)" name="st_phone" value="${user.me_phone}">
		</div>
		<div class="form-group">
			<div class="form-inline mb-2">
				<input type="text" id="postcode" placeholder="우편번호" class="form-control col-6">
				<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기" class="form-control col-6">
			</div>
			<input type="text" name="st_address" id="address" placeholder="주소" class="form-control mb-2">
			<input type="text" name="st_detailAddress" id="detailAddress" placeholder="상세주소" class="form-control mb-2">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="주차가능여부" name="st_parking" value="${store.st_parking}">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="샤워가능여부" name="st_shower" value="${store.st_shower}">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="관리자 아이디" name="st_me_id" value="${user.me_id}">
		</div>
		<button class="btn btn-outline-success col-12">구장 등록</button>
	</form>
<script>
	function execDaumPostcode() {
		new daum.Postcode({
			oncomplete: function(data) {
				var addr = ''; // 주소 변수
				var extraAddr = ''; // 참고항목 변수
				if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
					addr = data.roadAddress;
				} else { // 사용자가 지번 주소를 선택했을 경우(J)
					addr = data.jibunAddress;
				}
	
				// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
				if(data.userSelectedType === 'R'){
					// 법정동명이 있을 경우 추가한다. (법정리는 제외)
					// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
					if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
							extraAddr += data.bname;
					}
					// 건물명이 있고, 공동주택일 경우 추가한다.
					if(data.buildingName !== '' && data.apartment === 'Y'){
							extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
					}
				
				} 
				// 우편번호와 주소 정보를 해당 필드에 넣는다.
				document.getElementById('postcode').value = data.zonecode;
				document.getElementById("address").value = addr;
				// 커서를 상세주소 필드로 이동한다.
				document.getElementById("detailAddress").focus();
			}
		}).open();
	}
</script>
</body>
</html>