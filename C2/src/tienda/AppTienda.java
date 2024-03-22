package tienda;

public class AppTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tienda miTienda =new Tienda();
		miTienda.crearProducto();
		miTienda.mostrarCatalogo();
		//Compra compra1 = new Compra(producto1, 2);

		miTienda.venta();
		miTienda.informeVentas();
		
	}

}
