package com.sqp.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer			// 标识一个 Eureka Server
public class EurekaServer7003_APP
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServer7003_APP.class, args);
	}
}
