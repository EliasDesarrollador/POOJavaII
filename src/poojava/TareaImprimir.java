package poojava;

import java.util.Random;

public class TareaImprimir  implements Runnable {
	private final int  tiempoInactividad;
	private final String nombreTarea;
	private final static Random generator = new Random();
	
	public TareaImprimir (String nombre) {
		nombreTarea = nombre;
		tiempoInactividad = generator.nextInt(5000);
	}
	@Ovverride
	public  void run() {
		try {
			System.out.print("%s va  a estar  inactivo  durante %d milisegundos .\n", 
			                    nombreTarea, tiempoInactividad);
			  Thread.sleep (tiempoInactividad);
		}
	}
}
