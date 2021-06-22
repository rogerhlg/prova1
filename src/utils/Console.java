package utils;

import java.util.Scanner;

public class Console {
	
	private static Scanner sc = new Scanner(System.in);

	public static int lerInt(String msg) {
		boolean valorCorreto = false;
		int valor = 0;
		do {
			try {
				System.out.println(msg);
				valor = Integer.parseInt(sc.next());
				valorCorreto = true;
			} catch (Exception e) {
				System.out.println("Digite um numero!");
			}
		}while(!valorCorreto);
		
		return valor;
	}
	
	public static double lerDouble(String msg) {
		boolean valorCorreto = false;
		double valor = 0;
		do {
			try {
				System.out.println(msg);
				valor = Double.parseDouble(sc.next());
				valorCorreto = true;
			} catch (Exception e) {
				System.out.println("Digite um double! APAGAR METODO DEPOIS");
			}
		}while(!valorCorreto);
		System.out.println("\n" + valor);
		return valor;
	}
	
}
