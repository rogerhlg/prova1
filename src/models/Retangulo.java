package models;

public class Retangulo extends Forma {
	private int altura;
	private int largura;
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	@Override
	public String toString() {
		return "Retangulo - altura: " + altura + ", largura: " + largura;
	}
	@Override
	public double calcularArea() {
		return super.calcularArea() + this.altura * this.largura;
	}

}
