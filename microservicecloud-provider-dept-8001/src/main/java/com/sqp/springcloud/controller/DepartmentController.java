package com.sqp.springcloud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sqp.springcloud.entities.Department;
import com.sqp.springcloud.service.DepartmentService;

@RestController
public class DepartmentController
{
	@Autowired
	private DepartmentService service;
	
	@RequestMapping(value="/dept/list", method=RequestMethod.GET)
	public List<Department> list()
	{
		return service.list();
	}
	
	@RequestMapping(value="/dept/get/{id}", method=RequestMethod.GET)
	public Department get(@PathVariable(value="id") Integer id)
	{
		return service.get(id);
	}
	
	@RequestMapping(value="/dept/add", method=RequestMethod.POST)
	public boolean add(@RequestBody Department dept)
	{
		return service.add(dept);
	}
}
