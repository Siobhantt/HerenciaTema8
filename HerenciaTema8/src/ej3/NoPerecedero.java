package ej3;

public class NoPerecedero extends Producto {
private String tipo;
//=================CONSTRUCTOR CON ATRIBUTOS================
public NoPerecedero(String nombre, double precio, String tipo) {
	super(nombre, precio);
	this.tipo = tipo;
}
//=================GETTERS AND SETTERS====================
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
//=================TO STRING====================
@Override
public String toString() {
	return super.toString() + "\nTipo:" + this.tipo;
}
/**
public double	 calcular(int cantidad) {
	double res;
	// 
	res = super.calcular(cantidad);
	return res;

}
*/
}
