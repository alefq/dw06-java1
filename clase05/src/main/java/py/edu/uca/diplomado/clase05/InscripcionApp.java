package py.edu.uca.diplomado.clase05;

import py.edu.uca.diplomado.clase01.Materia;
import py.edu.uca.diplomado.clase02.Alumno;
import py.edu.uca.diplomado.clase02.Profesor;

public class InscripcionApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Instanciamos una Materia */
		Materia poojava = new Materia();

		/* Instanciamos el profesor que dictará la materia */
		Profesor profesor = new Profesor();
		profesor.setNombre("Ale");
		profesor.setApellido("Feltes");

		/*
		 * Creamos dos alumnas que vamos a agregar a la lista de alumnos de la
		 * materia. Aquí hacemos uso de los constructores que ya reciben los
		 * datos principales de Alumno
		 */
		Alumno alumno = new Alumno("Rachel", "Green", 42);
		Alumno alumno2 = new Alumno("Monica", "Geller", 17);

		/* Asignamos el profesor */
		poojava.setProfesor(profesor);
		/* Asignamos el nombre de la materia */
		poojava.setDescripcion("Java1");

		/*
		 * Agregamos los alumnos a la lista por medio del metodo "add" de la
		 * clase ArrayList
		 */
		poojava.getAlumnos().add(alumno);
		poojava.getAlumnos().add(alumno2);

		/* Encapsulamos la forma de inscribir alumnos */
		// try {
		// try {
		// poojava.inscribirAlumno(alumno2);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// } catch (EdadInsuficienteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		/*
		 * Invocamos el método toString de la materia, para imprimir en consola
		 * la representación en forma de una cadena de caracteres de la Materia
		 */
		System.out.println(poojava.toString());

	}

}
