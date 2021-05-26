package org.cuatrovientos.ed;

import java.util.ArrayList;

public class Factura {
	ArrayList<Producto> Productos = new ArrayList<Producto>(); 
	
	public void meterProducto(Producto p) {
		Productos.add(p);
	}
	public float totalFactura() {
		float total = 0; 
		for (Producto pro: Productos) {
			total += pro.precioTotal();
		}
		return total; 
	}
	
	public float aplicarIva(float iva) {
		return totalFactura() * (1 + (iva / 100)); 
	}
}
