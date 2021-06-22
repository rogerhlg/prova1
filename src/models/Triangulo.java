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
		return "Triangulo, �rea: " + calcularArea();
	}
	@Override
	public double calcularArea() {
		double area = this.base * this.altura;
		area /= 2;
		return area;
	}
	
}
