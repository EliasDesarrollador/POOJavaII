package poojava;
//clase publica 
public class ComplexNumber {
// variables 
	 private double  r ;
	 private double i ;
	 
	 //Metodo que recibe dos parametros 
	 public ComplexNumber (double r ,  double  i ) {
		 this.r = r ;
		 this.i = i ;
	 }
	 // Constructor 
	 public double  norm() {
		 return Math.sqrt(r * r  + i  * i );
	 }
}
