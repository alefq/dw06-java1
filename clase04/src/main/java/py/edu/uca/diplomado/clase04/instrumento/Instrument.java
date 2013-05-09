package py.edu.uca.diplomado.clase04.instrumento;

import java.io.Serializable;

public abstract class Instrument implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9151073314876124560L;
	private String nombre;

	public abstract void play(Note n);

	public void afinar() {
		System.out.println("Instrument afinando) ");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
