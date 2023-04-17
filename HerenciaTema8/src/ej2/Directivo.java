package ej2;

public class Directivo extends Empleado {

	@Override
	public String toString() {
		return getClass() +" " +  super.toString() +"->" + getClass();
	}
}
