package py.edu.uca.diplomado.clase04;

import py.edu.uca.diplomado.clase02.Persona;
import py.edu.uca.diplomado.clase04.interfaces.Mentiroso;
import py.edu.uca.diplomado.clase04.interfaces.Peleador;
import py.edu.uca.diplomado.clase04.interfaces.Volador;

public class AntiHeroe extends Persona implements Volador, Peleador, Mentiroso {

	/**
	 * 
	 */
	private static final long serialVersionUID = -381469417892240772L;

	public void mentir() {
		System.out.println("Mintiendo AntiHeroe");
	}

	public void pelear() {
		System.out.println("Peleando AntiHeroe");

	}

	public void volar() {
		System.out.println("Volando AntiHeroe");

	}

}
