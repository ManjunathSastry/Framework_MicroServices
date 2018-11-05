package com.amadeus.sentinel.logging;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/**
 * Logical Aspect of Logging Entry Point at every service call
 * @author sinhas
 *
 */
@Aspect
@Component
public class LogAspect {
	Logger logger = LogManager.getLogger(this.getClass());
	
	/**
	 * Logs the function being called in the service layers
	 * @param joinPoint
	 */
	@Before("execution(* com.amadeus.spring_boot_demo.services.*.*(..))")
	public void logEntry(JoinPoint joinPoint) {
		logger.info("Started Method Call: " + joinPoint.getSignature().toShortString());
	}
}
