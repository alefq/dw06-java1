package py.edu.uca.diplomado.clase06.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import py.edu.uca.diplomado.clase01.Vehiculo;
import py.edu.uca.diplomado.clase02.Alumno;
import py.edu.uca.diplomado.clase02.Persona;

public class PersonaApp {
	public static void main(String[] args) {
		Persona person1 = new Alumno();
		System.out.println("Nombre= " + person1.getNombre());
		Persona person2 = new Alumno("Ale", "FQ", 36);
		System.out.println("persona2 = " + person2.getNombre());

		ArrayList<Vehiculo> autosArray = new ArrayList<Vehiculo>();
		for (int i = 0; i < 70; i++)
			autosArray.add(new Vehiculo(i));
		// No hay ningun problema en añadir una persona a los autos
		// autos.addElement(new Persona("", "", 7));
		Iterator<Vehiculo> itAutos = autosArray.iterator();
		System.out.println("USando iterador");
		while (itAutos.hasNext()) {
			Vehiculo vehiculo = itAutos.next();
			System.out.println(vehiculo);
		}
		System.err.println("Usando for compacto");
		for (Vehiculo autoIteracion : autosArray) {
			System.out.println(autoIteracion);
		}
		System.out.println("USando for con el size");
		for (int i = 0; i < autosArray.size(); i++){
			Vehiculo autoFor = autosArray.get(i);
			autoFor.imprimirInfo();
		}
		// El Auto solamente es detectado en tiempo de ejecucion

		pruebaActores();
	}

	private static void pruebaActores() {
		int nroActores;
		Scanner in = new Scanner(System.in);

		/* Leemos un entero de la consola */
		nroActores = in.nextInt();
		ArrayList actors = new ArrayList();
		for (int i = 0; i < nroActores; ++i) {
			actors.add("Actor #" + i);
		}

		Comparator<Persona> comparadorPorEdad = new Comparator<Persona>() {
			public int compare(Persona persona1, Persona persona2) {
				int retorno = 0;
				if (persona1.getEdad() > persona2.getEdad())
					retorno = 1;
				else if (persona1.getEdad() < persona2.getEdad())
					retorno = -1;

				return retorno;
			}
		};
		Collections.sort(actors, comparadorPorEdad);

		
		Comparator<Persona> comparadorPorNroCedula = new Comparator<Persona>() {
			public int compare(Persona persona1, Persona persona2) {
				int retorno = 0;
				if (persona1.getNumeroCedula() > persona2.getNumeroCedula()) {
					retorno = 1;
				} else if (persona1.getNumeroCedula() > persona2.getNumeroCedula()) {
					retorno = -1;
				} else {
					retorno = 0;
				}
				return retorno;
			}
		};
		Collections.sort(actors, comparadorPorNroCedula);
		
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
		ArrayList<ArrayList<Alumno>> matrizActors = new ArrayList<ArrayList<Alumno>>();

		for (int i = 0; i < nroActores; ++i) {
			Integer edad = new Integer(0);
			Double random = Math.random() * 100;
			edad = random.intValue();
			actors.add(new Alumno("Actor #" + i, "", edad, edad));
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
