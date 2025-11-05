package poojava;

public class CreadorSubproceso {

	public static void main(String[] args) {
		System.out.println("Creacion de Subprocesos");
		Thread subproceso1 = new Thread(new  TareaImprimir("tarea1") );
		Thread subproceso2 = new Thread(new  TareaImprimir("tarea2") );
		Thread subproceso3 = new Thread(new  TareaImprimir("tarea 3") );
		
		System.out.println("Subprocesos creados , iniciando tareas.");
		subproceso1.start(); // invoca  al metodo  run de tarea1
		subproceso2.start(); // invoca al metodo  run de tarea2
		subproceso3.start(); // invoca al metodo run de  tarea3
		System.out.println("Tareas iniciadas , main termina .\n");
		
	
	}

}
