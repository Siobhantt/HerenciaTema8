package ej1;
/**
 * Hereda de hora pero con el atributo de segundos añadido
 * @author Luisa
 */
public class HoraExacta extends Hora {
	/**
	 * Atributo segundo
	 */
	int segundos;
	/**
	 * 
	 * @param hora
	 * @param minuto
	 * @param segundos
	 */
	public HoraExacta(int hora, int minuto,int segundos ) {
		super(hora, minuto);
		this.segundos = segundos;
	}
	/**
	 * Obtiene el segundo
	 * @return
	 */
	public int getSegundos() {
		return segundos;
	}
	/**
	 * @param segundos
	 */
	public void setSegundos(int segundos) {
		if(segundos>=0||segundos>=59) {
		this.segundos = segundos;
		}
	}
	/**
	 * Incrementa un segundo a la hora
	 */
	public void inc() {
		segundos++;
		if(segundos==60) {
			super.inc();
			segundos=0;
		}
	}
	@Override
	/**
	 * Sobre escribe el toString de la clase padre y le añade los segundos de la clase heredera
	 */
	public String toString() {
		String res;
		res = super.toString() + ":"+segundos;
		return res;
	}
	

}
