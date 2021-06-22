package views;

import utils.Console;
public class Principal {

public static void main(String[] args) {
		
	int opcao = 0;
	do {
		System.out.println("\n-- MENU--");
		System.out.println("\n1 - Cadastrar Retangulo");
		System.out.println("\n2 - Cadastrar Circulo");
		System.out.println("\n3 - Cadastrar Triangulo");
		System.out.println("\n4 - Listar Todos");
		System.out.println("\n5 - Listar Retangulo");
		System.out.println("\n6 - Listar Circulo");
		System.out.println("\n7 - Listar Triangulo");
		System.out.println("0 - Sair");
		opcao = Console.lerInt("\nInsira a opcao desejada: ");
			
		switch (opcao) {
		case 1:
			Cadastrar.retangulo();
			break;
		case 2:
			Cadastrar.circulo();
			break;
		case 3:
			Cadastrar.triangulo();
			break;
		case 4:
			Listar.todos();
			break;
		case 5:
			Listar.retangulo();
			break;
		case 6:
			Listar.circulo();
			break;
		case 7:
			Listar.triangulo();
			break;
		case 0:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		} 
	} while (opcao != 0);
	}
}
