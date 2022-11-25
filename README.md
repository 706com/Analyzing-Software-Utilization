# Comento_Spring

<details>
<summary><✔해야 할 일✔> </summary>  
   
     
1.readme file 정리  
 > markdown 공부 후, 깔끔하게 정리  
 > >최상단 readme -> 약식으로만 과제 및 소제목만 작성 + 주차별 로 가는 링크걸기    
 > >주차별 readme -> 상세한 설명작성 + 시행착오, Q&A 별로 묶어서 문단화 시키기     
   
 2.word file 정리 
 >목차 넣기  
 >설명 가독성 있고, 깔끔하게 정리 (하는김에 word 에 적응하고 기본단축키 숙지)    
   
</details>  
     
### 1주차 : 개발환경 셋팅 (✅)   
<details>
  <summary>자세히</summary>
  
## <1주차>
**이번 과정은 스프링 부트를 활용할 예정입니다.**   
**그러나, 이 과정 속에서 스프링 부트가 스프링에 비해 얼마나 간편한지 스스로 느낄 기회를 가져야 한다는 생각에**  
**가정 먼저 스프링 부트가 아닌 스프링의 개발환경 구축을 선수행하도록 안내합니다.**  
**아래 내용을 참고하여 스프링의 개발 환경 구축을 진행해봅니다.**  
(스프링 부트의 경우 3차 과제에서 셋팅 진행합니다.)  


#### 1. JDK 1.8 설치 (완료)  
1. JDK 1.8u_221 버전 설치  
2. 환경변수 세팅 (JAVA HOME -> jdk1.8u_221)  
###### Q&A)  
1. jdk / jre 차이는?  
2. 환경변수 셋팅 하는 이유는?  
#### 2. Eclipse, Spring 다운로드 및 설치 (완료)  
1. Eclipse (JAVA EE IDE) 설치(버전 : 2020-06)  
2. Eclipse.ini 파일 내용안에 -vm C:\Program Files\Java\jdk1.8.0_221\bin\javaw.exe 추가 (상단)  
3. jsp, html ,css 인코딩 : UTF-8 로 수정  
4. 이클립스 마켓에서 spring STS 3 (Spring Tool) 설치 (버전 : 3.9.14.RELEASE(@22.11월 기준 최신))  
###### -시행착오-  
1. 이클립스와 이클립스 EE IDE 를 착각하여 실행 오류를 겪었다.  
###### -Q&A-  
1. 이클립스와 이클립스 EE IDE 의 차이는?  
2. Eclipse.ini 수정이유는?  
3. 인코딩(UTF-8) 이란 무엇이며 변경이유는  
#### 3. 톰캣 설정 (완료)  
1. 톰캣 다운로드 ( 버전: 9 (jdk 1.8 과 호환))  
###### -Q&A-  
1. 톰캣이란?  
#### 4. Hello World 출력 (완료)  
1. 스프링 프로젝트 생성  
2. pom.xml : 스프링 버전 변경 (버전 : 5.3.23 (@22.11월 기준 최신))  
3. pom.xml : jdk 버전 변경 (버전 : 1.8)  
4. pom.xml : maven-compiler 버전 변경 (qjwjs : 3.10.1 (@22.11월 기준 최신))  
5. 톰캣 서버세팅 및 구동 (버전 : 9.0 , localhost:8080/settingweb)  
#### 5. mariaDB, mySql WorkBench 설치 및 샘플 DB 구축 (완료)  
1. mariadb (JDBC), mysql_workbench (sql_developer) 설치  
2. 스키마 및 테이블 생성 ( (theater) / (movie_id , movie_name , director , type , moviecol) )  
###### -Q&A-  
1. mariadb 와 mysql_workbench 의 차이는?  
#### 6. 스프링, Mariadb, MyBatis 연동, 데이터 조회 (완료)  
1. "데이터 가져오기" 를 위한 설정관련 파일 수정 및 작성 POM.xml , root-context.xml , mabatis-config.xml , logback.xml , log4jdbc.log4j2.properties , test.xml  
2. "데이터 조회" 를 위한 JAVA 코드작성  
3. 톰캣 url 세팅 변경  
###### -시행착오-  
1. POM.xml : dendencies 를 읽을 때, db dependency 가 spring dependency 보다 앞에 존재하면 안된다.  
2. root-context.xml : context를 읽기 위해서  
xmlns:context="http://www.springframework.org/schema/context" 문장 추가와  
> xsi:schemaLocation 안에,  
> http://www.springframework.org/schema/context  
> http://www.springframework.org/schema/context/spring-context.xsd 를 추가해야한다.  


###### -Q&A-  
1. getter / setter 를 하는 이유는?  
2. mybatis 란?  
3. 각각의 dependency , bean , configuration 들의 쓰임은 무엇인가?  

</details>
  
### 2주차 : 프론트엔드 개발자와 백엔드 개발자의 협업 이해하기 (✅)  
-  
  
  
### 3주차 : 스프링부트 환경을 셋팅 / 간단한 API를 만들기 (✅)  
<details>
  <summary>자세히</summary>  
  
## <3주차>
**학습과제**  
  
▪ 주제: 간단한 Restful API 구현  
▪ - Spring, RestController를 이용하여 백엔드를 이해합니다.   
▪ ( 간단한 RestController 구현 20년도 접속자 리스트 출력)   
▪ 샘플 데이터를 DB table로 작성하고 table에 insert 합니다.  
  
   
본격적으로 Rest API에 대한 실습에 들어가봅니다.  
이번 과제에서는 스프링부트 환경을 셋팅해보고  
스프링 부트를 기반으로 간단한 API를 만들어보는 시간을 가집니다.  

- 해당 과제를 통해 즉 요약하면 여러분이 얻어갈 내용은 아래 2가지입니다.  
1) 스프링 VS 스프링부트  
2) 간단한 API 개발  
  
</details>  
  
### 4주차 : 3차과제에서 작성한 API와 SQL(5가지)를 중심으로 API를 개발 (진행중)  
-  
   
    
