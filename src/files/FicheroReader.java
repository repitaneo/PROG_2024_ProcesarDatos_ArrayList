package files;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

import data.DataProcesor;

public class FicheroReader {

	public static ArrayList<Float> procesarDatos(String fichero) {

		ArrayList<Float> datos = new ArrayList<Float>();
		try {
			
			// enlaza con un fichero usando las clases de Java
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(fichero));
			
			// leo el codigo a ver si existe
			String linea = ficheroEntrada.readLine();
			int numeroLinea = 1;
			// mientras que las lineas existan
			while (linea != null) {

				// Procesamos la línea leída
				float resultado = DataProcesor.procesarLinea(linea,numeroLinea++);
				if(resultado >=0 ) {
					
					datos.add(resultado);
				}
				
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
		
		return datos;
	}	
	
}
