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
		return "Triangulo, área: " + calcularArea();
	}
	@Override
	public double calcularArea() {
		return (this.base * this.altura)/2;
	}
	
}
