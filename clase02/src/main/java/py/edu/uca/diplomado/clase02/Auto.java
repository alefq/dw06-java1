package py.edu.uca.diplomado.clase02;

public class Auto {
	/* Definimos las propiedades para nuestra clase */
	int anho;
	String marca;
	String modelo;
	int velocidad;

	/*
	 * Definimos un método. Los métodos se recomienda que expresen una acción,
	 * con el infinitivo o por ejemplo getAlgo setAlgo
	 */
	/**
	 * Se arranca el motor del auto y se coloca la velocidad a 0
	 * */
	void arrancar() {
		System.out.println("Arrancando");
	}

	void acelerar() {
		velocidad++;
	}
}
