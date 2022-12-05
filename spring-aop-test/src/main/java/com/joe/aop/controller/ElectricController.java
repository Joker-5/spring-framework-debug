package com.joe.aop.controller;

import com.joe.aop.service.ElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joker on 2022/12/5.
 */
@RestController
public class ElectricController {
	@Autowired
	private ElectricService electricService;

	@GetMapping("/charge")
	public void charge() {
		electricService.charge();
	}
}
