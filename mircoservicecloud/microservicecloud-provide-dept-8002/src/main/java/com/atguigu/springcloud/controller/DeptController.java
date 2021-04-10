package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.common.bean.Dept;
import com.atguigu.springcloud.service.IDeptService;

@RestController
public class DeptController {
	
	@Autowired
	private IDeptService deptService;
	
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}
	
	@RequestMapping(value="/dept/discovery",method=RequestMethod.GET)
	public Object discovery() {
		List<String> list = discoveryClient.getServices();
		System.out.println("*****************" + list);
		
		List<ServiceInstance> servList = discoveryClient.getInstances("microservicecloud-dept");
		for(ServiceInstance instance:servList) {
			System.out.println("*****************"+instance.getServiceId() + "\t" + instance.getUri() +"*****************");
		}
		return this.discoveryClient;
		
	}
}
		
		
		
