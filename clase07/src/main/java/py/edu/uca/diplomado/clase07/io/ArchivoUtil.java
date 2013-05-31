package py.edu.uca.diplomado.clase07.io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Utilidad (clase estática) para agrupar todas las funcionalidades que traten
 * con manejo de archivos
 * 
 * @author juca
 * 
 */
public class ArchivoUtil {

	/**
	 * Lee un archivo de texto, de la ruta especificada
	 * 
	 * @param ruta
	 * @return
	 */
	public static String leerArchivoTexto(String ruta) {
		String stringLeido = new String(leerArchivoBinario(ruta));
		return stringLeido;
	}

	/**
	 * Lee un archivo binario de la ruta especificada y retorna en formato de
	 * byte
	 * 
	 * @param ruta
	 * @return
	 */
	public static byte[] leerArchivoBinario(String ruta) {
		byte[] retorno = null;
		File archivo = null;
		FileInputStream fileInput = null;

		try {
			/*
			 * Apertura del fichero y creacion de BufferedReader para poder
			 * hacer una lectura comoda (disponer del metodo readLine()).
			 */
			archivo = new File(ruta);
			fileInput = new FileInputStream(archivo);
			long tamanho = archivo.length();
			/*
			 * reservamos dinámicamente la memoria para el array, según el
			 * tamanho que tenga el archivo
			 */
			retorno = new byte[(int) tamanho];
			fileInput.read(retorno);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/*
			 * En el finally cerramos el fichero, para asegurarnos que se cierra
			 * tanto si todo va bien como si salta una excepcion.
			 */
			try {
				if (null != fileInput) {
					/*
					 * La operacion de close, puede nuevamente generar una
					 * excepcion
					 */
					fileInput.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		return retorno;
	}

	public static void escribirArchivo(String ruta, String datos)
			throws IOException {
		BufferedWriter bwriter = new BufferedWriter(new FileWriter(ruta));
		bwriter.write(datos);
		bwriter.close();

	}

	public static void escribirArchivoBinario(String ruta, byte[] datos)
			throws IOException {
		BufferedOutputStream bout = new BufferedOutputStream(
				new FileOutputStream(ruta));
		bout.write(datos);
		bout.close();

	}

	public static void copiarArchivo(File source, File dest) throws IOException {
		if (!dest.exists()) {
			/* Si el archivo no existe, creamos uno nuevo */
			dest.createNewFile();
		}
		/*Definimos el stream para lectura*/
		InputStream in = null;
		/*Definimos el outputStrem*/
		OutputStream out = null;
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int len;

			len = in.read(buf);
			while (len > 0) {
				out.write(buf, 0, len);
				len = in.read(buf);
			}
		} finally {
			in.close();
			out.close();
		}

	}

}
