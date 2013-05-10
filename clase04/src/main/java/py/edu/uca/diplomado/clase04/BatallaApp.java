package py.edu.uca.diplomado.clase04;

import py.edu.uca.diplomado.clase02.Alumno;
import py.edu.uca.diplomado.clase04.interfaces.Mentiroso;
import py.edu.uca.diplomado.clase04.interfaces.Peleador;
import py.edu.uca.diplomado.clase04.interfaces.Volador;

public class BatallaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BatallaApp batalla = new BatallaApp();
		Superman superman = new Superman();
		Alumno alumno = new Alumno();
		AntiHeroe antiHeroe = new AntiHeroe();
//
		batalla.hacerVolar(superman, antiHeroe);
		
		batalla.hacerVolar(superman, alumno);

//
		batalla.hacerPelear(superman, antiHeroe);
//
//		batalla.hacerMentir(superman, antiHeroe);
	}

	public void hacerVolar(Volador v1, Volador v2) {
		v1.volar();
		v2.volar();
	}

	public void hacerPelear(Peleador p1, Peleador p2) {
		p1.pelear();
		p2.pelear();
	}

	public void hacerMentir(Mentiroso m1, Mentiroso m2) {
		m1.mentir();
		m2.mentir();

	}
}
