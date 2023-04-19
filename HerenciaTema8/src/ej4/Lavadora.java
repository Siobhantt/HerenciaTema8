package ej4;

public class Lavadora extends Electrodomestico {
	private int carga;

//============================CONSTRUCTORES==============================
	public Lavadora() {

	}

	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	public Lavadora(int carga, double precio, double peso) {
		super(precio, peso);
		this.carga = carga;
	}

	// ============================GETTERS&SETTERS==============================
	public int getCarga() {
		return carga;
	}
	// ============================METODOS==============================

	public double precioFinal() {
		double precioF = 0;
		if (this.carga > 30) {
			precioF = super.precioFinal() + 30;
		}
		return precioF;
	}

}
