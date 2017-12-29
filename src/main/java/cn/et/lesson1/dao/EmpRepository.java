package cn.et.lesson1.dao;

import org.springframework.data.repository.CrudRepository;

import cn.et.lesson1.entity.Emp;
public interface EmpRepository extends CrudRepository<Emp, Integer> {
	
}
