package tienda;

import java.util.ArrayList;

public class Venta {
	private int numero;
	private Fecha fecha;
	private Persona cliente;
	private ArrayList<Compra> listaCompras;
	private long subtotal;
	private long iva;
	private long total;
	/**
	 * @param numero
	 * @param fecha
	 * @param cliente
	 */
	public Venta(int numero, Fecha fecha, Persona cliente) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
		this.listaCompras =new ArrayList();
		this.fecha =new Fecha(2024,3,20);
	}
	/**
	 * Funcion para aregar una instancia d ela clase compa a la
	 * lista de compras
	 * @param compra es un objeto d ela clase Compra
	 */
	public void agregarCompra(Compra compra) {
		listaCompras.add(compra);
	}
	@Override
	public String toString() {
		return "Venta [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", listaCompras="
				+ listaCompras + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + "]";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}
	public void setListaCompras(ArrayList<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}
	public long getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(long subtotal) {
		this.subtotal = subtotal;
	}
	public long getIva() {
		return iva;
	}
	public void setIva(long iva) {
		this.iva = iva;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
	
}
