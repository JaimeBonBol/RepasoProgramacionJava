package com.productos.ApiRestProductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.productos.ApiRestProductos.controller"})
public class ApiRestProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestProductosApplication.class, args);
	}

}
