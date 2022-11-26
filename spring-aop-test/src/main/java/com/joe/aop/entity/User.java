package com.joe.aop.entity;

/**
 * Created by joker on 2022/11/25.
 */

public class User {
	private String payNum;

	public User(String payNum) {
		this.payNum = payNum;
	}

	public String getPayNum() {
		return payNum;
	}

	public void setPayNum(String payNum) {
		this.payNum = payNum;
	}
}