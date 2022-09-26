package com.vfislk.training;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("com.vfislk.training");
		NewShapeFactory factory= context.getBean(NewShapeFactory.class,"newShapeFactory");
		factory.printArea(10, 20,"t");
		factory.printArea(10, 20,"r");
		
		
		
	}
}
