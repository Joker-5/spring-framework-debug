package com.joe.aop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joker on 2022/11/30.
 */

@RestController
@Slf4j
public class ValueTestController {
	@Value("${user}")
	private String user;
	@Value("${password}")
	private String password;

	@GetMapping(path = "/user")
	public String getUser() {
		return user + ":" + password;
	}
}
