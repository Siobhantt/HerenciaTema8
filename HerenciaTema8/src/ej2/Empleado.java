package ej2;
/**
 * Representacion de un empleado con el atributo nombre
 * @author Luisa
 *
 */
public class Empleado {
	/**
	 * atributo con el nombre del empleado
	 */
	
private String nombre;

/**
 * Constructor con parametros
 * @param nombre
 */
public Empleado(String nombre) {
	this.nombre = nombre;
}
/**
 * Devuelve el nombre del empleado
 * @return
 */
public String getNombre() {
	return nombre;
}
/**
 * establece el nombre del empleado
 * @param nombre
 */
public void setNombre(String nombre) {
	if(!nombre.equals("")) {
	this.nombre = nombre;
	}
}

/**
 * ToString del nombre del empleado
 */
@Override
public String toString() {
	return "Empleado:" + nombre;
}


}
