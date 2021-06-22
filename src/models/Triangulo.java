package models;

public class Triangulo extends Forma{
	private int altura;
	private int base;
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	@Override
	public String toString() {
<<<<<<< HEAD
		return "Triangulo, area: " + calcularArea();
=======
		return "Triangulo, área: " + calcularArea();
>>>>>>> 5ea3ccec04d0791745aab1af70794ebaa7365cb2
	}
	@Override
	public double calcularArea() {
		double area = this.base * this.altura;
		area /= 2;
		return area;
	}
	
}
