package py.edu.uca.diplomado.clase04.referencia;

public class Yorkshire extends Perro {

	@Override
	public void ladrar() {
		setFrecuenciaLadrido(Perro.FRECUENCIA_ALTA);
		super.ladrar();
	}
}
