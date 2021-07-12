package es.cic.bootcamp.ejercicio003;

import java.util.Map;

public class NombresRandom {
	Map<Integer, String> mapa;
	private int tama�o;
	
	public NombresRandom(Persona... p) {
		for(Persona n: p) {
			int identificador = n.getIdentificador();
			String nombre = n.getNombre();
			mapa.put(identificador, nombre);
		}
		this.tama�o = mapa.size();
	}
	
	public Persona devuelveNombre() {
		int eleccion = (int) Math.floor(Math.random()*(tama�o+1));
		
		String nombre = mapa.get(eleccion);
		
		Persona persona = new Persona(eleccion, nombre);
		
		return persona;
		
	}
	
	public Persona[] devuelveVariasPersonas(int personasADevolver) {
		int eleccion = tama�o+1;
		Persona[] elecciones = new Persona[personasADevolver];
		for(int i = 0; i < personasADevolver; i++) {
			int eleccionPrevia = (int) Math.floor(Math.random()*(tama�o+1));
			while(eleccion == eleccionPrevia) {
				eleccionPrevia = (int) Math.floor(Math.random()*(tama�o+1));
			}
			eleccion = eleccionPrevia;
			String nombre = mapa.get(eleccion);
			Persona persona = new Persona(eleccion, nombre);
			
			elecciones[i] = persona;
		}
		
		return elecciones;
		
	}
}
