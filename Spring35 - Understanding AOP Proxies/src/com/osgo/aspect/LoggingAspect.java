package com.osgo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect
{
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object returnValue = null;
		try
		{
			System.out.println("Before Advice.");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning.");
		}
		catch (Throwable exception)
		{
			System.out.println("After Throwing.");
		}
		
		System.out.println("After Finally.");
		return returnValue;
		
	} // end method myAroundAdvice
	
	
	public void loggingAdvice()
	{
		System.out.println("Logging from the advice.");
	} // end method loggingAdvice
	
	
} // end Class LoggingAspect
