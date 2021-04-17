package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.common.bean.Dept;
import com.atguigu.springcloud.service.DeptClientService;



@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService deptClientService;
	
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.deptClientService.list();
	}
	
	@RequestMapping(value ="/consumer/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable Long id) {
		return this.deptClientService.get(id);
	}
} 
