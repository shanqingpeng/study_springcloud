package com.sqp.springcloud.eureka.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.sqp.springcloud.entities.Department;

@Mapper
public interface DepartmentDao
{
	public boolean addDept(Department dept);

	public Department findById(Integer id);

	public List<Department> findAll();
}