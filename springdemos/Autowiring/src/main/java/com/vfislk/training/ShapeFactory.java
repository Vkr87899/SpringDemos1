package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	//@Autowired
	//@Qualifier("tri") to choose one bean autowiring type
	@Autowired
	IShape rectangle;
	public void printArea(int length, int breath)
	{
		
			System.out.println("printin area");
			rectangle.calcArea(length, breath);
	
		
	}

}
