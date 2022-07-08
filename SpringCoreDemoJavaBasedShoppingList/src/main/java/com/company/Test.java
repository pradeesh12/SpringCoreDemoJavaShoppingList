package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		ShoppingList list=context.getBean("shoppingList",ShoppingList.class);
		list.getProduct().forEach(product->{
			System.out.println(product.getName()+"\t"+product.getDescription()+"\t"+product.getPrice());
		});

	}

}
