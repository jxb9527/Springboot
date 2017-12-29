package cn.et.lesson2.service;

import java.util.List;

import cn.et.lesson2.entity.TreeNode;

public interface DeptService {
	public List<TreeNode> queryTreeNode(Integer pid);
}
