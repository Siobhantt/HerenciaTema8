package ej2;
/**
 * Clase heredera de Operario que representa un oficial
 * @author Luisa
 *
 */
public class Oficial extends Operario {
	/**
	 * Constructor con el nombre del oficial
	 * @param nombre
	 */
public Oficial(String nombre) {
	super(nombre);
}
/**
 * Metodo to string que representa de que tipo de operario se trata
 */
@Override
public String toString() {
	return  super.toString() +" -> Oficial";
}
}
