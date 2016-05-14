package cn.edu.fjnu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import ch.qos.logback.classic.Logger;
import cn.edu.fjnu.entity.TableStudent;
import cn.edu.fjnu.service.TableStudentService;

@Controller
public class IndexController {
	private static Logger log=(Logger) LoggerFactory.getLogger(IndexController.class);
	@Resource
	TableStudentService service;
	@RequestMapping("index")
	public String index() {
		log.debug("mememe");
		//List<TableStudent>studentList=service.getAll();
		//System.out.println(studentList);
		//test
		//test2
		//tese4
		log.info("memememe");
		return "index";
	}
}
