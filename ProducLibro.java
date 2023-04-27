package PaquetePoo;

public class ProducLibro {

	private ProducLibro libro;
	private int codigo;
	private String titulo; 
	private String editorial; 
	private String autor;
	private int fechpublic;
	private double precio;
	private boolean digital;
	private int Can; 
	boolean copFisica;
	
 public ProducLibro (int cod, String titu, String edit,String aut , int fechpubl, double precio,boolean digital) {//método constructor
	//inicializamos los objetos
	
	codigo=cod;
	titulo= titu;
	editorial = edit; 
	autor = aut;
	fechpublic = fechpubl;
	this.precio = precio; 
	this.digital = digital;
	
	
	}
//metodos getters

public int un_codigo() {
	return codigo;
}
public String un_titulo() {
	return titulo;
}
public String editorial() {
	return editorial;
}
public String autor() {
	return autor;
}
public int fechpublic() {
	return fechpublic;
}
public double un_precio() {
	return precio;
}
public boolean digital() {
	return true;
}
public double dameprecio( ) {
	 double factor = digital ? 1.08 : 1.18;
	 return precio * (1+factor);}
			
	
 public void mostrarProducto() {
	 System.out.println("Producto Libro: ");
	 System.out.println("Codigo: " +codigo+ "--" +"Título: "+ titulo);
	 System.out.println("Editorial: " +editorial+ "--" +"Autor: "+ autor+"Fechpublic: "+fechpublic);
	 System.out.println("Precio: " +precio+ "--" + "Digital:"+digital);
	 
 }
 
}
