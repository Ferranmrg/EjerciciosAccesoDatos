package eje01;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *  @descrition Soluci�n Ejercicio 1
 *	@author Carlos
 *  @date 21/10/2015
 *  @version 1.0
 *  @license GPLv3
 */
public class Parte03 {
	
	final static String FICHERO = "entrada.txt";
	final static String RUTA = "./entrada.txt";

	/*
	 * Para ejecutar Bot�n derecho --> Run as --> Run Configurations --> En
	 * argumentos escribir entrada.txt. Es necesario para probar toAbsolutePath
	 */
	public static void main(String[] args) {

		// Primer m�todo toUri
		Path p1 = Paths.get(FICHERO);

		System.out.println("URI " + p1.toUri());	

		// -------------------------------------------------------------------------------

		// Segundo m�todo toAbsolutePath

		if (args.length < 1) {
			System.out
					.println("debes pasar un nombre de archivo como argumento");
			System.exit(-1);
		}

		Path inputPath = Paths.get(args[0]);
		Path fullPath = inputPath.toAbsolutePath();

		System.out.println("Path absoluto " + fullPath);

		// -------------------------------------------------------------------------------

		// Tercer m�todo toRealPath

		Path p2 = Paths.get(RUTA);
		try {

			Path fp = p2.toRealPath();

			System.out.println("Path real " + fp);
		} catch (NoSuchFileException x) {

			System.err.println(p2+": no existe" + " el fichero o directorio %n"	);

		} catch (IOException x) {

			System.err.println(x);

		}

	}

}
