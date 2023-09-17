package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO dao;
	Logger log=Logger.getAnonymousLogger();
	
	@RequestMapping("/")
		public ModelAndView displaydefaultpage(HttpServletRequest request,HttpServletResponse resposne) {
			log.info("entered into the request mapping of /");
			ModelAndView mv=new ModelAndView();
			mv.setViewName("index.jsp");
			return mv;
		}
	
	@RequestMapping("/insert")
	public ModelAndView inserting(HttpServletRequest request,HttpServletResponse resposne) {
		log.info("entered into the request mapping of /insert");
		ModelAndView mv=new ModelAndView();
		Employee emp=new Employee();
		emp.setEmpname(request.getParameter("name"));
		emp.setEmpemail(request.getParameter("email"));
		emp.setAge(Integer.parseInt(request.getParameter("age")));
		log.info("entered assigned values");
		Employee ee=dao.insert(emp);
		log.info("inserted");
		if(ee!=null) {
			mv.setViewName("success.jsp");
		}
		
		return mv;
	}
	
	
	@RequestMapping("/getall")
	public ModelAndView getal(HttpServletRequest request,HttpServletResponse resposne) {
		log.info("entered into the request mapping of /getall");
		ModelAndView mv=new ModelAndView();
		List<Employee> list=dao.getall();
		mv.setViewName("display.jsp");
		mv.addObject("list", list);
		return mv;
	}	
	}


