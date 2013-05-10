package py.edu.uca.poo.identidad;

public class Pasaporte extends DocumentoIdentidad {

	/*
	 * Esta es la implementación del método abstracto de DocumentoIdentidad, la
	 * clase ancestra de Cedula
	 */
	@Override
	public String getTipo() {
		return "PASAPORTE";
	}

}
