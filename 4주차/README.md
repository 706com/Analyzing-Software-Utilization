❗ 과제는 완료하였으나, 4주차 -readme 파일 및 api 명세서 작성 중

# SW 활용률 API 작성 - Spring Comento 
```
소프트웨어 활용률을 다루는 API 명세서 및 API 작성을 목표로 한다.
```

<br>

### API 

<details>
  <summary> 1) 월 별 접속자 수</summary>

<br>


settingTest.java
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

statisticMapper.xml
```java
<select id="selectYearMonthLogin" parameterType="string" resultType="hashMap">
    select count(*) as totCnt
	from statistc.requestInfo ri
	where left(ri.createDate , 4) = #{yearMonth} and ri.requestcode = "L" ; 
</select>
```   
<br>

20년08월 로그인 수

![월별 접속자 수](https://user-images.githubusercontent.com/104816530/205307842-bfaa7915-27ac-465f-a528-3024b25c6f0b.jpg)

</details>
<br>


<details>
  <summary> 2) 일자별 접속자 수</summary>

```java
// 2) 일자별 접속자 수
// requesturl : http://localhost:8031/sqlStatistic/yearMonthDay?yearMonthDay=200815
    @ResponseBody 
    @RequestMapping("/sqlStatistic/yearMonthDay")
    public Map<String, Object> sqltest2(String yearMonthDay) throws Exception{ 
        //System.out.println(yearMonthDay);
        return service.yearMonthDayloginNum(yearMonthDay);   	
    }
```   
</details>
<br>


<details>
  <summary> 3) 평균 하루 로그인 수</summary>


```java
// 3) 평균 하루 로그인 수
// requesturl : http://localhost:8031/sqlStatistic/average/yearMonth?yearMonth=2008
    @ResponseBody 
    @RequestMapping("/sqlStatistic/average/yearMonth")
    public Map<String, Object> sqltest3(String yearMonth) throws Exception{ 
        System.out.println(yearMonth);
        return service.averageYearMonthloginNum(yearMonth);  	
    }
```   

</details>
<br>


<details>
  <summary> 4) 휴일을 제외한 로그인 수</summary>

```java
// 4) 휴일을 제외한 로그인 수
// requesturl : http://localhost:8031/sqlStatistic/exceptionHoliday/yearMonth?yearMonth=2008
    @ResponseBody 
    @RequestMapping("/sqlStatistic/exceptionHoliday/yearMonth")
    public Map<String, Object> sqltest4(String yearMonth) throws Exception{ 
        System.out.println(yearMonth);
        return service.exceptionHolidayYearMonthloginNum(yearMonth);
    }
```   
</details>
<br>

<details>
  <summary> 5) 부서별 월별 로그인 수</summary>

```java
// 5) 부서별 월별 로그인 수
// requesturl : http://localhost:8031/sqlStatistic/department/yearMonth?yearMonth=2008&&department=IT
    @ResponseBody 
    @RequestMapping("/sqlStatistic/department/yearMonth")
    public Map<String, Object> sqltest5(String yearMonth, String department) throws Exception{ 
        System.out.println(yearMonth);
        System.out.println(department);
        return service.departmentYearMonthloginNum(yearMonth, department);	
    }

```   

</details>
