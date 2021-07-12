package es.cic.bootcamp.ejercicio003;

public class Persona {
	private int identificador;
	private String nombre;
	
	public Persona(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	
	public String getNombre() {
		return nombre;
	}
}
