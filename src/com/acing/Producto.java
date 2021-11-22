package com.acing;

public class Producto {
	  int id;
	  String descripcion;
	  String marca;
	  Double precio;
	  
	  
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Producto() {
	
	}
	
	public Producto(String descripcion, String marca, Double precio) {
		super();
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
	}
	public Producto(int id, String descripcion, String marca, Double precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", marca=" + marca + ", precio=" + precio + "]";
	}
	  
	  

}
