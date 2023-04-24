package ej5;

public abstract class Poligono {
protected int numeroLados;

public Poligono() {
	
}

public Poligono(int numeroLados) {
	this.numeroLados = numeroLados;
}

public int getNumeroLados() {
	return numeroLados;
}
//========ESTO ES IMPORTANTE================
public abstract double area();

@Override
public String toString() {
	String res="";
	res += "Poligono\n" 
			+ "Cantidad de lados: " + numeroLados+"\n";
	return res; 
}


}
