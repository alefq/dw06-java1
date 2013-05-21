package py.edu.uca.diplomado.clase05.instrumento;

public abstract class Instrument {
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
