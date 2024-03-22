package tienda;

public class Fecha {
	private int anio;
	private int mes;
	private int dia;
	/**
	 * @param anio
	 * @param mes
	 * @param dia
	 */
	public Fecha(int anio, int mes, int dia) {
		super();
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	@Override
	public String toString() {
		return "Fecha [anio=" + anio + ", mes=" + mes + ", dia=" + dia + "]";
	}
	
	

}
