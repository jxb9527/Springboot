package cn.et.lesson1.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson1.entity.Emp;
import cn.et.lesson1.service.EmpService;
/**
 * helloworld例子
 * @author Administrator
 *
 */
@RestController
public class SbController {
	
	@Autowired
	EmpService er;
	/**
	 * springmvc例子
	 * @return
	 */
	@RequestMapping("/hello")
	public Map hello() {
		Map map = new HashMap();
		map.put("id", 1);
		map.put("name", "zs");
		return map;
	}
	
	/**
	 * 使用jdbcTemplate的例子
	 * @return
	 */
	/*@RequestMapping("/emp/{eid}")
	public Map queryEmp(@PathVariable String eid) {
		List<Map<String, Object>> queryForList = jdbc.queryForList("select * from emp where eid=" + eid);
		return queryForList.get(0);
	}*/

	/**
	 * 使用hibernate新增的例子
	 * @return
	 */
	@RequestMapping("/saveEmp")
	public String saveEmp() {
		Emp emp =new Emp();
		emp.setEname("哈哈哈");
		emp.setEsal(45.0);
		emp.setDid(4);
		er.save(emp);
		return "1";
	}
	
	/**
	 * 使用hibernate查询的例子
	 * @param eid
	 * @return
	 */
	@RequestMapping("/emp/{eid}")
	public Emp queryEmp(@PathVariable Integer eid) {
		Emp emp = er.findOne(eid);
		return emp;
	}
	
}
