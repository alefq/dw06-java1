package py.edu.uca.diplomado.clase05.instrumento;

public class MusicaApp {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); // Upcasting
	}
}