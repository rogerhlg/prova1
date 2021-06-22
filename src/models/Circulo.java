package models;

public class Circulo extends Forma {
	private int raio;

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo, área: " + calcularArea() ;
	}

	@Override
	public double calcularArea() {
		return (this.raio * this.raio) * 3.14;
	}

}
