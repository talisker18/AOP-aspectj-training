package com.henz.AOPspringtraining.aop.aspectj;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ExecutionTracerAspect {
	
	//define at which pointcut this aspect will be executed
	@Pointcut("execution(* com.henz.AOPspringtraining.aop.*.*(..))")
	private void allMethods() {}
	
	@Around("allMethods()")
	public Object trade(ProceedingJoinPoint jointPoint) throws Throwable {
		Object [] args = jointPoint.getArgs();
		String signature = jointPoint.getSignature().toString();
		Object retVal = jointPoint.proceed(args);
		System.out.println("printing from aspect 'ExecutionTracerAspect': method "+signature+" was called with next arguments "+Arrays.toString(args));
		
		return retVal;
	}

}
