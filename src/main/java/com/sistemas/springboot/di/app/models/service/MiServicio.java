package com.sistemas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IServicio{

	public MiServicio() {}
	
	@Override
	public String operacion() {
		return "Hola Amigo, soy un metodo de una INTERFACE, pero soy un servicio simple";
	}	
}
