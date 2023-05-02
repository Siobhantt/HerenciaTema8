package ej2;
/**
 * Representa a otro tipo de empleado, en este caso directivo
 * @author Luisa
 *
 */
public class Directivo extends Empleado {
	/**
	 * Constructor con parametros
	 * @param nombre del directivo
	 */
	public Directivo(String nombre) {
		super(nombre);
	}
	/**
	 * metodo que señala que tipo de que tipo de empleado se trata
	 */
	@Override
	public String toString() {
		return  super.toString() +" -> Directivo";
	}
}
