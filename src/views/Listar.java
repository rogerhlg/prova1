package views;

import controllers.FormaController;
import models.Forma;

public class Listar {
	
	public static void retangulo(){
		System.out.println("\n-- LISTA DE RETANGULOS--  \n");
		for(Forma TrianguloCadastrado : FormaController.listarRetangulos()) {
			System.out.println(TrianguloCadastrado);
		}
	}
	
	public static void circulo(){
		System.out.println("\n-- LISTA DE CIRCULOS--  \n");
		for(Forma TrianguloCadastrado : FormaController.listarCirculos()) {
			System.out.println(TrianguloCadastrado);
		}
	}
	
	public static void triangulo(){
		System.out.println("\n-- LISTA DE TRIANGULOS--  \n");
		
		for(Forma TrianguloCadastrado : FormaController.listarTriangulos()) {
			System.out.println(TrianguloCadastrado);
		}
		
	}
	
	public static void todos(){
		System.out.println("\n-- LISTA DE TODAS AS FORMAS--  \n");
		for(Forma FormaCadastrada : FormaController.listar()) {
			System.out.println(FormaCadastrada);
		}
	}
	
	
}
