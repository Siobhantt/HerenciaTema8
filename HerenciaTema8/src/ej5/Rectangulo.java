package ej5;
/**
 * Clase que representa un Rectangulo, otro tipo de Poligono
 * @author Luisa
 *
 */
public class Rectangulo extends Poligono {
/**
 * Atributo de la base 
 */
	private double base;
	/**
	 * Atributo de la altura
	 */
private double altura;
/**
 * Constructor vacio
 */
public Rectangulo() {
	
}
/**
 * Constructor con parametros
 * @param numeroLados
 * @param lado1
 * @param lado2
 */
public Rectangulo(int numeroLados,double lado1, double lado2) {
	super(numeroLados);
	this.base = lado1;
	this.altura = lado2;
}
/**
 * Obtiene e primer lado de rectangulo
 * @return
 */
public double getLado1() {
	return base;
}
/**
 * Establece el primer lado del rectangulo
 * @param lado1
 */
public void setLado1(double lado1) {
	this.base = lado1;
}
/**
 * Obtiene el segundo lado del rectangulo
 * @return
 */
public double getLado2() {
	return altura;
}
/**
 * Establece el segundo lado del rectangulo
 * @param lado2
 */
public void setLado2(double lado2) {
	this.altura = lado2;
}
/**
 * Calcula el area del rectangulo
 */
public double area() {
	double area=0;
	area = base* altura;
	return area;
}
/**
 * Imprime ls caracteristicas del rectangulo
 */
@Override
public String toString() {
	String res ="";
	res += super.toString() + "Rectangulo\n" +
	"Lado 1 (base): " + base + "\n"+
	"Lado 2 (altura): " + altura + "\n"	;	
	return res;
}


}
