package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Producto_Test {

	Producto pro1;
	@BeforeEach
	void setUp() throws Exception {
		 pro1 = new Producto("Zanaoria",1.25f, 7);
	}
	
	@Test
	void getNombreTest() {
		String actual = pro1.getNombre();
		assertEquals("Zanaoria", actual);
	}
	
	@Test
	void totalProductoTest() {
		float actual = pro1.precioTotal();
		assertEquals(8.75f, actual);
	}

	
}
