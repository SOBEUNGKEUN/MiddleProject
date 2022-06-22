# 🌽 MiddleProject : 우리 것
---------------------
# 00.프로젝트 소개 :
 목적 - 농업장려(귀농/귀촌), 지방/외곽지역 일손증대
 기능 - 저렴한 숙박시설과 농업 체험 프로그램을 예약 지원
----------------------------
# 01.팀원 소개, 프로젝트 역할 분담 
## 😂 최지원 (FE) - CRUD, CSS <br><br>

## 😆 황유정 (FE/BE)- DB 데이터 생성, 지도 API(카카오) 연동, CSS<br><br>

## 😳 이수민 (FE/BE) - 자바/자바스크립트 매핑연결, CSS<br><br>

## 😌 강윤조 (FE) - 지도 API(카카오) 연동, CSS<br><br>

## 😶 소병권 (FE/BE) - DB 서버 구축/운영(Java, MySQL), 매핑, CRUD<br><br>

## 😐 강희원 (BE) - DB 데이터 생성 , 결제/로그인 API 연동<br><br>

-----------------------
# 02.시연영상 url : https://youtu.be/AKwpk299O5k
--------------------------------
# 03. 도메인 용어 정의(테이블 3개)
<체험프로그램 도메인><br>
![체험프로그램 도메인](https://user-images.githubusercontent.com/100591948/174218064-7de06631-820a-4b1f-bff7-b088c9d7f80b.png)
<br><br>

<숙소 도메인><br>
![숙소 도메인](https://user-images.githubusercontent.com/100591948/174218278-5f46d3e8-3ac6-4390-8d8f-5a3e8999ac26.png)
<br><br>

<시장 도메인><br>
![마켓 도메인](https://user-images.githubusercontent.com/100591948/174218039-75eca6d1-d858-459e-94d2-01afaaefb19c.png)

-----------------------
# 📚 04. 사용 기술 스택
## FronEnd
<img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black"><img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"><img src="https://img.shields.io/badge/Next-black?style=for-the-badge&logo=next.js&logoColor=white">
  
## BackEnd
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"><img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white"><img src="https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"><img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"><img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"><img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"><img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">  


## Tool
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"><img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"><img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white">
   
----------------------
# 📌05.UI(카카오 오븐, MIRO, MySQL ERD)구축도
## 1️⃣ : [카카오 오븐](https://ovenapp.io/view/hw9xlOUNIKpDa2hZO7n8bGOPbL26vGaT/UT7Uw) <br><br><br>

## 2️⃣ : [Miro EER](https://miro.com/app/board/uXjVOuEItn4=/?userEmail=khw-6104@naver.com&track=true&utm_source=notification&utm_medium=email&utm_campaign=add-to-team-and-board&utm_content=go-to-board&invite_link_id=217891422778) <br>
 ![Miro EER](https://user-images.githubusercontent.com/100591948/174219083-5edc7991-79f8-4c3c-98ac-3380c9db7bbd.png)<br><br><br>
 
## 3️⃣ : MySQL ERD <br>
 ![MySQL erd](https://user-images.githubusercontent.com/100591948/174206530-0bb93e6b-45d8-4012-a6cd-7cbbb3baf0ab.png) <br><br><br>


---------------
# 06. 기능소개
1. 예약하기 클릭한 체험마을 지도에 표시
2. 상세정보 페이지에서 알맞은 정보 하나만 표시(+위도 경도 )
3. 회원예약 정보 DB에 저장
4. 예약자 연락처로 예약 조회


----------------------
# 📌07. 서비스 아키텍쳐
 <모놀리식 아키텍쳐> <br>
 ![모놀리식 아키텍쳐](https://user-images.githubusercontent.com/100591948/174213449-bb421e27-48a7-42d3-826e-af0f2d6816c7.png)

### ❓ 모놀리식 아키텍쳐란, 
 - 마이크로 선비스 아키텍쳐의 반대되는 개념으로 전통의 아키텍쳐를 지칭하는 의미로 생겨난 단어.
  
### ❗특징❗
  - 모놀리식 아키텍쳐를 갖는 소프트웨어의 특징은 그 자체로 강건하며 내부 요소간의 의존성이 강하다는 점입니다. 그리고 이는 필연적으로 구조적인 결합이 강력하게 유지되는 결과를 초래하며, 또한 각 비즈니스 컴포넌트들이 하나의 강한 결합 구조를 지니고 통일성이 있습니다. 이는 비즈니스 로직이 서비스에 최적화 된 코드를 만들어내는데 좀 더 집중할 수 있는 반면, 복합적인 예외를 만들 수 있는 위험을 내포하게 됩니다.
 -자료 출처 : https://m.blog.naver.com/dktmrorl/221863498991  中-
---------------------------------
# 08. 트러블 슈팅(고착점)

 ## 😈 농수산물 예약 채팅 아이콘 클릭 시 모달창 채팅기능을 구현하였지만 다시 채팅 아이콘 클릭 시 생기는 오류를 해결하지 못함 + 여러 개의 채팅 아직 구현 불가

 ## 😈 Oauth2 기능 연결 뒤 redirect_url경로 설정을 잘못하여, 로그인상태 세션이 안 어지고, 토큰값의 제한시간을 인지못하여 페이지를 찾을 수 없음. 백엔드쪽 데이터를 가져오지 못하고 매핑구현 못함.
 
 ## 😈 테스트 결제 API를 이용하여 프론트쪽 함수식을 못세워 구매하는 만큼의 계산적용 못하고, 서버 경로를 못 찾아 페이지 이동으로 못함.
--------------------------------
# 09. 느낀점

## 강희원) 긴 프로젝트를 좋은 팀원분들과 함께 하였고, 웃음이 끊이지를 않았습니다. 제대로 배우지 않은, API의 학술적이고 전문적 지식들을 수백번 구글링하고 참고하며, 부딪히는 과정을 앞으로의 숙명이라 느껴지는시간이었습니다. 카카오 로그인API 연동, 결제 API 연동 둘다 실현 못시켜 너무 아쉬우면서 내일부터라도 조금씩 코드개선해나가보겠습니다. 기술적 한계와 연구하고 개발하는 동안의 인내심의 부족함을 매번 느끼는데, 부족함을 팀원들이 채워주면서 반성과 위로를 하며 혐업의 소중함을 다시 깨닫는 좋은 시간이었습니다. 다음 프로젝트에는 배운과정에서의 기본을 토대로, 확장해가는 계획을 세우겠습니다.
 
## 소병권) 오류에 매달려서 지체된 시간이 너무 아쉬운 프로젝트였다. 아직 경험이 부족하여 계획을 세울 때 해야할 일들이 어느정도 시간이 걸리고 어느 방향으로 진행해야 할지 몰라서 어려웠다. 그래도 학교에서는 못해봤던 다양한 API와 라이브러리를 활용하여 흥미를 느끼고 프로젝트에 참여 할 수 있었다. 다 같이 많이 힘들었지만 항상 웃으면서 좋은 분위기 속에서 작업할 수 있었다. 좋은 추억과 많은 경험을 가지고 갈 수 있는 의미있는 프로젝트였다. 

## 최지원) 애증의 하울의 움직이는 척 하는 성... 하지만 멀쩡히 서있는것 만으로도 사실은 뿌듯하다.수업 때 배웠던 기능 복습해보면서 실제로 해보니까 이해가 잘 됐고 처음 시도해보는 것들도 많은 분들의 도움을 통해 구현이 가능해서 신기했다. 또 오랜기간 동안 팀 프로젝트를 하는건 처음이었는데 깃허브 사용에 대해서도 많이 배울 수 있었고 또 다같이 즐겁게 작업할 수 있어서 좋았다. 다들 고생많으셨습니당~~
 
## 이수민) next.js 이해하지 못하고 바로 프로젝트를 하려니깐 이해가 안 돼서 많이 어려웠다. 하나해결하면 바로 하나 오류나고 정말 힘들었다. 코딩하는 시간보다 구글링하는 시간이 더 많이 들었던 프로젝트였다.. 그래도 하면서 이해하고 점점 실력이 느는 거 같다 다들 미루려고 안하고 끝까지 열심히 하려는 모습에 보기 좋았습니다.  gitbash 쓰느라고 파일도 날리고 시간도 많이 버렸는데 다음엔 git desktop 사용해보겠습니다! 다들 api, 로그인 db 연결 모두들 최고였습니다❤ 다들 서로 도와가면서 프로젝트를 진행해서 행복했습니다!멋진 팀원들 덕에 즐겁게 코딩을 할 수 있었습니다😊
 
## 황유정) 미니 프로젝트와는 달리 장기적인 프로젝트라 계획했던 기능 구현이 많았습니다. 처음에는 막막했지만 팀원분들과 같이 한단계씩 해결해 나갔습니다. 그래서인지 계속해서 에러가 날 때도 어떻게든 성공하겠지라는 생각이 머릿속에 있어서 삽질을 했습니다. 무엇보다 최강황소2 팀원분들 덕분에 수업시간에 애매하게 이해했던 것도 완전히 이해하고, 편안한 분위기에서 의사소통을 할 수 있어서 좋았습니다. 덕분에 지식의 범위가 확장되었습니다. 어려움을 겪을 때 순간 미래에 대한 걱정을 많이 한 팀원분들에게 이번 프로젝트를 대한 자세를 가진 여러분들이라면 원하는 바를 꼭 이룰 수 있을 거라 저는 장담합니다. 저 또한 자극받아 프로젝트에 도움이 되는 팀원이 되도록 더 많이 노력하고 배우겠습니다. 고생하셨습니다.
 
## 강윤조) 처음 프로젝트 시작 할 때 생각했던 목표보다 정말 훨씬 많이 진행되고 구현하게 되었다. 팀원들의 의견을 조합하면서 생각 했던 기능들 중 반만 성공해도 감사할것 같다 생각했는데 거의 전부 구현 할 수 있게 되어서 감격,,스럽다. 예상보다 페이지간의 데이터 연결에서 큰 어려움을 겪었다. 그러면서 DB연동 기능들도 많이 배워 간것 같다. 체험명 검색창 만든게 엊그제 같은데 한가지 오류들이 적어도 하루씩 시간소요해서 그런지 시간이 정말 빨리 흘러갔다. 다들 진짜 고생 너무 많았고 너무 열심히 해줘서 감사함당!!!!
