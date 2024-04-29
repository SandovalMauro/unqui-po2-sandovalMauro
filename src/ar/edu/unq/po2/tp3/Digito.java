package ar.edu.unq.po2.tp3;

public class Digito {

	public int cantidadDigitosPares(int[] numeros) {
		int numConMayorPares = numeros[0];
		//int suma = 0;
		for (int numero:numeros) {
			numConMayorPares = this.elNumeroConMasPares(numConMayorPares, numero);
		}
		return numConMayorPares;
	}
	
	private int elNumeroConMasPares(int numero1, int numero2) {
		int mayor;
		if(this.digitosPares(numero1)>=this.digitosPares(numero2)) {
			mayor = numero1;}
		else {
			mayor =numero2;}
		
		return mayor;
	}
	
	private int digitosPares(int numero) {
		int contador = 0;
		int num = numero;
		
		while(num>1) {
			if(num%2==0) {contador++;}
			num/=10;
		}
		return contador;
	}
}
