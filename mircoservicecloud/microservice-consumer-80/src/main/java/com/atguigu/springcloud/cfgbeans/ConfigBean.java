package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced//boot -->Spring applicationContext.xml ---@Configuration 配置 config
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}

}
