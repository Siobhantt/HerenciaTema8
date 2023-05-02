package ej1;
/**
 * Clase que representa la hora, con atributos de hora y minutos
 * @author Luisa
 *
 */
public class Hora {
	/**
	 * Atributo de hora
	 */
	protected int hora;
	/**
	 * Atributo de minuto
	 */
	protected int minuto;
	/**
	 * Constructor que cpmprueba la hora y los minutos si estan en los valores correctos establecidos y en caso correcto construye el objeto
	 * @param hora
	 * @param minuto
	 */
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
	 * En caso de estar en los valores correctos establece el valor del minuto
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
	 * Muestra la hora y los minutos en un formato presentable 
	 */
	public String toString() {
		return  hora +":"+ minuto;
	}

}
