package poojava;

public class NumerosPrimos {

	public static void main(String[] args) {

		int contador = 0 ;
		int candidato = 2;
		
		while ( contador < 100) {
			if (esPrimo(candidato)) {
				contador++;
				System.out.println(contador + ":" + candidato);
			}
			candidato++;
		}
	}
// Metodo  que verifica si un numero es primo 
	static boolean esPrimo(int n ) {
		if (n <= 1)  return  false;
		if (n == 2) return true;
		if (n % 2 == 0 ) return false ;
		
		for (int i  = 3; i * i  <= n 2) {
			if (n % 2 == 0 ) return  false ;
		}
		return true ;
	}
}