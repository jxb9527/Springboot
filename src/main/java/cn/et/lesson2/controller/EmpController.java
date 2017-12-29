package cn.et.lesson2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson2.entity.Emp;
import cn.et.lesson2.entity.Result;
import cn.et.lesson2.service.EmpService;
import cn.et.lesson2.util.PageTool;

@RestController
public class EmpController {
	@Autowired
	EmpService es;
	
/*	@RequestMapping(value="/queryEmp",method={RequestMethod.GET})
	public List<Emp> queryEmp1(Integer id,String ename,Integer page,Integer rows){
		return es.queryEmp(id);
	}*/
	
	
	@RequestMapping(value="/queryEmp",method={RequestMethod.GET})
	public PageTool queryEmp(Integer id,String ename,Integer page,Integer rows){
		PageTool pt = es.queryEmpName(id, ename, page, rows);
		return pt;
	}
	
	@RequestMapping(value="/emp",method={RequestMethod.POST})
	public Result saveEmp(Emp emp){
		Result r=new Result();
		r.setCode(1);
		try {
			es.saveEmp(emp);
		} catch (Exception e) {
			r.setCode(0);
			r.setMessage(e);
		}
		return r;
	}
	
	@RequestMapping(value="/emp/{eid}",method={RequestMethod.DELETE})
	public Result deleteFood(@PathVariable Integer eid){
		Result r=new Result();
		r.setCode(1);
		try {
			 es.deleteEmp(eid);
		} catch (Exception e) {
			r.setCode(0);
			r.setMessage(e);
		}
		return r;
	}
	
	@RequestMapping(value="/emp/{eid}",method={RequestMethod.PUT})
	public Result udpateFood(@PathVariable Integer eid,Emp emp){
		Result r=new Result();
		emp.setEid(eid);
		r.setCode(1);
		try {
			es.updateEmp(emp);
		} catch (Exception e) {
			r.setCode(0);
			r.setMessage(e);
		}
		return r;
	}
}
