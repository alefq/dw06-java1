package py.edu.uca.diplomado.clase04.instrumento;

public class Nota {

	private Double frecuencia;
	public static final Nota MIDDLE_C = new Nota();

	public void setFrecuencia(Double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public Double getFrecuencia() {
		if (frecuencia == null)
			frecuencia = 0d;
		return frecuencia;
	}

	@Override
	public String toString() {
		return "Nota con frecuencia: " + getFrecuencia();
	}
}
