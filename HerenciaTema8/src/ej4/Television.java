package ej4;

public class Television extends Electrodomestico {
	private double resolucion;
	private boolean sintonizador;

	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizador = false;
	}

	public Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion = 20;
		this.sintonizador = false;
	}

	public Television(double precio, double peso, double resolucion, boolean sintonizador, String color, char consumo) {
		super(precio, peso,color, consumo);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public double precioFnal() {
		double precioF = 0;
		if (this.resolucion > 40) {
			precioF = super.precioFinal() * 1.3;
		}
		if (this.sintonizador == true) {
			precioF = super.precioFinal() + 50;
		}
		return precioF;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"=========================================\n"
				+"Tipo: Television\n" + 
				"Resolucion= " + this.resolucion + "\n" +
				"Sintonizador " + this.isSintonizador() + "\n";
	}

}
