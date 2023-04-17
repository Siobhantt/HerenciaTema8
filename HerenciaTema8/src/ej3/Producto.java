package ej3;

public class Producto {
private String nombre;
private double precio;
//=================CONSTRUCTOR CON ATRIBUTOS================
public Producto(String nombre, double precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
}
//=================GETTERS AND SETTERS====================
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
//=================TO STRING====================
@Override
public String toString() {
	return "Producto:" + this.nombre + " \nPrecio=" + this.precio;
}

//=====Calcular
public double	 calcular(int cantidad) {
	double res;
	res = this.precio * cantidad;
	return res;
}

}
