package com.sqp.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient		// 开启服务发现注解功能
public class ServiceProvider8001_APP
{
	public static void main(String[] args)
	{
		SpringApplication.run(ServiceProvider8001_APP.class, args);
	}
}