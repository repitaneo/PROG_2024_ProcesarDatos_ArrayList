package main;

import java.util.ArrayList;

import files.FicheroReader;

public class Start {

	public static void main(String[] args) {


		ArrayList<Float> datos;
		datos = FicheroReader.procesarDatos("./data.txt");
		System.out.println(datos);

	}

}
