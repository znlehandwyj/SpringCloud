package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.common.bean.Dept;

import feign.hystrix.FallbackFactory;

@Component //不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {

			@Override
			public List<Dept> list() {
				return null;
			}

			@Override
			public Dept get(Long id) {
				Dept dept = new Dept(id,
						"该id" + id  + "没有对应的信息,consumer客户端提供的降级信息此刻服务Provider服务已经关闭",
						"no this database in MySQL");
				return dept;
			}
		};
	}

}
