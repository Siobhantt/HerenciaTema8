package ej4;

public class Electrodomestico {
	// ==================Atributos======================
	public double precioBase;
	public double peso;
	public Color color;
	public Consumo consumo;

	// ==================Enumerados======================
	public enum Color {
		blanco, negro, rojo, azul, gris
	}

	public enum Consumo {
		A, B, C, D, E, F
	}

	// ==================Constructores======================
	public Electrodomestico() {
		this.color = Color.blanco;
		this.consumo = Consumo.F;
		this.precioBase = 100;
		this.peso = 5;
	}

	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, double peso, String color, char consumo) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		compruebaColor(color);
		comprobarConsumoEnergetico(consumo);
	}

	// ==================GETTERS AND SETTERS======================
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	// ==================Metodos======================
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

	public double precioFinal() {
		double precioF = 0;
		switch (this.consumo) {
		case A:
			precioF = this.precioBase + 100;
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
}
