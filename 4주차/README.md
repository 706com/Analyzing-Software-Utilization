
# SW 활용률 API 작성 - Spring Comento 
```
소프트웨어 활용률을 다루는 API 명세서 및 API 작성하기.
```

* 월 별 소프트웨어에 접속한 접속자 수 출력

* 일자별 소프트웨어에 접속한 접속자 수 출력

* 월 기준으로, 평균 하루 로그인 수 출력

* 공휴일을 제외한 월 별 소프트웨어 접속자 수 출력

* 부서별로 월 별 소프트웨어 접속자 수 출력


## DB


<details>
    <summary>테이블 및 데이터 보기</summary>
 

**Database**  

```
CREATE DATABASE statistc;
```
<br>

**Table**

***요청정보***

```sql
CREATE Table statistc.requestInfo (
    requestID numeric NOT NULL primary key,
    requestCode varchar(5) NOT NULL,
    userID varchar(5),
    createDate varchar(10)
);
```


***요청코드***
```sql
CREATE table statistc.requestCode (
    requestCode varchar(5) NOT NULL primary key,
    code_explain varchar(50) NOT NULL
);
```

***사용자 정보***
```sql
CREATE table statistc.user (
    userID varchar(5) NOT NULL primary key,
    department varchar(5) NOT NULL,
    USERNAME varchar(5) NOT NULL
);
```

***월별 일 수***
```sql
CREATE table statistc.daysPerMonth(
	month varchar(5) NOT NULL,
    days varchar(5) NOT NULL
);
```

***공휴일 정보***
```sql
CREATE table statistc.holiday(
	yearMonthDay varchar(12) NOT NULL,
    description varchar(20) NOT NULL
);
```
<br>

*2008180520 = 20년 08월 18일 05시 20분*

![요청정보](https://user-images.githubusercontent.com/104816530/205433198-78b11845-a63e-483e-b2db-8d2a0cf4670c.jpg)

![요청코드](https://user-images.githubusercontent.com/104816530/205433199-9b03bdc7-d8b3-4c79-880b-d3b2652d7975.jpg)

![사용자정보](https://user-images.githubusercontent.com/104816530/205433195-ee091396-d705-4d10-950d-f7be668c1b1c.jpg)

![공휴일정보](https://user-images.githubusercontent.com/104816530/205433192-3de685ba-1c75-45f4-b0d4-29fd81e6b355.jpg)

![월별일자 정보](https://user-images.githubusercontent.com/104816530/205433200-5c9dcf64-2687-44bf-b074-0b7661975d3b.jpg)


</details>  

<br>
## API 

<details>
  <summary> ❗ 월 별 접속자 수 ❗</summary>

<br>


***settingTest.java***
```java
// 1)월별 접속자 수
// requesturl : http://localhost:8031//sqlStatistic/yearMonth?yearMonth=2008
@ResponseBody 
@RequestMapping("/sqlStatistic/yearMonth")
public Map<String, Object> sqltest(String yearMonth) throws Exception{ 

    return service.yearMonthloginNum(yearMonth);   	
}
```   
<br>

***statisticMapper.xml***
```java
<select id="selectYearMonthLogin" parameterType="string" resultType="hashMap">
    select count(*) as totCnt
	from statistc.requestInfo ri
	where left(ri.createDate , 4) = #{yearMonth} and ri.requestcode = "L" ; 
</select>
```   
<br>

***20년08월 로그인 수***

![월별 접속자 수](https://user-images.githubusercontent.com/104816530/205307842-bfaa7915-27ac-465f-a528-3024b25c6f0b.jpg)

</details>
<br>


<details>
  <summary> ❗ 일자별 접속자 수 ❗</summary>

```java
// 2) 일자별 접속자 수
// requesturl : http://localhost:8031/sqlStatistic/yearMonthDay?yearMonthDay=200815
@ResponseBody 
@RequestMapping("/sqlStatistic/yearMonthDay")
public Map<String, Object> sqltest2(String yearMonthDay) throws Exception{ 

    return service.yearMonthDayloginNum(yearMonthDay);   	
}
```   

<br>

***statisticMapper.xml***
```java
<select id="selectYearMonthDayLogin" parameterType="string" resultType="hashMap">
    select count(*) as totCnt
	from statistc.requestInfo ri
	where left(ri.createDate , 6) = #{yearMonthday} and ri.requestcode = "L" ; 
</select>
```   
<br>

***20년 8월 15일 접속자 수***
  
![일자별 접속자 수](https://user-images.githubusercontent.com/104816530/205431652-520b0f8d-a141-4908-b568-206702097577.jpg)

</details>
<br>


<details>
  <summary> ❗ 평균 하루 로그인 수 ❗</summary>


```java
// 3) 평균 하루 로그인 수
// requesturl : http://localhost:8031/sqlStatistic/average/yearMonth?yearMonth=2008
@ResponseBody 
@RequestMapping("/sqlStatistic/average/yearMonth")
public Map<String, Object> sqltest3(String yearMonth) throws Exception{ 

    return service.averageYearMonthloginNum(yearMonth);  	
}
```   

<br>

***statisticMapper.xml***
```java
<select id="selectAverageYearMonthLogin" parameterType="string" resultType="hashMap">
    select Round(count(*) / dpm.days,3) as totCnt
	from statistc.requestInfo ri , statistc.daysPerMonth dpm
	where left(ri.createDate, 4) = #{yearMonth} and ri.requestcode = "L" and mid(ri.createDate, 3,2) = dpm.month ;
</select>
```   
<br>

***20년 8월 평균 하루 로그인 수*** 
  
![평균 하루 로그인 수](https://user-images.githubusercontent.com/104816530/205431654-22ff296e-bbdd-4556-aa5b-a8fe65c2a857.jpg)

</details>
<br>


<details>
  <summary> ❗ 공휴일을 제외한 로그인 수 ❗</summary>

```java
// 4) 공휴일을 제외한 로그인 수
// requesturl : http://localhost:8031/sqlStatistic/exceptionHoliday/yearMonth?yearMonth=2008
@ResponseBody 
@RequestMapping("/sqlStatistic/exceptionHoliday/yearMonth")
public Map<String, Object> sqltest4(String yearMonth) throws Exception{ 

    return service.exceptionHolidayYearMonthloginNum(yearMonth);
}
```   

<br>

***statisticMapper.xml***
```java
<select id="exceptionHolidayYearMonthlogin" parameterType="string" resultType="hashMap">
    select count(*) - 
	(
		select count(*) 
		from statistc.requestInfo ri , statistc.holiday h
		where left(ri.createDate, 4) = #{yearMonth} and ri.requestcode = "L" and left(ri.createDate, 6) = h.yearMonthDay
	) 	as totcount
	from statistc.requestInfo ri 
	where left(ri.createDate, 4) = #{yearMonth} and ri.requestcode = "L" ;
</select>
```   
<br>

***20년 8월 공휴일을 제외한 로그인 수***  
  
![휴일을 제외한 로그인 수](https://user-images.githubusercontent.com/104816530/205431665-5ce58775-6425-48ea-b20a-120914c168e8.jpg)

</details>
<br>

<details>
  <summary> ❗ 부서별 월별 로그인 수 ❗</summary>

```java
// 5) 부서별 월별 로그인 수
// requesturl : http://localhost:8031/sqlStatistic/department/yearMonth?yearMonth=2008&&department=IT
@ResponseBody 
@RequestMapping("/sqlStatistic/department/yearMonth")
public Map<String, Object> sqltest5(String yearMonth, String department) throws Exception{ 

    return service.departmentYearMonthloginNum(yearMonth, department);	
}

```   

<br>

***statisticMapper.xml***
```java
<select id="selectDepartmentYearMonthLogin" parameterType="string" resultType="hashMap">
    select count(*) as totCnt
	from statistc.requestInfo ri , statistc.user us
	where left(ri.createDate, 4) = #{departmentYearMonth} and ri.requestcode = "L" and us.department = #{department} and ri.userID = us.USERID ;
</select>
```   
<br>

***20년 8월 IT부서 월별 로그인 수***  
   
![부서별 월별 로그인수](https://user-images.githubusercontent.com/104816530/205431661-1b25d05f-5bd5-4637-8209-03afc91f3774.jpg)

</details>
