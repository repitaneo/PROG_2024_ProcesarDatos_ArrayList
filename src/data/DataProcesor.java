package data;

import java.util.ArrayList;

public class DataProcesor {

	private ArrayList<Float> datos;
	
	
	public DataProcesor() {
		
		datos = new ArrayList<Float>();
	}
	
	
	
	public void procesarLinea(String linea, int numeroLinea) {
		
		float lineaFloat = Float.parseFloat(linea);
		try {
			if(lineaFloat<0) {
				throw new Exception("Dato inválido ["+lineaFloat+"] en la linea "+numeroLinea);
			}
			datos.add(lineaFloat);
			
		}catch(Exception e) {e.printStackTrace();};
	}
	
	
	
	
	public ArrayList<Float> getDatos() {
		
		return datos;
	}
	
	
}
