package ej3;
/**
 * Clase que representa producto no perecedero
 * @author Luisa
 *
 */
public class NoPerecedero extends Producto {
	/**
	 * Atributo del tipo de producto
	 */
	private String tipo;

/**
 * Constructor con parametros del prodcuto no perecedero
 * @param nombre
 * @param precio
 * @param tipo
 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

/**
 * Obtiene el tipo del producto
 * @return
 */
	public String getTipo() {
		return tipo;
	}
/**
 * Establece el tipo del producto
 * @param tipo
 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

/**
 * Metodo toString que contiene el nombre, precio y tipo del producto
 */
	@Override
	public String toString() {
		return super.toString() + "\nTipo:" + this.tipo;
	}
}
