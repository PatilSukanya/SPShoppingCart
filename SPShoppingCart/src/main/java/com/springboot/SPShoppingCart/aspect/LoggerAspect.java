package com.springboot.SPShoppingCart.aspect;

import java.util.logging.FileHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
 
@Aspect
@Component
public class LoggerAspect {

  private static final Logger LOGGER = LogManager.getLogger(LoggerAspect.class);
 
  FileHandler fh;
  //AOP expression for which methods shall be intercepted
  @Around("execution(* com.springboot.SPShoppingCart.controller..*(..)))")
  public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable 
  {
    MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
     
    //Get intercepted method details
    String className = methodSignature.getDeclaringType().getSimpleName();
    String methodName = methodSignature.getName();
     
    final StopWatch stopWatch = new StopWatch();
     
    //Measure method execution time
    stopWatch.start();
    Object result = proceedingJoinPoint.proceed();
    stopWatch.stop();
 
    //Log method execution time
    LOGGER.info("Execution time of " + className + "." + methodName + " :: " + stopWatch.getTotalTimeMillis() + " ms");
 
    return result;
  }
  
  @AfterThrowing(pointcut = "execution(* com.springboot.SPShoppingCart.controller..*(..)))", throwing = "e")
  public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
      LOGGER.error("Exception in {}.{}() with cause = {}", joinPoint.getSignature().getDeclaringTypeName(),
          joinPoint.getSignature().getName(), e.getCause() != null ? e.getCause() : "NULL");
  }
}