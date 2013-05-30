package py.edu.uca.diplomado.clase07.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import py.edu.uca.diplomado.clase02.Persona;

public class Serializacion {
	public static void main(String args[]) {
		String nombreArchivo = "/tmp/serial.txt";
		/*
		 * Serializamos el objeto, escribiendo a un archivo en el directorio
		 * temporal del usuario
		 */
		System.out.println("El directorio temporal es: "
				+ System.getProperties().get("java.io.tmpdir"));
		/*
		 * Con esto modificamos la ubicación del directorio temporal. También
		 * puede hacerse con un parámetro para la máquina virtual (VM)
		 * -Djava.io.tmpdir=/tmp/juca
		 */
		System.getProperties().put("java.io.tmpdir", "/home/juca");
		System.out.println("El directorio temporal es: "
				+ System.getProperties().get("java.io.tmpdir"));
		try {
			/* Creamos una instancia de una clase serializable */
			Persona persona1 = new Persona("Cobie", "Smulders", 15);
			System.out.println("Persona: " + persona1);
			/* Creamos un OutputStream para escribir a un archivo */
			FileOutputStream fileOutstream = new FileOutputStream(nombreArchivo);
			/* OutputStream específico para escribir objetos */
			ObjectOutputStream objectOutStream = new ObjectOutputStream(fileOutstream);
			objectOutStream.writeObject(persona1);
			objectOutStream.flush();
			objectOutStream.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		/* Deserialización del objeto */
		try {
			Persona personaLeidaDeArchivo;

			/* Inicializamos un InputStream para leer de un archivo */
			FileInputStream fileInStream = new FileInputStream(nombreArchivo);
			/* Inicializamos un inputStream específico para leer objetos */
			ObjectInputStream objectInstream = new ObjectInputStream(fileInStream);
			/* Leemos el objeto del inputStream */
			personaLeidaDeArchivo = (Persona) objectInstream.readObject();
			objectInstream.close();
			System.out.println("Persona de Archivo: " + personaLeidaDeArchivo);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(2);
		}
	}

}
