package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class NewShapeFactory {
	@Autowired
	@Qualifier("square")
	IShape shape;
	//by name
	@Autowired
	IShape rectangle ;
	//by constructor

	IShape triangle ;
	public NewShapeFactory(IShape triangle)
		
	{
		this.triangle=triangle;
	}
	public void printArea(int length, int breath,String choice)
	{
		
			if(choice.equals("s"))
			shape.calcArea(length, breath);
           if(choice.equals("r"))
			rectangle.calcArea(length, breath);
           if(choice.equals("t"))
			triangle.calcArea(length, breath);
	
		
	}
}
