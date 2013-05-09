package py.edu.uca.diplomado.clase04.instrumento;

import java.io.Serializable;

public class Wind extends Instrument implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1116933412984119793L;

	// Redefine interface method:
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}
