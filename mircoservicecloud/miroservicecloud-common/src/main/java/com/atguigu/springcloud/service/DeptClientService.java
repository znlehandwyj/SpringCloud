package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.springcloud.common.bean.Dept;

@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {
	
	@RequestMapping(value ="/dept/list",method = RequestMethod.GET)
	public List<Dept> list();
	
}
