package ej5;
/**
 * Clase padre que representa un poligono
 * @author Luisa
 *
 */
public abstract class Poligono {
	/**
	 * Atributo del numero de lados de un poligono
	 */
protected int numeroLados;
/**
 * Constructor vacio
 */
public Poligono() {
	
}
/**
 * Constructor con parametros
 * @param numeroLados
 */
public Poligono(int numeroLados) {
	this.numeroLados = numeroLados;
}
/**
 * Obtiene el numero de lados de un poligono
 * @return
 */
public int getNumeroLados() {
	return numeroLados;
}
/**
 * Metodo abstracto con el que se obtiene el area del poligono
 * @return
 */
public abstract double area();
/**
 * Metodo toString que muestra la cantidad de lados del poligono
 */
@Override
public String toString() {
	String res="";
	res += "Poligono\n" 
			+ "Cantidad de lados: " + numeroLados+"\n";
	return res; 
}


}
