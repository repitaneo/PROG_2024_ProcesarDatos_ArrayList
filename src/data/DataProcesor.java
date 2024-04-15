package data;

import java.util.ArrayList;

public class DataProcesor {

	
	public static float procesarLinea(String linea, int numeroLinea) {
		
		float lineaFloat = Float.parseFloat(linea);
		try {
			if(lineaFloat<0) {
				throw new Exception("Dato inválido ["+lineaFloat+"] en la linea "+numeroLinea);
			}
			return lineaFloat;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	

	
	
}
