package com.joe.aop.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/25.
 */
@Component
public class LightService {
	public void start() {
		System.out.println("turn on all lights");
	}

	public void shutdown() {
		System.out.println("turn off all lights");
	}

	public void check() {
		System.out.println("check all lights");
	}
}
