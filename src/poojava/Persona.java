package poojava;


public class Persona {   // Clase publica persona 
	// Atributos Privados (estado)
	private String nombre = "Elias";  
	private int Edad =  22;
	
	// Sintaxis de declaracin de una  variable en java
	int dia = 4;
	// Sintaxis de declaracion  de  una constante publica  en java
	public static int semana  = 7;

	public static void main(String[] args) {
		
		// Creamos un objeto persona 
		Persona  p = new Persona();
		System.out.println( "Hola !! . Tu nombre es : " +p. nombre + " y tu edad es : " +  p.Edad  +  " " +  "años .");
		System.out.println("SEMANA : " + semana);


	}

}
