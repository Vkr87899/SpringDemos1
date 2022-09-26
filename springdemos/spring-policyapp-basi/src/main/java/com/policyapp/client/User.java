package com.policyapp.client;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.policyapp.exceptions.IdNotFoundException;
import com.policyapp.exceptions.PolicyNotFoundException;
import com.policyapp.service.IPolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext("com.policyapp");
	// Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
	 IPolicyService policyimplement=context.getBean(PolicyServiceImpl.class,"olicyServiceImpl");
	 policyimplement.getAll().forEach(System.out::println);
	 System.out.println();
	 System.err.println("by type---------");
	 policyimplement.getByType("term").forEach(System.out::println);
	 System.err.println("by category-----------");
	 policyimplement.getByCategory("life").forEach(System.out::println);
	 System.err.println("by ID-----------");
	System.out.println( policyimplement.getById(1001));
	 System.err.println("by sumassured---------");
	 policyimplement.getByHighSumAssured(20000).forEach(System.out::println);
	}
}
