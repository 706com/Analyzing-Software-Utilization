package com.devfun.settingweb_boot.service;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
//import com.devfun.settingweb_boot.dto.StatisticDto;
 
@Service
public class StatisticServiceImpl implements StatisticService  {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
//    @Autowired
//    private StatisticDto asd;
    
    @Override
    public HashMap<String, Object> yearMonthloginNum (String yearMonth) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        //String a = "hi";
        
        try {
        	//retVal = asd.StatisticDto(a);
            retVal = uMapper.selectYearMonthLogin(yearMonth);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", yearMonth);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> yearMonthDayloginNum (String yearMonthDay) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearMonthDayLogin(yearMonthDay);
            retVal.put("yearMonthDay", yearMonthDay);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", yearMonthDay);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    
    @Override
    public HashMap<String, Object> averageYearMonthloginNum (String yearMonth) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
        	//retVal.StatisticDto(yearMonth);
        	
            retVal = uMapper.selectAverageYearMonthLogin(yearMonth);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", true);
            
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", false);
        }
        //System.out.println("2");
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> exceptionHolidayYearMonthloginNum(String yearMonth){
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
        	//retVal.StatisticDto(yearMonth);
        	
            retVal = uMapper.exceptionHolidayYearMonthlogin(yearMonth);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", true);
            
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", false);
        }
        //System.out.println("2");
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> departmentYearMonthloginNum (String departmentYearMonth, String department) {
    	// TODO Auto-generated method stub
    	HashMap<String, Object> retVal = new HashMap<String,Object>();
    	
    	try {
    		
    		retVal = uMapper.selectDepartmentYearMonthLogin(departmentYearMonth,department);
    		retVal.put("departmentYearMonth", departmentYearMonth);
    		retVal.put("department", department);
    		retVal.put("is_success", true);
    		//System.out.println(department);
    		
    		
    	}catch(Exception e) {
    		retVal.put("totCnt", -999);
    		retVal.put("year", departmentYearMonth);
    		retVal.put("is_success", false);
    	}
    	//System.out.println("2");
    	return retVal;
    }
}

//JSON을 만들기 위해 HashMap 형태로 Return을 합니다. 
//HashMap에 값을 year, is_success, 쿼리로 가져온 cnt 값으로 json 값을 만듭니다.