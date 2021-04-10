package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//本来服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
public class DeptProvider8002_App {
	public static void main(String[] args) {
		
//		String toUp = "microservice-dept8001".toUpperCase();
//		System.out.println(toUp);
		
		SpringApplication.run(DeptProvider8002_App.class, args);
	}
}
