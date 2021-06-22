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
		return "Circulo raio: " + raio;
	}

	@Override
	public double calcularArea() {
		return (this.raio * this.raio) * 3.14;
	}

}
