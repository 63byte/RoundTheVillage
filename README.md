# 🛴 동네 한 바퀴 🛴
💬 우리 동네 공방을 찾아줘!

<br>

## 🐈 𝘾𝙊𝙉𝙏𝙀𝙉𝙏 🐈

𝟭. TEAM 동네 한 바퀴 <br>
𝟮. 개발 일정 및 환경 <br>
𝟯. 기획 의도 <br>
𝟰. 로고 & 컬러 <br>
𝟱. 데이터 베이스 설계 <br>
𝟲. 구현 기능 <br><br>


### 👉 𝙏𝙀𝘼𝙈 동네 한 바퀴
![image](https://user-images.githubusercontent.com/74957603/115673305-72fc9380-a387-11eb-827d-624df1b10862.png)
<br><br>

### 👉 개발 일정
𝟮𝟬𝟮𝟭.𝟬𝟮.𝟭𝟵 ~ 𝟮𝟬𝟮𝟭.𝟬𝟯.𝟭𝟭
<br><br>

### 👉 개발 환경
- OS: Windows 10
- WAS: Apache Tomcat 8.5
- Program : Spring, Java, Oracle, SQL Developer, VS Code, photoShop
- Skill : Servlet, JSP, HTML, CSS3, JavaScript, jQuery
- Site : Figma(와이어 프레임), 미리 캔버스(로고, 아이콘), 구글 스프레드시트(프로젝트 관련 실시간 공유)
- API : summernote, GSON, Kakao map API, 다음 우편번호 서비스, import
- Management : GitHub
- Distribution : AWS
<br><br>

### 👉 기획 의도
코로나로 인해 다수의 인원과 약속이 불가능해진 현재 상황. 사람들은 집에만 있기에는 너무 심심하고 각자의 취미를 찾기 시작했습니다.
지역 선택으로 주변 공방을 검색하여 조회할 수 있고 결제를 통해 서비스 이용을 제공하면 좋겠다고 생각했습니다.
또한 공방 업체 회원들은 공방만의 클래스를 추가로 설정할 수 있는 방법을 계획해보았습니다.
<br><br>

### 👉 로고 & 컬러
![image](https://user-images.githubusercontent.com/74957603/115675842-ef907180-a389-11eb-849e-b42b82619213.png)
- 로고는 미리캔버스에서 프로젝트와 알맞는 이미지를 쓰게 되었습니다. 제로(0)와 브레드(빵), 공방을 의미합니다.
- 메인 컬러는 공방의 이미지에 맞는 갈색 계열을 선택하였고, 서브 컬러는 주황색과 노란색 사이의 따뜻한 계열의 색을 사용해 뒷받침해주었습니다.
<br><br>

### 👉 데이터 베이스 설계
![image](https://user-images.githubusercontent.com/74957603/115676368-7d6c5c80-a38a-11eb-93ed-1fb6461ea447.png)
<br><br>

### 👉 구현 기능 및 화면
  #### 1. 𝖬𝖺𝗂𝗇 𝗁𝖾𝖺𝖽𝖾𝗋 <br>
  ![image](https://user-images.githubusercontent.com/74957603/115677464-75f98300-a38b-11eb-9ede-96b4e533b0fa.png)
  - 회원은 로그인시 오른쪽 상단 부분에 레벨, 닉네임, 로그아웃 버튼이 뜬다. 레벨은 자신이 해당하는 레벨 아이콘에 맞게 뜬다.
  - 회원들은 공방찾기, 수업찾기, 후기게시판, 마이페이지, 공지사항으로 이동이 가능하다. 단, 마이페이지는 로그인 시에만 이용이 가능하다. 
  - 미 로그인 시 로그인을 해야한다는 경고창과 함께 로그인 페이지로 이동한다.
  - 반 회원은 마이페이지에 내 정보 수정, 나의 활동, 나의내 역으로 이동이 가능하다. 
  - 공방 회원은 일반 회원과 똑같고 나의 공방, 배너 신청이 추가로 구성되어있다. 
  - 관리자로 로그인시 관리페이지로 바뀌며 회원 조회, 공방 관리, 배너 관리, 신고 관리를 이용할 수 있다.

  #### 2. 𝖬𝖺𝗂𝗇 𝗯𝗮𝗻𝗻𝗲𝗿 <br>
  ![image](https://user-images.githubusercontent.com/74957603/115679640-c1ad2c00-a38d-11eb-8272-a5d6f1efdffc.png)
  - 메인 헤더 아래에 광고 전용 캐러셀을 구성하였다.
  - 업체 회원들이 결제하여 신청해놓은 배너들은 메인 상단 캐러셀에 노출이 가능하다. (캐러셀 화면만 구성.)
  - 화살표로 왼쪽, 오른쪽 클릭하여 이동할 수 있다.
  
  #### 3. 𝖬𝖺𝗂𝗇 𝗯𝗼𝗱𝘆 <br>
  ![image](https://user-images.githubusercontent.com/74957603/115679918-0c2ea880-a38e-11eb-97db-29112688f830.png)
  - 메인은 신청이 완료된 공방 목록들을 보여준다. 카테고리, 공방 썸네일과 공방명, 간단한 소개, 좋아요수를 보여준다.
  - 로그인을 하지않은 상황에는 좋아요순, 신규 공방순 공방 8개를 보여준다. 
  - 로그인 시에는 회원가입 시에 받은 주소와 관심 분야를 기반으로 공방 8개를 추가로 보여준다.
  
  #### 4. 𝖬𝖺𝗂𝗇 𝗳𝗼𝗼𝘁𝗲𝗿 <br>
  ![image](https://user-images.githubusercontent.com/74957603/115681525-93305080-a38f-11eb-9b22-f665da823bab.png)
  - 관리자 업체에 관한 정보를 조회할 수 있다. 
  - 관리자는 해당 업체에 맞게 SNS을 연결 할 수 있다.
  
  #### 5. 𝗡𝗼𝘁𝗶𝗰𝗲 <br>
  ![image](https://user-images.githubusercontent.com/74957603/115681697-ba871d80-a38f-11eb-981c-3f45654efdde.png)
  - 전체 회원들은 공지사항을 조회 할 수 있다.
  - 글 번호, 제목, 작성일을 조회할 수 있다. 글을 클릭 시 해당 글 상세 페이지로 이동한다. 
  - 게시글글은 페이지 당 10개씩 조회가 가능하며, 페이징 처리가 되어있어 다음 페이지로 이동하거나 맨 끝 페이지로 이동이 가능하다. (이전도 동일하다.)
  - 관리자로 로그인 시 글쓰기 버튼이 활성화된다.
  - 하단에 검색 창이 있다. 글 제목, 내용 옵션을 선택해 검색을 할 수 있다.
    
  ---
  ##### ❤ 상세 페이지 <br>
  ![image](https://user-images.githubusercontent.com/74957603/115681746-c541b280-a38f-11eb-81f1-1e327cbca61e.png)
  - 전체 회원은 공지사항 상세 페이지로 이동이 가능하고 조회가 가능하다.
  - 제목, 작성자(관리자), 작성일, 내용을 조회할 수 있다.
  - 관리자는 글을 관리할 수 있다. 관리자로 로그인 시 수정, 삭제 버튼이 뜬다. 일반, 업체 회원들은 불가능하다.
  - 목록으로 버튼으로 글 목록으로 돌아갈 수 있다.
  
  ---
  ##### ❤ 글 쓰기 & 수정 <br>
  ![image](https://user-images.githubusercontent.com/74957603/115681801-d38fce80-a38f-11eb-9d9e-86b942e8259d.png)
  - 관리자는 공지사항을 쓸 수 있다.
  - 제목을 입력할 수 있고 작성일은 현재 날짜로 고정된다.
  - summernote API를 이용하여 글쓰기 관련 기능을 이용할 수 있다.
  - 하단에는 글 목록으로 돌아갈 수 있는 버튼이 있다. <br>
  ![image](https://user-images.githubusercontent.com/74957603/115682069-10f45c00-a390-11eb-8ea8-bc4dd2ad493b.png)
  - 등록을 하면 등록이 완료됐다는 알림창이 뜬다. (수정도 동일하다.)
  - 글 수정 또한 글쓰기와 비슷하다. 기존 입력한 내용들이 유지되어 있고 등록 버튼 대신 수정 버튼이 있다. 각각 기능을 수행할 시 성공 알림창이 뜬다.
  
  ---
  ##### ❤ 글 삭제 <br>
  ![image](https://user-images.githubusercontent.com/74957603/115682131-236e9580-a390-11eb-9585-c4a3ba4762c9.png)
  - 관리자는 게시글을 삭제할 수 있다. 삭제 버튼을 누르면 경고창이 뜬다.
  ![image](https://user-images.githubusercontent.com/74957603/115682330-52850700-a390-11eb-80f4-11843f1031c9.png)
  - 확인을 누르면 게시글이 삭제됐다는 알림창이 뜨고 목록으로 돌아가게한다.
  
  <br><br><br>
  
  ---
  
  ### 💕 프로젝트 소감
  세미 프로젝트에 이어서 진행한 파이널 프로젝트. 하지만 세미에 비해 기간이 절반이나 짧아져 더욱 촉박하고 어려웠습니다. 다행히도 조 편성이 원하는 사람과 할 수 있어서
  편한 사람들과 진행했습니다. 초반부터 끝까지 트러블없이, 각자의 몫과 모르는 것을 물어봤을 때 답변해준 팀원들에게 정말 감사합니다. 세미 프로젝트 이후 Spring을 배우면서 어려웠지만 
  보다 더 간결하고 API를 사용하면서 하나 하나 모아 진행하니 결과물에 대해 만족합니다. 

  ---
  <br><br><br>

