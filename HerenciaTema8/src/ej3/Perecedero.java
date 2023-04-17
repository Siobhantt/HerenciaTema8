package ej3;

public class Perecedero extends Producto {
private int diasaCaducar;
//=================CONSTRUCTOR CON ATRIBUTOS================
public Perecedero(String nombre, double precio,int diasaCaducar) {
	super(nombre, precio);
	this.diasaCaducar = diasaCaducar;
}
//=================GETTERS AND SETTERS====================
public int getDiasaCaducar() {
	return diasaCaducar;
}
public void setDiasaCaducar(int diasaCaducar) {
	this.diasaCaducar = diasaCaducar;
}
//=================TO STRING====================
@Override
public String toString() {
	return super.toString() + "\nDias para caducar: " + this.diasaCaducar;
}

}
