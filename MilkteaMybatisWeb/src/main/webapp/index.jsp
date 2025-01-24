<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>제주의 꿈</title>
        <link rel = "stylesheet" href="../resources/CSS/reset.css">
        <link rel = "stylesheet" href="../resources/CSS/header.css">
        <link rel = "stylesheet" href="../resources/CSS/footer.css">
        <link rel = "stylesheet" href="../resources/CSS/main.css">
    </head>

    <body>
        <div id="container">
            <%--  <%@ include file ="" %>  링크하는 두가지 방법 --%>
            <jsp:include page="/WEB-INF/views/include/header.jsp"/>             
            <main id="main">
                <section id="healing">
                    <article>
                        <h2>몸과 마음이 치유되는 섬</h2>
                        <img src="../resources/image/healing.jpg" alt="healing">  
                        <p><b>쉼(Healing)의 공간으로 안내합니다.</b></p>
                        <p>탁 트인 바다, 시원한 바람에 몸을 맡기고 뚜벅뚜벅 오름을 오르고
                            올레길을 걷다보면 온전히 나에게 집중할 수 있습니다.
                        </p>
                    </article>
                    <aside class="schedule">
                        <h3>상세 일정</h3>
                        <ul>
                            <li>여행기간 : 2박 3일</li>
                            <li>여행 일정 : (여행 일정은 상담을 통해 결정 및 조정 가능합니다)</li>
                        </ul>
                    </aside>         
                </section>
                <section id="activity">
                    <article>
                        <h2>다양한 액티비티가 기다리는 섬</h2>
                        <img src="../resources/image/activity.jpg" alt="activity">
                        <p><b>모험과 스릴이 넘치는 레저의 천국으로 안내합니다.</b></p>
                        <p>둘러보기만 한 여행을 하셨나요?</p>
                        <p>
                            하늘을 날며 시원한 바다를 내려다보는 패러글라이딩과
                            투명한 물빛 속을 여행하는 스쿠버다이빙...
                            아름다운 제주 해안도로를 씽씽 전동바이크나 전동킥보드로 달려보세요.
                            시원한 바다를 가까이에서 느낄 수 있는 요트 체험과 배낚시도 빼놓을 수 없겠죠?
                        </p>
                    </article>
                </section>    
            </main>        
            <jsp:include page="/WEB-INF/views/include/footer.jsp"/> 
        </div>
    </body>
</html>