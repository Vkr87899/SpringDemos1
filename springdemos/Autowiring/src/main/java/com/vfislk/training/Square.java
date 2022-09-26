package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape{

	@Override
	public void calcArea(int length, int breath) {
		System.out.println("area of square is :"+(length*length));
		
	}

}
