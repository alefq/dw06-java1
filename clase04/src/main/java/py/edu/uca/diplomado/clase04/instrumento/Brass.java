package py.edu.uca.diplomado.clase04.instrumento;

import java.io.Serializable;

public class Brass extends Instrument implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 561948996197922024L;

	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
}
