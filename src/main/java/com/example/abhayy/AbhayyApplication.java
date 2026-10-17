package com.example.abhayy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AbhayyApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		OrderService order = context.getBean(OrderService.class);
		order.placeOrder();

	}
}
