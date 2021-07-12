package es.cic.bootcamp.ejercicio003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.bootcamp.ejercicio003.Persona;

class PersonaTest {
	Persona persona;

	@BeforeEach
	void setUp() throws Exception {
		persona = new Persona(4,"SM");
	}

	@Test
	void test() {
		int identificador = persona.getIdentificador();
		assertEquals(4, identificador);
		
		String nombre = persona.getNombre();
		assertEquals("SM", nombre);
		
	}

}
