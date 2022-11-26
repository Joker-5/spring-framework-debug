package com.joe.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/24.
 */
@Service
public class ElectricService {
	@Autowired
	private AdminUserService adminUserService;

	public void charge() throws Exception {
		System.out.println("Electric charging ...");
		this.pay();
	}

	public void pay() throws Exception {
		adminUserService.login();
		String payNum = adminUserService.adminUser.getPayNum();
		System.out.println("User pay num : " + payNum);
		System.out.println("Pay with alipay ...");
		Thread.sleep(1000);
	}

	public void payWithAliPay() throws Exception {
		adminUserService.login();
		String payNum = adminUserService.getAdminUser().getPayNum();
		System.out.println("User pay num : " + payNum);
		// pay...
	}
}
