package ej3;

public class MainProducto {

	public static void main(String[] args) {
		NoPerecedero p1 =  new NoPerecedero("Chola", 2, "Plastico");
		p1.calcular(5);
		System.out.println(p1.calcular(5));
	}

}
