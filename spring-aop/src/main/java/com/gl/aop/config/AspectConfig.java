package com.gl.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.gl.aop.repository.AuditRepository;
import com.gl.aop.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Configuration
public class AspectConfig {

	@Autowired
	AuditRepository auditRepository;
	
	@Autowired
	EmployeeService employeeService;
	
//	@Before("execution(public * com.gl.aop.serviceImpl.*.*(..))")
//	public void logBeforeAllMethods(JoinPoint joinPoint) {	// This is from org.aspectj.lang.JoinPoint
//		log.info(joinPoint.getSignature().getName() + " started (with Before annotation).");
//	}
//	
//
//	@After("execution(public * com.gl.aop.serviceImpl.*.*(..))")
//	public void logAfterAllMethods(JoinPoint joinPoint) {
//		log.info(joinPoint.getSignature().getName() + " ended (with After annotation).");
//	}

	@Around("execution(public * com.gl.aop.serviceImpl.*.*(..))")
	public void logBeforeAndAfterAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {	
		log.info(proceedingJoinPoint.getSignature().getName() + " started (with Around annotation).");
		proceedingJoinPoint.proceed();
		log.info(proceedingJoinPoint.getSignature().getName() + " ended (with Around annotation).");
	}
	
}
