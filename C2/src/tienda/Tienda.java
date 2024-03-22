package tienda;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Producto> listaProduto;
	private ArrayList<Venta> listaVentas;
	private Tipo tipo =new Tipo(10,"Bebidas azucaradas",25);
	private Persona proveedor; 
	private Persona cliente;
	/**
	 * @param listaProduto
	 * @param listaVentas
	 */
	public Tienda() {
		super();
		this.listaProduto =new ArrayList<>();
		this.listaVentas =new ArrayList<>();
		tipo =new Tipo(10,"Bebidas azucaradas",25);
		proveedor =new Persona(1545,"Juanita");
		cliente =new Persona(2030,"Pachito");
		
	}
	/**
	 * 
	 */
	public void crearProducto() {
		listaProduto.add(new Producto(1020,"Gaseosa",tipo,2500,proveedor)); 
		listaProduto.add(new Producto(1025,"Jugo",tipo,3500,proveedor));
		listaProduto.add(new Producto(1030,"Galletas",tipo,1500,proveedor));
		listaProduto.add(new Producto(1035,"Papas",tipo,2500,proveedor));
		listaProduto.add(new Producto(1040,"Pan",tipo,1200,proveedor));
	}
	
	/**
	 * La función `mostrarCatalogo` recorre en iteración una lista de productos e imprime cada producto en
	 * la consola.
	 */
	public void mostrarCatalogo() {
		System.out.println("CATALOGO");
		for (Producto producto : listaProduto) {
			System.out.println(producto);
		}
	}
	public void informeVentas(){
		System.out.println("INFORME DE VENTAS");
		for (Venta factura : listaVentas) {
			System.out.println(factura);
		}
	}


	
	/**
	 * La función `venta` crea un nuevo objeto `Venta` con un cliente específico, le agrega una compra y
	 * luego lo agrega a una lista de ventas.
	 */
	public void venta(){
		Venta ventaActual = new Venta(0, null, this.cliente);
		Compra compra = new Compra(listaProduto.get(0), 2);
		ventaActual.agregarCompra(compra);
		//ventaActual.getListaCompras().get(0);
		long numero = (long) (ventaActual.getTotal()+compra.getValorCompra());
		ventaActual.setTotal(numero);
		listaVentas.add(ventaActual);
		
	}





	public Persona getProveedor(){
		return this.proveedor;
	}
	public ArrayList<Producto> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(ArrayList<Producto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public ArrayList<Venta> getListaVentas() {
		return listaVentas;
	}
	public void setListaVentas(ArrayList<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public void setProveedor(Persona proveedor) {
		this.proveedor = proveedor;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	
	
}
