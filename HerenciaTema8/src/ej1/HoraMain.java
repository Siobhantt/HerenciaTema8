package ej1;

public class HoraMain {

	public static void main(String[] args) {
		Hora hora = new Hora(3,59);
		HoraExacta horaCompleta = new HoraExacta(22,59,59);
		hora.inc();
		System.out.println(hora.toString());
		System.out.println(horaCompleta.toString());
		horaCompleta.inc();
		System.out.println(horaCompleta.toString());
	}

}
