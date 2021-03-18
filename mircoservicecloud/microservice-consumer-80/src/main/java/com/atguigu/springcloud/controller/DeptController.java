package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.common.bean.Dept;


@RestController
public class DeptController {

	private static final String REST_URL_PREFIX = "http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list(){
		return restTemplate.getForObject( REST_URL_PREFIX +"/dept/list", List.class);
	}
}
