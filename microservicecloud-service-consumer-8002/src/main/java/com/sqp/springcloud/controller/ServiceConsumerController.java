package com.sqp.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sqp.springcloud.entities.Department;

@RestController
public class ServiceConsumerController
{
//	private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://microservicecloud-8001";

	@Autowired
	private RestTemplate template;

	@RequestMapping("/consumer/dept/discovery")
	public Object discovery()
	{
		return template.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
	}
	
	@RequestMapping("/consumer/dept/add")
	public boolean add(Department dept)
	{
		return template.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping("/consumer/dept/get/{id}")
	public Department get(@PathVariable(value = "id") Integer id)
	{
		return template.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Department.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/consumer/dept/list")
	public List<Department> list()
	{
		return template.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}
}
