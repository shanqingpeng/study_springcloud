package com.sqp.springcloud.eureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sqp.springcloud.entities.Department;
import com.sqp.springcloud.eureka.service.DepartmentService;

@RestController
public class DepartmentController
{
	@Autowired
	private DepartmentService service;
	
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Department> list()
	{
		return service.list();
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable(value = "id") Integer id)
	{
		return service.get(id);
	}

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Department dept)
	{
		return service.add(dept);
	}
	
	@RequestMapping(value="/dept/discovery", method=RequestMethod.GET)
	public Object discovery()
	{
		List<String> services = client.getServices();
		System.out.println("***********" + services);
		
		List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-SERVICE-PROVIDER-8001");
		for (ServiceInstance instance : instances)
		{
			System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort()
			+ "\t" + instance.getUri());
		}
		return this.client;
	}
}
