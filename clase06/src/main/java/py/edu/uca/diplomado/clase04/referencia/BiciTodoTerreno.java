package py.edu.uca.diplomado.clase04.referencia;

public class BiciTodoTerreno extends Bicicleta {
	/*
	 * Se puede sobre escribir cualquier método que tenga modificadores de
	 * "protected" o "public"
	 */
	@Override
	public void acelerar() {
		super.acelerar();
		setVelocidad(0);
	}
}
