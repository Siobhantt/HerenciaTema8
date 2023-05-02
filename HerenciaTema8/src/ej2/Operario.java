package ej2;
/**
 * Clase que hereda de empleado y representa un operario
 * @author Luisa
 *
 */
public class Operario extends Empleado {
/**
 * Operario hereda de emplado entonces, en el constructor lleva el nombre
 * y en el super hereda el atributo de la clase padre
 * @param nombre
 */
	public Operario(String nombre) {
		super(nombre);
	}
	/**
	 * Metodo to String que representa la herencia de emplaedo a operario
	 */
	@Override
	public String toString() {
		
		return  super.toString() +" -> Operario";
	}

}
