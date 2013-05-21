package py.edu.uca.diplomado.clase04.instrumento;

public class Viento extends Instrumento {
	// Redefine interface method:
	public void play(Nota n) {
		System.out.println("Viento.play() " + n);
	}
}
