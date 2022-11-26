package com.joe.aop.controller;

import com.joe.aop.service.ElectricService;
import com.joe.aop.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by joker on 2022/11/24.
 */

@RestController
public class HelloWorldController {

	@RequestMapping(path = "hi", method = RequestMethod.GET)
	public String hi() {
		return "helloworld, service is : " + getServiceImpl();
	}

	@Lookup
	public ServiceImpl getServiceImpl() {
		return null;
	}

}
