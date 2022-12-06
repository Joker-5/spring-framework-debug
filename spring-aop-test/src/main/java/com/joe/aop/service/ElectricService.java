package com.joe.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/24.
 */
@Service
public class ElectricService {


	public void charge() {
		System.out.println("Electric charging ...");
	}
}
