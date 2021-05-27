package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Factura_Test {
	Producto pro1;
	Producto pro2;
	Producto pro3;
	Producto pro4;

	@BeforeEach
	void setUp() throws Exception {
		pro1 = new Producto("Zanaoria", 1.25f, 7);
		pro2 = new Producto("Mandarina", 2.33f, 4);
		pro3 = new Producto("Limon", 3.10f, 2);
		pro4 = new Producto("Cereza", 0.45f, 20);
	}

	@Test
	void totalFacturaTest() {
		Factura compra = new Factura();
		compra.meterProducto(pro1);
		compra.meterProducto(pro2);
		compra.meterProducto(pro3);
		compra.meterProducto(pro4);
		float actual = compra.totalFactura();
		assertEquals(33.24f, actual, 0.05);
	}

	@Test
	void aplicarIVATest() {
		Factura compra = new Factura();
		compra.meterProducto(pro1);
		compra.meterProducto(pro2);
		compra.meterProducto(pro3);
		compra.meterProducto(pro4);
		float actual = compra.aplicarIva(21f);
		assertEquals(40.2204f, actual, 0.05);
	}
}
