package com.joe.aop.config;

import com.joe.aop.service.LightService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by joker on 2022/11/30.
 */
@Configuration
public class LightConfig {
//	@Bean(destroyMethod = "")
	@Bean
	public LightService getTransmission() {
		return new LightService();
	}
}
