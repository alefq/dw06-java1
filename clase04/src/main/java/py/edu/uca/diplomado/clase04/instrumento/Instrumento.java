package py.edu.uca.diplomado.clase04.instrumento;

public abstract class Instrumento {
	private String nombre;

	public abstract void play(Nota n);

	public void afinar() {
		System.out.println("Instrumento afinando) ");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
