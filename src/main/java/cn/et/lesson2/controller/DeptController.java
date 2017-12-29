package cn.et.lesson2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson2.entity.TreeNode;
import cn.et.lesson2.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	DeptService ds;
	
	@RequestMapping(value="/queryDept",method={RequestMethod.GET})
	public List<TreeNode> queryDept(Integer id){
		List<TreeNode> queryTreeNode = ds.queryTreeNode(id);
		return queryTreeNode;
	}
}
