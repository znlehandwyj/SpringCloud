package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.common.bean.Dept;
import com.atguigu.springcloud.service.IDeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {
	
	@Autowired
	private IDeptService deptService;
	
	@RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = null;// 正常情况下这里会返回一个数据
		if(id == 1L) {
			dept = new Dept(1L,"张三","db1");
		}else if( null == dept) { //这里故意返回 一个null。为了测试histrix
			throw new RuntimeException("该ID：" + id + "没有对应的信息！" );
		}
		return dept;
	}
	
	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		Dept dept = new Dept(id,
				"该id" + id  + "没有对应的信息，null---@HistrixCommand",
				"no this database in MySQL");
		return dept;
	}
	
}
		
		
		
