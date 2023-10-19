<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- 참고용으로 복붙해놓은 겁니다. -->
<!--  -->
<!--  -->
<html>
<head>
<meta charset="UTF-8">
<title>내가 작성한 글 목록</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function writeui(){
		location.href="write"; // write or 글 상세보기 페이지로 이동. 현재는 구현 x
	}
</script>
</head>
<body>
	<c:set var="pageDTO" value="${PageDTO}"/>
	<c:set var="list" value="${pageDTO.list}"/>
	<div class="container">
	    <img src="image/multicampus.png">
						<h2 class="text-center">공지사항 목록 화면</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="list" items="${list}">
					<tr>
						<td>${list.no}</td>
						<td><a href="retrieve?no=${list.no}">${list.title}</a></td>
						<td>${list.author}</td>
						<td>${list.writeday}</td>
						<td>${list.readcnt}</td>
						<td><a href="delete?no=${list.no}">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
				<c:set var="perPage" value="${pageDTO.perPage}"/>
				<c:set var="curPage" value="${pageDTO.curPage}"/>
				<c:set var="totalCount" value="${pageDTO.totalCount}"/>
				<c:set var="totalNum" value="${totalCount / perPage}" />
			
				<c:if test="${totalCount % perPage != 0}">
					<c:set var="totalNum" value="${totalNum+1}" />
				</c:if>
			   <tr>
				<td colspan="6">
					<c:forEach var="i" begin="1" end="${totalNum}">
						<c:if test="${curPage == i}">
							${i}
						</c:if>
						<c:if test="${curPage != i}">
							<a href=" <c:url value='list?curPage=${i}'/> "> ${i} </a>
						</c:if>
					</c:forEach>
		        </td>
			  </tr>
		</table>
		<button onclick="writeui()">글쓰기</button>
	</div>

</body>
</html>