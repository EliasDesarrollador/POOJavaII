package poojava;


public class Persona {   // Clase publica persona 
	// Atributos Privados (estado)
	private String nombre ;
	private int edad ;
	
	// Sintaxis de declaracin de una  variable en java
	int dia = 4;
	// Sintaxis de declaracion  de  una constante publica  en java
	public static int semana  = 7;
	
	// Constructor 
	public Persona(String nombre , int edad) { 
		// Se usa al crear objetos 
		this.nombre = nombre; // this referencia al atributo de la instancia 
		this.edad = edad;
	}

	// Metodos (Comportamientos )
	public void  saludar() {
		System.out.println("Hola , soy " + nombre  + " y tengo  " + edad +"  "+"esa edad");
	}
	public static void main(String[] args) {
		// Creamos un objeto persona 
		Persona  p = new Persona("Elias ",  22  );
		p.saludar(); // Llamamos al metodo 
	
		

	}

}
