package views;

import java.util.Scanner;

import models.Retangulo;
import utils.Console;
import models.Circulo;
import models.Triangulo;
import controllers.FormaController;

public class Cadastrar {
	private static Scanner sc = new Scanner(System.in);
	private static Retangulo retangulo;
	private static Circulo circulo;
	private static Triangulo triangulo;

	
	public static void retangulo() {
		retangulo = new Retangulo();
		retangulo.setAltura(Console.lerInt("Insira o valor inteiro da ALTURA: ")); 
		retangulo.setLargura(Console.lerInt("Insira o valor inteiro da LARGURA: "));
		FormaController.cadastrar(retangulo);
	}
	
	public static void triangulo() {
		triangulo = new Triangulo();
		triangulo.setAltura(Console.lerInt("Insira o valor inteiro da ALTURA: ")); 
		triangulo.setBase(Console.lerInt("Insira o valor inteiro da LARGURA: ")); 
		FormaController.cadastrar(triangulo);

	}
	
	public static void circulo() {
		circulo = new Circulo();
		circulo.setRaio(Console.lerInt("Insira o valor inteiro do RAIO: "));
		FormaController.cadastrar(circulo);

	}

}
