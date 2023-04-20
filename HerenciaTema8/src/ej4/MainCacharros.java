package ej4;

import ej4.Electrodomestico.Color;
import ej4.Electrodomestico.Consumo;

public class MainCacharros {
	static Electrodomestico[] arrayCacharros = new Electrodomestico[10];

	public static void main(String[] args) {
		double precioF;
		double precioB;
		Electrodomestico a1 = new Electrodomestico(50, 10, "gris", 'A');
		Electrodomestico a2 = new Electrodomestico(500, 30);
		Electrodomestico a3 = new Electrodomestico();

		Lavadora b1 = new Lavadora(400, 40);
		Lavadora b2 = new Lavadora(400, 35,"negro", 'C',40);
		Lavadora b3 = new Lavadora(600, 50,"azul",'F',40);
		Lavadora b4 = new Lavadora();

		Television c1 = new Television(1000,30);
		Television c2 = new Television(1200,40,55,true,"azul",'D');
		Television c3 = new Television();

		arrayCacharros[0] = a1;
		arrayCacharros[1] = a2;
		arrayCacharros[2] = a3;

		arrayCacharros[3] = b1;
		arrayCacharros[4] = b2;
		arrayCacharros[5] = b3;
		arrayCacharros[6] = b4;

		arrayCacharros[7] = c1;
		arrayCacharros[8] = c2;
		arrayCacharros[9] = c3;

		for(int i=0;i<arrayCacharros.length;i++) {
			precioB = arrayCacharros[i].precioBase;
			precioF = arrayCacharros[i].precioFinal();
			System.out.println(arrayCacharros[i]);
			System.out.println();
			System.out.println("El precio final con las restricciones aplicada es = "+precioF);
			System.out.println();
		}
		
	}

}
