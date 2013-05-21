package py.edu.uca.diplomado.clase04.instrumento;

public class MusicaApp {

	public static void tune(Instrumento i) {
		i.play(Nota.MIDDLE_C);
	}

	public static void main(String[] args) {
		Viento flute = new Viento();
		tune(flute); // Upcasting
	}
}