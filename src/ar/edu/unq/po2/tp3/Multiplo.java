package ar.edu.unq.po2.tp3;

public class Multiplo {
	
	public int mayorMultiploDeXY(int x, int y) {
		int mcm = this.mcm(x, y);
		int multiplo;
		
		if(mcm>1000) {
			multiplo = -1;
		}
		else {
			multiplo = (1000/mcm)*mcm;
		}
		return multiplo; 
	}
	
	private int mcm(int num1, int num2) {
		int numMenor = this.numeroMayorEntre(num1,num2);
		int numMayor = this.numeroMenorEntre(num1,num2);
		int resultado = numMayor;
		
		while ((resultado%numMenor) !=0) {
			resultado+=numMayor;
		}
		return resultado;
	}
	private int numeroMenorEntre(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1<=num2)? num1:num2; // condicion ? valor1:valor2  esto es un if else
	}

	private int numeroMayorEntre(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1>=num2)? num1:num2;
	}
}
