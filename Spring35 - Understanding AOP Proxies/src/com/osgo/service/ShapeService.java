package com.osgo.service;

import com.osgo.aspect.Loggable;
import com.osgo.model.Circle;
import com.osgo.model.Triangle;

public class ShapeService
{
	private Circle circle;
	private Triangle triangle;
	
	
	@Loggable
	public Circle getCircle()
	{
		System.out.println("Circle getter called.");
		return circle;
	} // end method getCircle
	
	
	public void setCircle(Circle circle)
	{
		this.circle = circle;
	} // end method setCircle
	
	
	public Triangle getTriangle()
	{
		return triangle;
	} // end method getTriangle
	
	
	public void setTriangle(Triangle triangle)
	{
		this.triangle = triangle;
	} // end method setTriangle
	
	
} // end Class ShapeService
