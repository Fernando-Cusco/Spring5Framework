package com.sistemas.springboot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

	@Value("${factura.descripcion}")
	private String descripcion;

	@Autowired
	private Cliente cliente;
	
	@Autowired
	private List<ItemFactura> items;
	
	//Spring llama a los métodos anotados con @PostConstruct solo una vez, 
	//justo después de la inicialización de las propiedades del bean .
	@PostConstruct
	public void init() {
		cliente.setNombre(cliente.getNombre()+" concateno eso!!! gracias a @PostConstruct");
		descripcion = descripcion.concat(" del Cliente ").concat(cliente.getApellidos());
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Factura desctruida".concat(descripcion));
	}
	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
