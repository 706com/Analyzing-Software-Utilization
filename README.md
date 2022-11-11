# Comento_Spring
Practice Spring 
  
## <1주차>
**이번 과정은 스프링 부트를 활용할 예정입니다.**  
**그러나, 이 과정 속에서 스프링 부트가 스프링에 비해 얼마나 간편한지 스스로 느낄 기회를 가져야 한다는 생각에**  
**가정 먼저 스프링 부트가 아닌 스프링의 개발환경 구축을 선수행하도록 안내합니다.**  
**아래 내용을 참고하여 스프링의 개발 환경 구축을 진행해봅니다.**  
(스프링 부트의 경우 3차 과제에서 셋팅 진행합니다.)  
  
### 1. JDK 1.8 설치 (완료)  
1. JDK 1.8u_221 버전 설치 
2. 환경변수 세팅 (JAVA HOME -> jdk1.8u_221)
  
###### Q&A)  
  1. jdk / jre 차이는?   
  2. 환경변수 셋팅 하는 이유는?   
    
### 2. Eclipse, Spring 다운로드 및 설치 (완료)  
1. Eclipse (JAVA EE IDE) 설치(버전 : 2020-06) 
2. Eclipse.ini 파일 내용안에 -vm C:\Program Files\Java\jdk1.8.0_221\bin\javaw.exe 추가 (상단)  
3. jsp, html ,css 인코딩 : UTF-8 로 수정  
4. 이클립스 마켓에서 spring STS 3 (Spring Tool) 설치 (버전 : 3.9.14.RELEASE(@22.11월 기준 최신))
###### 겪은 문제  
  1. 이클립스와 이클립스 EE IDE 를 착각하여 실행 오류를 겪었다.   
###### Q&A)  
  1. 이클립스와 이클립스 EE IDE 의 차이는?  
  2. Eclipse.ini 수정이유는? 
  3. 인코딩(UTF-8) 이란 무엇이며 변경이유는?
    
### 3. 톰캣 설정 (완료)  
  1. 톰캣 다운로드 ( 버전: 9 (jdk 1.8 과 호환))    
  
###### Q&A)
  1. 톰캣이란?  
    
### 4. Hello World 출력 (완료)  
1. 스프링 프로젝트 생성  
2. pom.xml : 스프링 버전 변경 (버전 : 5.3.23 (@22.11월 기준 최신))  
3. pom.xml : jdk 버전 변경 (버전 : 1.8)  
4. pom.xml : maven-compiler 버전 변경 (qjwjs : 3.10.1 (@22.11월 기준 최신))  
5. 톰캣 서버세팅 및 구동 (버전 : 9.0 , localhost:8080/settingweb)  
  
    
### 5. mariaDB, mySql WorkBench 설치 및 샘플 DB 구축 (완료)  
1. mariadb (JDBC), mysql_workbench (sql_developer) 설치  
2. 스키마 및 테이블 생성 ( (theater) / (movie_id , movie_name , director , type , moviecol) )  
3. 
 
###### Q)  
1. mariadb 와 mysql_workbench 의 차이는 뭘까?
2. 
    
### 6. 스프링, Mariadb, MyBatis 연동, 데이터 조회 (완료)  
  -겪은 문제  
  Q)  
  
