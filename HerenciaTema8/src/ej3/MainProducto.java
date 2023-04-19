package ej3;

public class MainProducto {
	Producto arrayProductos[] = new Producto[5];
	public static void main(String[] args) {
		//============Productos
		Perecedero a4 = new Perecedero("Lechuga", 2.1, 2);
		NoPerecedero a2 = new NoPerecedero("Arroz",1.80, "Carbohidrato");
		Producto a1 = new Producto("Atun",4.60);
		System.out.println("El precio final de vender 5 " +a4.getNombre() +" = " + a4.calcular(5));
		System.out.println(a2.calcular(5));
		System.out.println(a1.calcular(5));
		
	}

}
