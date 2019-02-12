package com.sqp.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqp.springcloud.dao.DepartmentDao;
import com.sqp.springcloud.entities.Department;
import com.sqp.springcloud.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService
{

	@Autowired
	DepartmentDao departmentDao;
	
	@Override
	public boolean add(Department dept)
	{
		return departmentDao.addDept(dept);
	}

	@Override
	public Department get(Integer id)
	{
		return departmentDao.findById(id);
	}

	@Override
	public List<Department> list()
	{
		return departmentDao.findAll();
	}
}
