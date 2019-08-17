package com.sistemas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sistemas.springboot.di.app.models.domain.ItemFactura;
import com.sistemas.springboot.di.app.models.domain.Producto;
import com.sistemas.springboot.di.app.models.service.IServicio;
import com.sistemas.springboot.di.app.models.service.MiServicio;
import com.sistemas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("MiServicioSimple")
	@Primary
	public IServicio registarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("MiServicioComplejo")
	public IServicio registarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto pro1 = new Producto("Coca Cola", 10);
		Producto pro2 = new Producto("Fanta", 9);
		Producto pro3 = new Producto("Fiora", 10);
		
		ItemFactura linea1 = new ItemFactura(pro1, 5);
		ItemFactura linea2 = new ItemFactura(pro2, 6);
		ItemFactura linea3 = new ItemFactura(pro3, 2);
		
		return Arrays.asList(linea1, linea2, linea3);
	}
	
}
