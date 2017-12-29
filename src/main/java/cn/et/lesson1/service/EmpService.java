package cn.et.lesson1.service;

import cn.et.lesson1.entity.Emp;

public interface EmpService {
	public Emp findOne(Integer eid);
	
	public void save(Emp emp);
}
