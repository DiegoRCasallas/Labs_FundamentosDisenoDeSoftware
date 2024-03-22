package tienda;

public class Producto {
	private int codigo;
	private String nombre;
	private Tipo tipo;
	private int precio;
	private Persona proveedor;
	/**
	 * @param codigo
	 * @param nombre
	 * @param tipo
	 * @param precio
	 * @param proveedor
	 */
	public Producto(int codigo, String nombre, Tipo tipo, int precio, Persona proveedor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.proveedor = proveedor;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * @return the proveedor
	 */
	public Persona getProveedor() {
		return proveedor;
	}
	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Persona proveedor) {
		this.proveedor = proveedor;
	}
	@Override
	public String toString() {
		return this.codigo +" "+ this.nombre +" "+ tipo.getDescripcion() +
			this.precio +" "+ this.proveedor.getNombre();
	}
}
