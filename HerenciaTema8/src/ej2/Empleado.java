package ej2;

public class Empleado {
	//Clase padre empleado que tiene atributo nombre
private String nombre;

/**
 * Constructor con parametros
 * @param nombre
 */
public Empleado(String nombre) {
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public String toString() {
	return "Empleado:" + nombre;
}


}
