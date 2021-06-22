package views;

import java.util.Scanner;

import models.Retangulo;
import utils.Console;
import models.Circulo;
import models.Triangulo;

public class Cadastrar {
	private static Scanner sc = new Scanner(System.in);
	private static Retangulo retangulo;
	private static Circulo circulo;
	private static Triangulo triangulo;

	
	public void cadastrarRetangulo() {
		retangulo = new Retangulo();
		retangulo.setAltura(Console.lerInt("Insira o valor inteiro da LARGURA: ")); 
		retangulo.setLargura(Console.lerInt("Insira o valor inteiro da LARGURA: ")); 
	}
	
	public void cadastrarTriangulo() {
		triangulo = new Triangulo();
		triangulo.setAltura(Console.lerInt("Insira o valor inteiro da LARGURA: ")); 
		triangulo.setBase(Console.lerInt("Insira o valor inteiro da LARGURA: ")); 

	}
	
	public void cadastrarCirculo() {
		circulo = new Circulo();
		circulo.setRaio(Console.lerInt("Insira o valor inteiro da LARGURA: ")); 

	}

}
