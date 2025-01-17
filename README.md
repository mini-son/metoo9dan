# metoo9dan Spring Boot Project
바둑 교육 웹 어플리케이션 '나도9단'  
<br/>
![image](https://github.com/mini-son/metoo9dan/assets/134951047/074d8e27-9498-4fde-b6be-a890c5e8b164)  

![image](https://github.com/mini-son/metoo9dan/assets/134951047/6c57af74-ef23-4bb4-943f-d810349d1792)

<br/>

## 프로젝트 소개
 - 포스트 코로나 이후 비대면 교육 서비스가 활발해짐에 따라 온라인으로도 편리하게 학원 및 학교 방과 후 학습을 진행을 돕기 위해 개발한 서비스로 교육자, 학생, 일반인 액터로 구성되어 있습니다.
 - 교육자와 일반 회원인 경우 게임콘텐츠를 구매할 수 있고 결제한 게임콘텐츠를 선택해 학습 그룹을 생성할 수 있습니다.
 - 학습자는 교육자가 생성한 학습 그룹에 가입하여 교육자가 배포하는 숙제를 제출할 수 있습니다. 교육자는 학습자가 제출한 숙제를 평가합니다.

<br/>

## 프로젝트 상세
기간 : 2023.09.19 ~ 2023.10.24  
인원 : 5명(FE&BE, 담당페이지FE&BE 모두 진행)  
언어 : Java(JDK17), JavaScript, HTML5/CSS3  
서버 : Apache Tomcat 9.0  
프레임워크 : Spring Boot, MyBatis  
DB : MariaDB 10.11.2  
IDE : IntelliJ 2023.2  
library & API : JPA, Spring Security, Thymeleaf, KaKao Pay API, Mail API  

<br/>

## 주요 역할
1. DB설계
2. 학습 그룹 생성/신청
3. 학습 그룹 조회/학습 그룹 승인 신청 목록 조회
4. 학습 그룹 승인 신청/승인 처리
5. 403 에러 페이지 처리

<br/>   
  
## 소스 코드
- 학습 그룹 페이지  
https://github.com/mini-son/metoo9dan/tree/master/src/main/java/com/idukbaduk/metoo9dan/studyGroup  
https://github.com/mini-son/metoo9dan/tree/master/src/main/resources/mybatis/mapper/studyGroup  
https://github.com/mini-son/metoo9dan/tree/master/src/main/resources/templates/studyGroup  
