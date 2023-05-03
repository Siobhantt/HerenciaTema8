package ej5;
/**
 * Clase que representa un triangulo, otro tipo de poligono
 * @author Luisa
 *
 */
public class Triangulo extends Poligono {
	/**
	 * Representa un de los lados de un triangulo
	 */
private double lado1;
/**
 * Representa un de los lados de un triangulo
 */
private double lado2;
/**
 * Representa un de los lados de un triangulo
 */
private double lado3;
/**
 * Constructor vacio
 */
public Triangulo() {
	
}
/**
 * Constructor con parametros
 * @param numeroLados
 * @param lado1
 * @param lado2
 * @param lado3
 */
public Triangulo(int numeroLados,double lado1, double lado2, double lado3) {
	super(numeroLados);
	this.lado1 = lado1;
	this.lado2 = lado2;
	this.lado3 = lado3;
}
/**
 * Obtiene un el primer lado del triangulo
 * @return
 */
public double getLado1() {
	return lado1;
}
/**
 * Establece un lado del triangulo
 * @param lado1
 */
public void setLado1(double lado1) {
	this.lado1 = lado1;
}
/**
 * Obtiene el segundo lado del triangulo
 * @return
 */
public double getLado2() {
	return lado2;
}
/**
 * Establece el segundo lado del triangulo
 * @param lado2
 */
public void setLado2(double lado2) {
	this.lado2 = lado2;
}
/**
 * Obtiene el tercer lado del triangulo
 * @return
 */
public double getLado3() {
	return lado3;
}
/**
 * Establece el tercer lado del triangulo
 * @param lado3
 */
public void setLado3(double lado3) {
	this.lado3 = lado3;
}
/**
 * Calcula el area del triangulo
 */
public double area() {
	double semiperimetro=0;
	double area=0;
	semiperimetro = (lado1 + lado2 + lado3)/2;
	area = semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3);
	area = Math.sqrt(area);
	return area;
}
/**
 * Metodo toString que muestra las caracteristicas del triangulo
 */
@Override
public String toString() {
	String res ="";
	res += super.toString() + "Triangulo\n" +
	"Lado 1 : " + lado1 + "\n"+
	"Lado 2 : " + lado2 + "\n"+
	"Lado 3 : " + lado3 + "\n";	
	return res;
}

}
