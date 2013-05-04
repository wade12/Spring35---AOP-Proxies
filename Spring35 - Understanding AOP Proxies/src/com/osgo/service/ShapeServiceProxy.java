package com.osgo.service;

import com.osgo.aspect.LoggingAspect;
import com.osgo.model.Circle;

public class ShapeServiceProxy extends ShapeService
{
	public Circle getCircle()
	{
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
		
	} // end method getCircle
	
} // end Class ShapeServiceProxy
