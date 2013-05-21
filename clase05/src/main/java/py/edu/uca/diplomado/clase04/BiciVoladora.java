package py.edu.uca.diplomado.clase04;

import py.edu.uca.diplomado.clase04.interfaces.Volador;

/*BiciVoladora puede implementar también el método volar*/
public class BiciVoladora extends Bicicleta implements Volador {

	public void volar() {
		System.out.println("Bici volando");
	}

}
