package PaquetePoo;
 

public class carritoCompras {


	public static void main(String[] args) {
		carrito carrito = new carrito ();
		
	
		//instanciacion de clase producto 
		
        ProducLibro libro1 = new ProducLibro (001,"Kritik der reinen Vernunft", "Editorial Gaspar","Immanuel Kant",1883,300.20, false);
        ProducLibro libro2 = new ProducLibro (002,"Mitos de la historia Argentina", "Editorialbooket","Felipe Pigna",2019, 260.70,true);
        ProducLibro libro3 = new ProducLibro (003,"Rebelión en la granja","Editorial Harvill Secker","George Orwellt", 1945, 200.87, false);
        ProducRevista revista4 = new ProducRevista (004,"Caras","Perfil",1992, 1400, true);
        ProducRevista revista5 = new ProducRevista (005,"La garganta poderosa", "Anónima",2023,500, true); 
        
        
       
        carrito.agregarProductos(libro3);
        carrito.agregarProducto(revista5);
      
        
        
        System.out.println("Libros agregados al carro");
        carrito.mostrarProductos();
        System.out.println("Revistas agregados al carro");
        carrito.mostrarProductos();
        System.out.println("Total de la compra= "+carrito.damepreciototal());
	

	}

       	
        
       
        
       
       
  

}	


