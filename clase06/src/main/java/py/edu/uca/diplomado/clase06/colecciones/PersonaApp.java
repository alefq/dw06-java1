package py.edu.uca.diplomado.clase06.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

import py.edu.uca.diplomado.clase01.Auto;
import py.edu.uca.diplomado.clase02.Alumno;
import py.edu.uca.diplomado.clase02.Persona;

public class PersonaApp {
	public static void main(String[] args) {
		Persona person1 = new Alumno();
		System.out.println("Nombre= " + person1.getNombre());
		Persona person2 = new Alumno("Ale", "FQ", 36);
		System.out.println("persona2 = " + person2.getNombre());

		Vector<Auto> autos = new Vector<Auto>();
		for (int i = 0; i < 7; i++)
			autos.addElement(new Auto(i));
		// No hay ningun problema en añadir una persona a los autos
		// autos.addElement(new Persona("", "", 7));
		Iterator<Auto> itAutos = autos.iterator();
		System.out.println("USando iterador");
		while (itAutos.hasNext()) {
			Auto auto = itAutos.next();
			System.out.println(auto);
		}
		System.err.println("Usando for compacto");
		for (Auto autoIteracion : autos) {
			System.out.println(autoIteracion);
		}
		System.out.println("USando for con el size");
		for (int i = 0; i < autos.size(); i++)
			((Auto) autos.elementAt(i)).imprimirInfo();
		// El Auto solamente es detectado en tiempo de ejecucion

		pruebaActores2();
	}

	private static void pruebaActores() {
		int nroActores;
		Scanner in = new Scanner(System.in);

		/* Leemos un entero de la consola */
		nroActores = in.nextInt();
		LinkedList actors = new LinkedList();
		for (int i = 0; i < nroActores; ++i) {
			actors.add("Actor #" + i);
		}

		Collections.sort(actors);
		System.out.println("\n\nA sorted list of actors");
		System.out.println(actors);

		Collections.reverse(actors);
		System.out.println("\n\nA Sorted list of actors in reverse order");
		System.out.println(actors);

		Collections.shuffle(actors);
		System.out.println("\n\nA shuffled list of actors");
		System.out.println(actors);

		Collections.sort(actors);
		System.out.println("\n\nAgain a sorted list of actors");
		System.out.println(actors);

		Collections.shuffle(actors);
		System.out.println("\n\nAgain another shuffling of the actors");
		System.out.println(actors);
	}

	private static void pruebaActores2() {
		int nroActores;
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese el numero de Actores: ");
		/* Leemos un entero de la consola */
		nroActores = in.nextInt();
		ArrayList<Alumno> actors = new ArrayList<Alumno>();
		for (int i = 0; i < nroActores; ++i) {
			Integer edad = new Integer(0);
			Double random = Math.random() * 100;
			edad = random.intValue();
			actors.add(new Alumno("Actor #" + i, "", edad));
		}

		/*
		 * Este es el ejemplo para definir un Comparator y utilizarlo al momento
		 * de llamar al método Collections.sort
		 */
		// Comparator<Persona> comparador = new Comparator<Persona>() {
		// @Override
		// public int compare(Persona persona1, Persona persona2) {
		// int retorno = 0;
		// if (persona1.getEdad() > persona2.getEdad())
		// retorno = 1;
		// else if (persona1.getEdad() < persona2.getEdad())
		// retorno = -1;
		//
		// return retorno;
		// }
		// };
		// Collections.sort(actors, comparador);
		/*
		 * Si no utilizamos un Comparator, entonces el ordenamiento se realiza
		 * en primer lugar, según el criterio de la Clase, si esta implementa
		 * Comparable, y sino, se utiliza el "orden natural" que sería el orden
		 * alfanumérico
		 */
		Collections.sort(actors);

		System.out.println("\n\nA sorted list of actors");
		System.out.println(actors);

		Collections.reverse(actors);
		System.out.println("\n\nA Sorted list of actors in reverse order");
		System.out.println(actors);

		Collections.shuffle(actors);
		System.out.println("\n\nA shuffled list of actors");
		System.out.println(actors);

		// Collections.sort(actors, comparador);
		Collections.sort(actors);
		System.out.println("\n\nAgain a sorted list of actors");
		System.out.println(actors);

		Collections.shuffle(actors);
		System.out.println("\n\nAgain another shuffling of the actors");
		System.out.println(actors);
	}

}
