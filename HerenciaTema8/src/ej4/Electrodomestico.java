package ej4;
/**
 * Clase que representa un electrodomestico
 * @author Luisa
 *
 */
public class Electrodomestico {
	/**
	 * Precio base(sin modificaciones) del electrodomestico
	 */
	public double precioBase;
	/**
	 * Peso del electrodomestico
	 */
	public double peso;
	/**
	 * Atributo de Enumerado Color
	 */
	public Color color;
	/**
	 * Atributo de Enumerado Consumo
	 */
	public Consumo consumo;

	/**
	 * Enumerado Color
	 */
	public enum Color {
		blanco, negro, rojo, azul, gris
	}
	/**
	 * Enumerado Consumo
	 */
	public enum Consumo {
		A, B, C, D, E, F
	}

	/**
	 * Contructor sin parametros(Establece ciertos parametros por defecto)
	 */
	public Electrodomestico() {
		this.color = Color.blanco;
		this.consumo = Consumo.F;
		this.precioBase = 100;
		this.peso = 5;
	}
/**
 * Constructor con (2) parametros
 * @param precioBase
 * @param peso
 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = Color.blanco;
		this.consumo = Consumo.F;
	}
/*
 * Constructor con todos los parametros
 */
	public Electrodomestico(double precioBase, double peso, String color, char consumo) {
		this.precioBase = precioBase;
		this.peso = peso;
		compruebaColor(color);
		comprobarConsumoEnergetico(consumo);
	}

	/**
	 * Obtiene el precio base del electrodomestico
	 * @return
	 */
	public double getPrecioBase() {
		return precioBase;
	}
/**
 * establece el precio base del electrodomestico
 * @param precioBase
 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
/**
 * Obtiene el peso
 * @return
 */
	public double getPeso() {
		return peso;
	}
/**
 * establece el peso
 * @param peso
 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
/**
 * obtiene el color
 * @return
 */
	public Color getColor() {
		return color;
	}
/**
 * establece el color
 * @param color
 */
	public void setColor(Color color) {
		this.color = color;
	}
/**
 * Obtiene el consumo
 * @return
 */
	public Consumo getConsumo() {
		return consumo;
	}
/**
 * Establece el consumo
 * @param consumo
 */
	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	/**
	 * Comprueba que el atributo de consumo este en los valores valorados
	 * @param letra
	 */
	private void comprobarConsumoEnergetico(char letra) {
		// Si el consumo esta entre las letras consideradas establesco MI consumo a la
		// letra que me han pasado por parametros
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			// aqui establezco MI CONSUMO (El de la clase y dentro de la conversion a
			// consumo hago uan conversion a string porque el parametro es char)
			this.consumo = Consumo.valueOf(String.valueOf(letra));
		} else { // en caso contrario establezco el consumo a el valor por defecto(a mano)
			this.consumo = Consumo.F;
		}
	}
/**
 * Comprueba que el color introducido este entre los valores comprendidos en el enumerado
 * @param color
 */
	private void compruebaColor(String color) {
		// si el color esta entre los validos establezco mi atributo(el de la clase) a
		// lo que me pasan por parametro,
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			// Hago una conversion a enumerado con el valueOf
			this.color = Color.valueOf(color);
		} else {// en caso contrario establezco el color por defecto
			this.color = Color.blanco;
		}
	}// fin del metodo

/**
 * Metodo que devuelve el precio final del electrodomestico con las restricciones aplicadas
 * @return
 */
	public double precioFinal() {
		double precioF = 0;
		switch (this.consumo) {
		case A:
			precioF = this.precioBase += 100;
			break;
		case B:
			precioF = this.precioBase += 80;
			break;
		case C:
			precioF = this.precioBase += 60;
			break;
		case D:
			precioF = this.precioBase += 50;
			break;
		case E:
			precioF = this.precioBase += 30;
			break;
		case F:
			precioF = this.precioBase += 10;
		}// fin del switch
		if (this.peso >= 0 && this.peso <= 19) {
			precioF = this.precioBase += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioF = this.precioBase += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			precioF = this.precioBase += 80;
		} else if (this.peso > 80) {
			precioF = this.precioBase += 100;
		}

		return precioF;
	}// fin del metodo

	/**
	 * Metodo que muestra todas las caracteristicas del electrodomestico
	 */
	@Override
	public String toString() {
		String res="";
		res += "Electrodomestico: \n" +
				"Precio base= " + this.precioBase + "\n"+
				"Peso= " + this.peso + "\n" +
				"Color: " + this.color + "\n" + 
				"Consumo: " + this.consumo + "\n";
		return res;
	}
}
