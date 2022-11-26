package com.joe.aop.service;

import com.joe.aop.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/25.
 */
@Service
public class AdminUserService {
	public final User adminUser = new User("202101166");

	public void login() {
		System.out.println("admin user login...");
	}

	public User getAdminUser() {
		return adminUser;
	}
}
