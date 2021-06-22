package controllers;

import java.util.ArrayList;
import models.Forma;

public class FormaController {
	
	private static ArrayList<Forma> formas = new ArrayList<Forma>(); 
	
	public static ArrayList<Forma> listar() {
		return formas;
	}
	
	public static void cadastrar(Forma forma) {
		formas.add(forma);
	}
		
	public static ArrayList<Forma> listarRetangulos() {
		return formas;
	}
		
	public static ArrayList<Forma> listarCirculos() {
		return formas;
	}
		
	public static ArrayList<Forma> listarTriangulos() {
		return formas;
	}
}


