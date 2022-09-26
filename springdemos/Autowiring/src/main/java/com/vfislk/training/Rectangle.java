package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component()
public class Rectangle implements IShape {

	@Override
	public void calcArea(int length, int breath) {
		System.out.println("area of rectangle  is "+(2*length*breath));
		
	}

}
