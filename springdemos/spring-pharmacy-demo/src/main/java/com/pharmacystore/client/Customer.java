package com.pharmacystore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pharmacystore.service.IPharmacyService;
import com.pharmacystore.service.PharmacyServiceImpl;

public class Customer {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.pharmacystore");
		IPharmacyService pharmacyservice=context.getBean(PharmacyServiceImpl.class,"pharmacyService");
		pharmacyservice.getall().forEach(System.out::println);
		System.out.println();
		System.out.println("medicines by category");
		pharmacyservice.getByCategory("Skincare").forEach(System.out::println);
		System.out.println();
		System.out.println("medicines by ID");
		System.out.println(pharmacyservice.getById(1001));
	}

}
