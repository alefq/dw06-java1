package py.edu.uca.diplomado.clase03;

import py.edu.uca.diplomado.clase02.Alumno;
import py.edu.uca.diplomado.clase02.Auto;
import py.edu.uca.diplomado.clase02.Profesor;

public class Materia {
	/*
	 * Definimos una clase nueva, la convención determina que la primera letra
	 * debe ser mayúscula y el resto ya es a elección, mezcla de letras y
	 * números. Debe definirse dentro del archivo, por lo menos la clase con el
	 * mismo nombre del archivo que la contiene.
	 */

	/**
	 * @param args
	 */
	/*
	 * Para la clase01 declaramos con el modificador static para poder
	 * utilizarlo dentro del método main. Al declarar una propiedad o un método
	 * con el modificador "static" estamos haciendo que petenezca a toda la
	 * Clase, es decir el valor es compartido por todas las instancias
	 */
	static Auto transporte;

	private Alumno alumno;
	private Profesor profesor;
	/*
	 * La propiedad codigo, es una propiedad de instancia, es decir cada nuevo
	 * objeto tiene su propio valor para esta propiedad
	 */
	private String codigo;

	public Materia() {
		inicializarMateria();
	}

	public Materia(String codigo) {
		this();
		setCodigo(codigo);
	}

	/*
	 * El método main con esta firma convierte a esta clase Java en una
	 * aplicación Java, es decir puede ejecutarse directamente
	 */
	public static void main(String[] args) {
		Materia java1 = new Materia();
		/*
		 * La clase System es parte del JRE y contiene un campo de tipo
		 * PrintStream para imprimir en la consola. Al utilizar directamente un
		 * string entre comillas, por detrás se instancia un objeto de tipo
		 * String
		 */
		System.out.println(new String("Hello World!"));
		java1.inicializarMateria();

		System.out.println("Alumno: " + java1.getAlumno().getNombre());
		System.out.println("Profesor: " + java1.getProfesor().getNombre());
	}

	
	public void inicializarMateria() {
		/* Creamos una nueva instancia de la clase Auto */
		transporte = new Auto();
		/* Enviamos el mensaje de arrancar a la clase recientemente creada */
		transporte.arrancar();

		setAlumno(new Alumno());
		setProfesor(new Profesor());

		getAlumno().setNombre("Ale");
		getAlumno().setApellido("Feltes");
		getProfesor().setNombre("Luca");
		getProfesor().setApellido("Cernuzzi");
		getAlumno().setNumeroMatricula(37122);
		System.out.println("Alumno: " + getAlumno());
		System.out.println("Profesor: " + getProfesor());

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public static void describirMateria() {

	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
