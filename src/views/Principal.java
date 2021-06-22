package views;

import utils.Console;
import views.Cadastrar;
public class Principal {

	public static void main(String[] args) {
		
		int opcao = 0;
		switch (opcao) {
		case 1: {
			do {
				System.out.println("\n-- MENU--");
				System.out.println("\n1 - Cadastrar Retangulo");
				System.out.println("\n1 - Cadastrar Circulo");
				System.out.println("\n1 - Cadastrar Triangulo");
				System.out.println("\n1 - Listar Todos");
				System.out.println("\n1 - Listar Triangulo");
				System.out.println("\n1 - Listar Circulo");
				System.out.println("\n1 - Listar Retangulo");

				System.out.println("4 - Deletar enfermeira");
				System.out.println("0 - Voltar");
				System.out.println("\nDigite a opção desejada: ");
				opcao = Console.lerInt("\nInsira a opcao desejada: ");
				
				switch (opcao) {
				case 1:
					Cadastrar.
					break;
				case 2:
					ListarEnfermeiras.renderizar();
					break;
				case 3:
					AlterarEnfermeira.renderizar();
					break;
				case 4:
					DeletarEnfermeira.renderizar();
					break;
				case 0:
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				} 
			} while (opcao != 0);
		}

	}

}
