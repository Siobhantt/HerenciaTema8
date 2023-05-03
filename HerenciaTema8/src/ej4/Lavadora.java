package ej4;
/**
 * Clase Lavadora, otro tipo de Electrodomestico
 * @author Luisa
 *
 */
public class Lavadora extends Electrodomestico {
	/**
	 * Atributo que representa la carga de una lavadora
	 */
	private int carga;

/**
 * Construtor sin parametros
 */
	public Lavadora() {
		super();
		this.carga = 5;
	}
/**
 * Constructor con (2) parametros
 * @param precio de la lavadora
 * @param peso de la lavadora
 */
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = 5;
	}
/**
 * Constructor con todos los parametros
 * @param precio
 * @param peso
 * @param color
 * @param consumo
 * @param carga
 */
	public Lavadora(double precio, double peso, String color, char consumo,int carga) {
		super(precio, peso, color,consumo);
		this.carga = carga;
	}

/**
 * Obtiene la carga de la lavadora
 * @return
 */
	public int getCarga() {
		return carga;
	}

/**
 * Calcula el precio final de la lavadora teniendo en cuenta la capacidad de carga
 */
	public double precioFinal() {
		double precioF = 0;
		if (this.carga > 30) {
			precioF = super.precioFinal() + 30;
		}
		return precioF;
	}
/**
 * Metodo toString que muestra las caracteristicas de la lavadora
 */
	@Override
	public String toString() {
		return super.toString()
				+"=========================================\n"
				+"Tipo: Lavadora\n" + 
				"Carga= " + this.carga+"\n";
	}

}
