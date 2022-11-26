package com.joe.aop.controller;

import com.joe.aop.service.ElectricService;
import com.joe.aop.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by joker on 2022/11/24.
 */
@RestController
public class HelloWorldController {
	@Autowired
	private ElectricService electricService;
	@Autowired
	private ServiceImpl serviceImpl;

	@GetMapping(path = "/charge")
	public void charge() throws Exception {
		electricService.payWithAliPay();
	}

	@GetMapping(path = "/charge1")
	public void charge1() {
	}

	@GetMapping(path = "/hi")
	public String hi() {
		return "helloworld, service is : " + serviceImpl;
	}
	
}
