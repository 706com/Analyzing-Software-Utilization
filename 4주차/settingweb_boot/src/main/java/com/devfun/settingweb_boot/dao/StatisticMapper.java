package com.devfun.settingweb_boot.dao;

import java.util.HashMap;

import com.devfun.settingweb_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearMonthLogin(String yearMonth);
    
    public HashMap<String, Object> selectYearMonthDayLogin(String yearMonthDay);

	public HashMap<String, Object> selectAverageYearMonthLogin(String yearMonth);

	public HashMap<String, Object> exceptionHolidayYearMonthlogin(String yearMonth);

	public HashMap<String, Object> selectDepartmentYearMonthLogin(String departmentYearMonth,String department);
}

//StatisticMapper 인터페이스를 작성합니다.