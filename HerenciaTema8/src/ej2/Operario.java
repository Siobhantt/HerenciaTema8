package ej2;

public class Operario extends Empleado {
/**
 * Operario hereda de emplado entonces, en el constructor lleva el nombre
 * y en el super hereda el atributo de la clase padre
 * @param nombre
 */
	public Operario(String nombre) {
		super(nombre);
	}
	@Override
	public String toString() {
		//Esto imprime el to string de la clase padre mas lo nuevo que se le añada.
		return  super.toString() +" -> Operario";
	}

}
