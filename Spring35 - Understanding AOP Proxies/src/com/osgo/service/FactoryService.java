package com.osgo.service;

import com.osgo.model.Circle;
import com.osgo.model.Triangle;

public class FactoryService
{
	public Object getBean(String beanType)
	{
		if(beanType.equals("shapeService")) return new ShapeServiceProxy();
		if(beanType.equals("circle")) return new Circle();
		if(beanType.equals("Triangle")) return new Triangle();
		return null;
		
	} // end method getBean
	
} // end Class FactoryService
