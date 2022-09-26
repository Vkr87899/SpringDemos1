package com.vfislk.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext contex=new AnnotationConfigApplicationContext("com.vfislk.javabased");
		Performer perform=contex.getBean(Performer.class);
		perform.performSong("k", "'Sathiya'");
		perform.performSong("g", "'dusk till dawn'");
		perform.performSong("v", "'tu muskura'");
	}
}
