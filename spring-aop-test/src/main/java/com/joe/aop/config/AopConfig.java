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


	@Before("execution(* com.joe.aop.service.ElectricService.charge())")
	public void zlogBeforeMethod(JoinPoint pjp) throws Throwable {
		System.out.println("step into ->" + pjp.getSignature());
	}

	@Before("execution(* com.joe.aop.service.ElectricService.charge()) ")
	public void validateAuthority(JoinPoint pjp) throws Throwable {
		throw new RuntimeException("authority check failed");
	}

}
