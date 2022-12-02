// 3. Service 작성( 비즈니스 로직 작성 )
//interface로 yearloginNum을 정의합니다.

package com.devfun.settingweb_boot.service;
 
import java.util.HashMap;
import java.util.Map;
 
public interface StatisticService {
    public HashMap<String,Object> yearMonthloginNum (String yearMonth);
    
    public HashMap<String,Object> yearMonthDayloginNum (String yearMonthDay);
    
	public HashMap<String, Object> averageYearMonthloginNum (String yearMonth);

	public HashMap<String, Object> exceptionHolidayYearMonthloginNum(String yearMonth);
	
    public HashMap<String,Object> departmentYearMonthloginNum (String departmentYearMonth,String department);
    
}

