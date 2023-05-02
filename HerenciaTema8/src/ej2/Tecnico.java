package ej2;
/**
 * Clase que representa a un tecnico, que hereda de operario
 * @author Luisa
 *
 */
public class Tecnico extends Operario {
	/**
	 * constructor con parametro del nombre del tecnico
	 * @param nombre
	 */
public Tecnico(String nombre) {
	super(nombre);
}
/**
 * Metodo toString que representa la herencia de operario a tecnico
 */
@Override
public String toString() {
	return  super.toString() +" -> Tecnico";
}
}
