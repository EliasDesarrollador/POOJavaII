package poojava;

// Pilares de OOP - en JAVA
// Abstraccion 
public  abstract  class Animal {
   protected String nombre; // visible para  subclases 
   public Animal(String nombre) { this.nombre = nombre; }
   
   public abstract void hablar(); // metodo abstrtacto  =>  las soluciones  lo implementan 
   
   public  void dormir (); {  System.out.println(nombre + "esta durmiendo");} }

public class Perro extends Animal {
	public Perro(String nombre ) { super(nombre);}
	@Override
	 public void hablar() {System.out.println(nombre + "dice : Guau "); }}

// Uso 
Animal a = new Perro("Jake"); // Verguenza : no conoces los detalles , solo la interfaz 
a.hablar(); // ejecuta Perro.hablar()
