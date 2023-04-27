package PaquetePoo;

import java.util.ArrayList;

public class carrito {
	private ArrayList<ProducLibro>Productos; 
	private ArrayList<ProducRevista>Producto;
		public carrito() {
			Productos = new ArrayList<>() ;
			Producto = new ArrayList<>();
		}
		public void agregarProductos(ProducLibro productos) {  
			Productos.add(productos);
		} 
		public void eliminarProductos (ProducLibro productos) {
		Productos.remove(productos);
		}
		public void mostrarProductos () {
		for (ProducLibro producto : Productos) {
		System.out.println(producto.un_codigo()+" - "+ producto.un_titulo()+" - "+producto.editorial()+"-"+producto.autor()+"-"+producto.fechpublic()+"-"+producto.un_precio()); }
		}
		public double dameun_precio( ) {
			 boolean digital;
			double factor = digital() ? 1.08 : 1.18;
			 return dameun_precio() * (1+factor);}
		
		
		
		
		
		public void agregarProducto (ProducRevista producto) {  
			Producto.add(producto);
		} 
		public void eliminarProducto (ProducRevista producto) {
		Producto.remove(producto);
		}
		public boolean digital() {
			return true; }
			
			
		public void mostrarProducto () {
		for (ProducRevista producto : Producto) {
			System.out.println(producto.un_codigo()+" - "+producto.un_nombre()+" - "+producto.editorial()+" - "+producto.fechpublic()+" - "+producto.precio()+" - "+producto.digital());}
		}

		public double damepreciototal( ) {
			 double factor = digital() ? 1.12 : 1.22;
			 return damepreciototal() * (1+factor);}

}
           
           

		


