package com.sistemas.springboot.di.app.models.service;


import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")

public class MiServicioComplejo implements IServicio{

	public MiServicioComplejo() {}
	
	@Override
	public String operacion() {
		return "Hola Amigo, soy un metodo de una INTERFACE, pero soy un servicio complejo";
	}	
}
