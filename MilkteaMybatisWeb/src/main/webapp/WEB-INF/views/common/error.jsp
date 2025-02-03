<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>제주의 꿈-에러페이지</title>
		<link rel ="stylesheet" href="../resources/CSS/reset.css">
	    <link rel ="stylesheet" href="../resources/CSS/header.css">
	    <link rel ="stylesheet" href="../resources/CSS/footer.css">
	    <link rel ="stylesheet" href="../resources/CSS/error.css">
	</head>
	<body>
		<div id="container">
			<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
			<main>
				<div class="error-container">
					<h1 class="error-title">${errorCode }</h1>
					<p class="error-message">
						${errorMessage }
					</p>
					<a href="/" class="home-button">홈으로 돌아가기</a>
				</div>
			</main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
		</div>
	</body>
</html>