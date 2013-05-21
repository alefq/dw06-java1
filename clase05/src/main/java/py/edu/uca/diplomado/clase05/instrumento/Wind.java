package py.edu.uca.diplomado.clase05.instrumento;

public class Wind extends Instrument {
	// Redefine interface method:
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}
