package ej4;

public class Lavadora extends Electrodomestico {
	private int carga;

//============================CONSTRUCTORES==============================
	public Lavadora() {
		super();
		this.carga = 5;
	}

	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = 5;
	}

	public Lavadora(double precio, double peso, String color, char consumo,int carga) {
		super(precio, peso, color,consumo);
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

	@Override
	public String toString() {
		return super.toString()
				+"=========================================\n"
				+"Tipo: Lavadora\n" + 
				"Carga= " + this.carga+"\n";
	}

}
