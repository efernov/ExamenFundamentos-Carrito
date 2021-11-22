package com.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.acing.Carrito;
import com.acing.Producto;

public class App {
	
	private Carrito carrito;

	public static void main(String[] args) {
		Producto refresco = new Producto(1, "12 latas Refresco", "Coca Cola", 6.01);
		Producto leche = new Producto(2, "Leche Semidesnatada 1 litro", "Oral B", 0.72);
		
		Collection<Producto> productos = new ArrayList<>();
		productos.add(new Producto(refresco
		
		System.out.println(Carrito.getProducto());
}
	
	
}