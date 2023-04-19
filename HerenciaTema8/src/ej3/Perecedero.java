package ej3;

public class Perecedero extends Producto {
	private int diasaCaducar;

//=================CONSTRUCTOR CON ATRIBUTOS================
	public Perecedero(String nombre, double precio, int diasaCaducar) {
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

//======Calcular
	public double calcular(int cantidad) {
		double precio = 0;
		// Utilizamos la funcion calcular heredandola del padre y usamos la cantidad
		// pasada por parametro
		precio = super.calcular(cantidad);
		switch (this.diasaCaducar) {// utilizamos un switch para los dias a caducar
		case 1:
			precio = precio / 4;
			break;
		case 2:
			precio = precio / 3;
			break;
		case 3:
			precio = precio / 2;
			break;
		default:
			System.out.println("Opcion no contemplada.");
			break;
		}// fin del switch
		return precio;
	}
}
