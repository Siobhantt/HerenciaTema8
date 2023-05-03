package ej4;
/**
 * Clase que representa una television, otro tipo de electroomestico
 * @author Luisa
 *
 */
public class Television extends Electrodomestico {
	/**
	 * Atributo que representa la resolucion
	 */
	private double resolucion;
	/**
	 * Atributo que representa si tiene sintonizador o no
	 */
	private boolean sintonizador;
/**
 * Constructor sin parametros
 */
	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizador = false;
	}
/**
 * Constructor con (2) parametros
 * @param precio
 * @param peso
 */
	public Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion = 20;
		this.sintonizador = false;
	}
/**
 * Constructor con todos los parametros
 * @param precio
 * @param peso
 * @param resolucion
 * @param sintonizador
 * @param color
 * @param consumo
 */
	public Television(double precio, double peso, double resolucion, boolean sintonizador, String color, char consumo) {
		super(precio, peso,color, consumo);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
/**
 * Obtiene la resolucion de la television
 * @return
 */
	public double getResolucion() {
		return resolucion;
	}
/**
 * Obtiene si el televisor tiene sintonizador o no
 * @return
 */
	public boolean isSintonizador() {
		return sintonizador;
	}
/**
 * Establece el precio final del televisor teniendo en cuenta la resolucion y el sintonizador
 * @return
 */
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
/**
 * Metodo toString que muestra las caracteristicas del televisor
 */
	@Override
	public String toString() {
		return super.toString() + 
				"=========================================\n"
				+"Tipo: Television\n" + 
				"Resolucion= " + this.resolucion + "\n" +
				"Sintonizador " + this.isSintonizador() + "\n";
	}

}
