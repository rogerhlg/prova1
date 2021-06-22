package controllers;

import java.util.ArrayList;

import models.Circulo;
import models.Forma;
import models.Retangulo;
import models.Triangulo;

public class FormaController {
	private static Retangulo retangulo = new Retangulo();
	private static Triangulo triangulo = new Triangulo();
	private static Circulo circulo = new Circulo();

	private static ArrayList<Forma> formas = new ArrayList<Forma>();

	public static ArrayList<Forma> listar() {
		return formas;
	}
	
	public static void cadastrar(Forma forma) {
		formas.add(forma);
	}
		
	public static ArrayList<Forma> listarRetangulos() {
		ArrayList<Forma> formaUnica = new ArrayList<Forma>(); 
		for(Forma retanguloCadastrado : formas) {
			if(retanguloCadastrado.getClass().equals(retangulo.getClass())) {
				formaUnica.add(retanguloCadastrado);
			};
		}
		return formaUnica;
	}
		
	public static ArrayList<Forma> listarCirculos() {
		ArrayList<Forma> formaUnica = new ArrayList<Forma>(); 
		for(Forma circuloCadastrado : formas) {
			if(circuloCadastrado.getClass().equals(circulo.getClass())) {
				formaUnica.add(circuloCadastrado);
			};
		}
		return formaUnica;
	}
		
	public static ArrayList<Forma> listarTriangulos() {
		ArrayList<Forma> formaUnica = new ArrayList<Forma>(); 
		for(Forma trianguloCadastrado : formas) {
			if(trianguloCadastrado.getClass().equals(triangulo.getClass())) {
				formaUnica.add(trianguloCadastrado);
			};
		}
		return formaUnica;
	}
}


