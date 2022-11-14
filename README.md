# Comento_Spring

  
#### Questions to mentor
### 1주차 : 개발환경 셋팅 (완료)   
<details>
  <summary>자세히</summary>
  
## <1주차>
      **이번 과정은 스프링 부트를 활용할 예정입니다.**   
      **그러나, 이 과정 속에서 스프링 부트가 스프링에 비해 얼마나 간편한지 스스로 느낄 기회를 가져야 한다는 생각에**  
      **가정 먼저 스프링 부트가 아닌 스프링의 개발환경 구축을 선수행하도록 안내합니다.**  
      **아래 내용을 참고하여 스프링의 개발 환경 구축을 진행해봅니다.**  
      (스프링 부트의 경우 3차 과제에서 셋팅 진행합니다.)  


      ###### 1. JDK 1.8 설치 (완료)
      JDK 1.8u_221 버전 설치
      환경변수 세팅 (JAVA HOME -> jdk1.8u_221)
      Q&A)
      jdk / jre 차이는?
      환경변수 셋팅 하는 이유는?
      2. Eclipse, Spring 다운로드 및 설치 (완료)
      Eclipse (JAVA EE IDE) 설치(버전 : 2020-06)
      Eclipse.ini 파일 내용안에 -vm C:\Program Files\Java\jdk1.8.0_221\bin\javaw.exe 추가 (상단)
      jsp, html ,css 인코딩 : UTF-8 로 수정
      이클립스 마켓에서 spring STS 3 (Spring Tool) 설치 (버전 : 3.9.14.RELEASE(@22.11월 기준 최신))
      -시행착오-
      이클립스와 이클립스 EE IDE 를 착각하여 실행 오류를 겪었다.
      -Q&A-
      이클립스와 이클립스 EE IDE 의 차이는?
      Eclipse.ini 수정이유는?
      인코딩(UTF-8) 이란 무엇이며 변경이유는?
      3. 톰캣 설정 (완료)
      톰캣 다운로드 ( 버전: 9 (jdk 1.8 과 호환))
      -Q&A-
      톰캣이란?
      4. Hello World 출력 (완료)
      스프링 프로젝트 생성
      pom.xml : 스프링 버전 변경 (버전 : 5.3.23 (@22.11월 기준 최신))
      pom.xml : jdk 버전 변경 (버전 : 1.8)
      pom.xml : maven-compiler 버전 변경 (qjwjs : 3.10.1 (@22.11월 기준 최신))
      톰캣 서버세팅 및 구동 (버전 : 9.0 , localhost:8080/settingweb)
      5. mariaDB, mySql WorkBench 설치 및 샘플 DB 구축 (완료)
      mariadb (JDBC), mysql_workbench (sql_developer) 설치
      스키마 및 테이블 생성 ( (theater) / (movie_id , movie_name , director , type , moviecol) )
      -Q&A-
      mariadb 와 mysql_workbench 의 차이는?
      6. 스프링, Mariadb, MyBatis 연동, 데이터 조회 (완료)
      "데이터 가져오기" 를 위한 설정관련 파일 수정 및 작성 POM.xml , root-context.xml , mabatis-config.xml , logback.xml , log4jdbc.log4j2.properties , test.xml
      "데이터 조회" 를 위한 JAVA 코드작성
      톰캣 url 세팅 변경
      -시행착오-
      POM.xml : dendencies 를 읽을 때, db dependency 가 spring dependency 보다 앞에 존재하면 안된다.
      root-context.xml : context를 읽기 위해서
      xmlns:context="http://www.springframework.org/schema/context" 문장 추가와
      xsi:schemaLocation 안에,
      http://www.springframework.org/schema/context
      http://www.springframework.org/schema/context/spring-context.xsd 를 추가해야한다.


      -Q&A-
      getter / setter 를 하는 이유는?
      mybatis 란?
      각각의 dependency , bean , configuration 들의 쓰임은 무엇인가?

</details>
  
### 2주차 : 프론트엔드 개발자와 백엔드 개발자의 협업 이해하기 (진행중)  
-  
  
  
### 3주차 : 스프링부트 환경을 셋팅 / 간단한 API를 만들기 (미완료)  
-  
  
  
### 4주차 : 3차과제에서 작성한 API와 SQL(5가지)를 중심으로 API를 개발 (미완료)  
-  
   
    
