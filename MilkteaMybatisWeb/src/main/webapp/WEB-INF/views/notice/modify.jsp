<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>제주의 꿈 - 공지사항 수정</title>
		<link rel ="stylesheet" href="../resources/CSS/reset.css">
        <link rel ="stylesheet" href="../resources/CSS/header.css">
        <link rel ="stylesheet" href="../resources/CSS/footer.css">
        <link rel ="stylesheet" href="../resources/CSS/modify.css">
	</head>
	<body>
        <div id="container">
            <jsp:include page="/WEB-INF/views/include/header.jsp"/> 
			<main>
				<form class="notice-form" action="/notice/modify" method="post">
					<input type="hidden" name="noticeNo" value="${notice.noticeNo }">
					<h2>공지사항 수정</h2>
					<div class="form-group">
						<label>제목</label>
						 <input type="text" name="noticeSubject" value="${notice.noticeSubject}"> 
					</div>	
					<div class="form-group">
						<label>내용</label>
						  <textarea rows="5" cols="60" name="noticeContent">${notice.noticeContent }</textarea>
					</div>	
					<div class="form-group">
						<label>첨부파일</label>
						<div class="current-files">
							<h4>현재 첨부된 파일</h4>
							${notice.attachmentName }
						</div>
						<div class="file-upload">
							 <input type="file" name="attachmentName">
						</div>
					</div>	
					<button type="submit" class="modify-btn">수정 완료</button>
				</form>
			</main>
			<jsp:include page="/WEB-INF/views/include/footer.jsp"/>
		</div> 
	</body>
</html>