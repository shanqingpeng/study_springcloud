package com.sqp.springcloud.eureka.service;

import java.util.List;

import com.sqp.springcloud.entities.Department;

public interface DepartmentService
{
	public boolean add(Department dept);

	public Department get(Integer id);

	public List<Department> list();
}
