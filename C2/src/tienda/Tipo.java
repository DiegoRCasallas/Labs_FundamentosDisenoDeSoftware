package tienda;

public class Tipo {
	private int codigo;
	private String descripcion;
	private int iva;
	/**
	 * @param codigo
	 * @param descripcion
	 * @param iva
	 */
	public Tipo(int codigo, String descripcion, int iva) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.iva = iva;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the iva
	 */
	public int getIva() {
		return iva;
	}
	/**
	 * @param iva the iva to set
	 */
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		return " Codigo " + this.codigo + " Descripcion=" + descripcion + " I va" + iva;
	}
	
	
	
	

}
