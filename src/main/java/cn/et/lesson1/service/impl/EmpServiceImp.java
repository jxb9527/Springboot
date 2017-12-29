package cn.et.lesson1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.et.lesson1.dao.EmpRepository;
import cn.et.lesson1.entity.Emp;
import cn.et.lesson1.service.EmpService;

@Service
public class EmpServiceImp implements EmpService {
	/**
	 * 只需要配置application.properties的四要素，就可以使用该类
	 * spring.datasource.url=jdbc:mysql://localhost/food
	 * spring.datasource.username=root
	 * spring.datasource.password=123456
	 * spring.datasource.driver-class-name=com.mysql.jdbc.Driver	
	 */
	@Autowired
	JdbcTemplate jdbc;

	/**
	 * 自定义一个接口继承自CrudRepository即可
	 * 	public interface EmpRepository extends CrudRepository<操作实体类型, 主键类型> {
	 *
	 *	}
	 */
	
	@Autowired
	EmpRepository er;

	@Override
	public Emp findOne(Integer eid) {
		Emp findOne = er.findOne(eid);
		return findOne;
	}

	@Override
	public void save(Emp emp) {
		er.save(emp);
	}
}
