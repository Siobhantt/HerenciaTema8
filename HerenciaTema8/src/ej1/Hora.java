package ej1;

public class Hora {
	protected int hora;
	protected int minuto;
	/**
	 * S la hora esta entre los valores correspondientes la establece, lo mismo con los minutos
	 * @param hora
	 * @param minuto
	 */
	// Comprobar en el constructor
	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}
	/**
	 *Incrementa y corrige los minutos y las hora
	 */
	public void inc() {
		minuto++;
		if (minuto >= 60) {
			minuto = 0;
			hora++;
		}
		if(hora>=24) {
			hora=0;
		}
	}

	/**
	 * Establece la hora en caso de estar en los valores correctos
	 * @param hora
	 * @return Si es valido establecer la hora
	 */
	public boolean setHora(int hora) {
		boolean valido = false;
		if (hora >= 1 && hora <= 23) {
			this.hora = hora;
			valido = true;
		}
		return valido;
	}
	/**
	 * Si los minutos son mayores a 1 o menor= a 59 los establce, en caso contrario se quedan por defecto
	 * @param minuto
	 * @return Si es valido establecer el minuto
	 */
	public boolean setMinuto(int minuto) {
		boolean valido = false;
		if (minuto >= 1 && minuto <= 59) {
			this.minuto = minuto;
			valido = true;
		}
		return valido;
	}
/**
 * Obtiene los minutos
 * @return
 */
	public int getMinuto() {
		return minuto;
	}
/**
 * Obtiene la hora
 * @return
 */
	public int getHora() {
		return hora;
	}

	@Override
	/**
	 * Muestra la hora y los minutos en un presentable formato
	 */
	public String toString() {
		return  hora +":"+ minuto;
	}

}
