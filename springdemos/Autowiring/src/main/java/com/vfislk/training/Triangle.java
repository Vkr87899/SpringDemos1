package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape{

	@Override
	public void calcArea(int length, int breath) {
		System.out.println("area of triangle is :"+(0.5*length*breath));
		
	}

}
