package ej2;

public class Operario extends Empleado {

	@Override
	public String toString() {
		return getClass() +" " +  super.toString() +"->" + getClass();
	}

}
