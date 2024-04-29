package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	//crear atributo arraylist para numeros
	private List<Integer> numeros = new ArrayList<Integer>();

	public List<Integer> getNumeros() {
		return numeros;
	}
	
	public void addNumber(int numero) {
		this.numeros.add(numero);
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public int contarPares() {
		return (int)this.numeros.stream().filter(num -> this.esPar(num)).count();
	}
	
	public int contarImpares() {
		return (int)this.numeros.stream().filter(num -> !this.esPar(num)).count();
	}
	
	public int contarMultiplos(int multiplo) {
		return (int)this.numeros.stream().filter(num -> !this.esMultiplo(num,multiplo)).count();
	}
	
	private boolean esMultiplo(int num,int multiplo) {
		return num%multiplo == 0;
	}
	private boolean esPar(int num) {
		return this.esMultiplo(num, 2);
	}
}
