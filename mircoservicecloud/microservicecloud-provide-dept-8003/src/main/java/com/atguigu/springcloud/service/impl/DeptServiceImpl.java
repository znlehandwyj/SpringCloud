package com.atguigu.springcloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.atguigu.springcloud.common.bean.Dept;
import com.atguigu.springcloud.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {

	@Override
	public List<Dept> list() {
		
		Dept dept1 = new Dept(1L,"kaifa","db3");
		Dept dept2 = new Dept(2L,"ceshi","db3");
		Dept dept3 = new Dept(3L,"yunwei","db3");
		Dept dept4 = new Dept(4L,"kaifa","db3");
		
		List<Dept> list = new ArrayList<Dept>();
		list.add(dept1);
		list.add(dept2);
		list.add(dept3);
		list.add(dept4);
		
		return list;
	}

}
