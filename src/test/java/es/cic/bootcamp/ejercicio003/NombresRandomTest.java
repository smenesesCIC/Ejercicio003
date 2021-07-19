package es.cic.bootcamp.ejercicio003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NombresRandomTest {
	private NombresRandom nr;
	

	@BeforeEach
	void setUp() throws Exception {
		Persona p1 = new Persona(1,"P.G");
		Persona p2 = new Persona(2,"J.F");
		Persona p3 = new Persona(3,"J.B");
		Persona p4 = new Persona(4,"P.GO");
		Persona p5 = new Persona(5,"J.B");
		Persona p6 = new Persona(6,"A.D");
		Persona p7 = new Persona(7,"R.P");
		Persona p8 = new Persona(8,"A.F");
		Persona p9 = new Persona(9,"S.M");
		Persona p10 = new Persona(10,"P.GAL");
		Persona p11 = new Persona(11,"P.M");
		Persona p12 = new Persona(12,"A.D");
		Persona p13 = new Persona(13,"S.M");

		nr = new NombresRandom(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
		
	}

	@Test
	void testDevuelveNombre() {
		Persona persona = nr.devuelveNombre();
		String[] lista = nr.devuelveLista();
		
		for(String l: lista) {
			if(l.equals(persona.getNombre())) {
				assertTrue(true);
			}
		}
		
	}
	
	@Test
	void testDevuelveVariosNombres() {
		Persona[] personas = new Persona[3];
		
		personas = nr.devuelveVariasPersonas(3);
		String[] lista = nr.devuelveLista();
		
		for(String p: lista) {
			
			
		}
	}

}
