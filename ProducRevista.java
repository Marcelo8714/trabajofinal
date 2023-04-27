package PaquetePoo;

public class ProducRevista { 


		
		private int codigo;
		private String nombre; 
		private String editorial; 
		private int fechpublic;
		private double precio;
		private boolean  digital;
		boolean copFisica;
		private ProducRevista Revista;
		private int Can; 

		
	 public ProducRevista (int cod, String nom, String edit , int fechpubl, double precio,boolean digital) {//método constructor
		//inicializamos los objetos
		
		codigo=cod;
		nombre= nom;
		editorial = edit; 
		fechpublic = fechpubl;
		this.precio = precio;
		this.digital = digital;
	
		
		}
	//metodos getters
	 
	 public double dameprecioVenta( ) {
		 double factor = digital ? 0.8 : 0.18;
		 return precio * (1+factor);
	 }	 
	public int un_codigo() {
		return codigo;
	}
	public String un_nombre() {
		return nombre;
	}
	public String editorial() {
		return editorial;
	}
	
	public int fechpublic() {
		return fechpublic;
	}
	public double precio() {
		return precio;
	}
	public boolean digital() {
		return true;
	}
	
	public double dameprecio( ) {
		 double factor = digital ? 1.12 : 1.22;
		 return precio * (1+factor);}
	
	
	
	 public void mostrarProducto() {
		 System.out.println("Producto Libro: ");
		 System.out.println("Codigo: " +codigo+ "--" +"Nombre: "+ nombre);
		 System.out.println("Editorial: " +editorial+ "--" +"Fechpublic: "+fechpublic+"--"+"Digital"+ digital);
		 System.out.println("Precio:  ");
		 
	
	 }}
			
	
