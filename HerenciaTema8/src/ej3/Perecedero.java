package ej3;
/**
 * Clase heredera que representa a los productos perecederos
 * @author Luisa
 *
 */
public class Perecedero extends Producto {
	/**
	 * Atributo que representa los dias a caducar del producto
	 */
	private int diasaCaducar;

/**
 * Constructor de producto perecedero con parametros
 * @param nombre del producto
 * @param precio
 * @param diasaCaducar
 */
	public Perecedero(String nombre, double precio, int diasaCaducar) {
		super(nombre, precio);
		this.diasaCaducar = diasaCaducar;
	}

/**
 * Obtiene los dias a caducar del producto
 * @return
 */
	public int getDiasaCaducar() {
		return diasaCaducar;
	}
/**
 * Establece los dias a caducar del producto
 * @param diasaCaducar
 */
	public void setDiasaCaducar(int diasaCaducar) {
		this.diasaCaducar = diasaCaducar;
	}

/**
 * Metodo toString que contiene el nombre, el precio y en este caso los dias a caducar del producto
 */
	@Override
	public String toString() {
		return super.toString() + "\nDias para caducar: " + this.diasaCaducar;
	}

/**
 * Metodo que calcula el precio del producto pero en este caso teniendo en cuenta los dias de caducidad del producto
 */
	public double calcular(int cantidad) {
		double precio = 0;
		// Utilizamos la funcion calcular heredandola del padre y usamos la cantidad
		// pasada por parametro
		precio = super.calcular(cantidad);
		switch (this.diasaCaducar) {// utilizamos un switch para los dias a caducar
		case 1:
			precio = precio / 4;
			break;
		case 2:
			precio = precio / 3;
			break;
		case 3:
			precio = precio / 2;
			break;
		default:
			System.out.println("Opcion no contemplada.");
			break;
		}// fin del switch
		return precio;
	}
}
