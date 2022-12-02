package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;
 
 
 
@Controller
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    // 1)월별 접속자 수
    // requesturl : http://localhost:8031//sqlStatistic/yearMonth?yearMonth=2008
    @ResponseBody 
    @RequestMapping("/sqlStatistic/yearMonth")
    public Map<String, Object> sqltest(String yearMonth) throws Exception{ 
        return service.yearMonthloginNum(yearMonth);   	
    }
    
    // 2) 일자별 접속자 수
    // requesturl : http://localhost:8031/sqlStatistic/yearMonthDay?yearMonthDay=200815
    @ResponseBody 
    @RequestMapping("/sqlStatistic/yearMonthDay")
    public Map<String, Object> sqltest2(String yearMonthDay) throws Exception{ 
        //System.out.println(yearMonthDay);
        return service.yearMonthDayloginNum(yearMonthDay);   	
    }
    
    // 3) 평균 하루 로그인 수
    // requesturl : http://localhost:8031/sqlStatistic/average/yearMonth?yearMonth=2008
    @ResponseBody 
    @RequestMapping("/sqlStatistic/average/yearMonth")
    public Map<String, Object> sqltest3(String yearMonth) throws Exception{ 
        System.out.println(yearMonth);
        return service.averageYearMonthloginNum(yearMonth);  	
    }
    
    // 4) 휴일을 제외한 로그인 수
    // requesturl : http://localhost:8031/sqlStatistic/exceptionHoliday/yearMonth?yearMonth=2008
    @ResponseBody 
    @RequestMapping("/sqlStatistic/exceptionHoliday/yearMonth")
    public Map<String, Object> sqltest4(String yearMonth) throws Exception{ 
        System.out.println(yearMonth);
        return service.exceptionHolidayYearMonthloginNum(yearMonth);
    }
    
    // 5) 부서별 월별 로그인 수
    // requesturl : http://localhost:8031/sqlStatistic/department/yearMonth?yearMonth=2008&&department=IT
    @ResponseBody 
    @RequestMapping("/sqlStatistic/department/yearMonth")
    public Map<String, Object> sqltest5(String yearMonth, String department) throws Exception{ 
        System.out.println(yearMonth);
        System.out.println(department);
        return service.departmentYearMonthloginNum(yearMonth, department);	
    }

    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}