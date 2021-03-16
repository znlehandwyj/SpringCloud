package com.atguigu.springcloud.controller;

import java.lang.ref.ReferenceQueue;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.springcloud.common.bean.Dept;
import com.atguigu.springcloud.service.IDeptService;

@ResponseBody
@Controller
public class DeptController {
	
	@Autowired
	private IDeptService deptService;

	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}
}
