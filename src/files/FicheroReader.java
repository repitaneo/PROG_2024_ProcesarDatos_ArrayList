package files;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

import data.DataProcesor;

public class FicheroReader {

	public static ArrayList<Float> procesarDatos(String fichero) {

		DataProcesor dp = new DataProcesor();
		try {
			
			// enlaza con un fichero usando las clases de Java
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(fichero));
			
			// leo el codigo a ver si existe
			String linea = ficheroEntrada.readLine();
			int numeroLinea = 1;
			// mientras que las lineas existan
			while (linea != null) {

				// Procesamos la línea leída
				dp.procesarLinea(linea,numeroLinea++);

				// leemos otra línea
				linea = ficheroEntrada.readLine();
			}
			ficheroEntrada.close();
		} catch (IOException e) {

			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otros fallos
			e.printStackTrace();
		}
		
		return dp.getDatos();
	}	
	
}
