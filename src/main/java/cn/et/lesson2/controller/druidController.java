package cn.et.lesson2.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson2.service.EmpService;

@RestController
public class druidController {
	@Autowired
	DataSource dataSource;
	
	@Autowired
	EmpService es;
	
	
	@RequestMapping("/sysoSource")
	public String hello(){
		return dataSource.toString();
	}
	
	/*@RequestMapping("/queryAll")
	public List<Emp> queryAll(){
		return es.queryEmp();
	}*/
	
	/*@RequestMapping("/emp/{eid}")
	public Emp queryById(@PathVariable Integer eid){
		return es.queryById(eid);
	}*/
}
