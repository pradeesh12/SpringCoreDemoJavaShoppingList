package com.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean
	public Product product1()
	{
		Product product=new Product();
		product.setPid(1);
		product.setName("Laptop");
		product.setDescription("atoz");
		product.setPrice(150);
		return product;
	}
	@Bean
	public Product product2()
	{
		Product product=new Product();
		product.setPid(2);
		product.setName("Phone");
		product.setDescription("atoz");
		product.setPrice(100);
		return product;
	}
	@Bean
	public List<Product> products()
	{
		List<Product> pro=new ArrayList<Product>();
		pro.add(product1());
		pro.add(product2());
		return pro;
	}
	@Bean
	public ShoppingList shoppingList()
	{
		ShoppingList list=new ShoppingList();
		list.setProduct(products());
		return list;
	}
}
