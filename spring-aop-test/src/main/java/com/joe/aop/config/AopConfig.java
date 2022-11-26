package com.joe.aop.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/24.
 */
@Aspect
@Service
@Slf4j
public class AopConfig {
	@Around("execution(* com.joe.aop.service.ElectricService.pay()) ")
	public void recordPayPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		joinPoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println("Pay method time cost（ms）: " + (end - start));
	}

	@Before("execution(* com.joe.aop.service.AdminUserService.login(..)) ")
	public void logAdminLogin(JoinPoint pjp) throws Throwable {
		System.out.println("! admin login ...");
	}
	
}
