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

	@Before("execution(* com.joe.aop.service.ElectricService.charge()) ")
	public void checkAuthority(JoinPoint pjp) throws Throwable {
		System.out.println("validating user authority");
		Thread.sleep(1000);
	}

	@Around("execution(* com.joe.aop.service.ElectricService.doCharge()) ")
	public void recordPerformance(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println("charge method time cost: " + (end - start));
	}

}
