package ej3;
/**
 * Clase que representa un producto con nombre y precio
 * @author Luisa
 *
 */
public class Producto {
	/**
	 * Atributo del nombre del producto
	 */
private String nombre;
/**
 * Atributo del precio del producto
 */
private double precio;
/**
 * Constructor con parametros del producto
 * @param nombre del producto
 * @param precio del producto
 */
public Producto(String nombre, double precio) {
	this.nombre = nombre;
	this.precio = precio;
}
//=================GETTERS AND SETTERS====================
/**
 * Obtiene el nombre del producto
 * @return
 */
public String getNombre() {
	return nombre;
}
/**
 * Establece el nombre del producto
 * @param nombre
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * Obtiene el precio del producto
 * @return precio
 */
public double getPrecio() {
	return precio;
}
/**
 * Establece el precio del producto
 * @param precio
 */
public void setPrecio(double precio) {
	this.precio = precio;
}
/**
 * Metodo toString que devuelve el nombre del producto junto a su precio
 */
@Override
public String toString() {
	return "Producto:" + this.nombre + " \nPrecio=" + this.precio;
}

/**
 * metodo que multiplica el precio por la cantidad que se introduzca
 * @param cantidad
 * @return el precio de una cantidad x del producto
 */
public double	 calcular(int cantidad) {
	double res;
	res = this.precio * cantidad;
	return res;
}

}
