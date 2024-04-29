package ar.edu.unq.po2.tp2;

import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibos;

	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public double totalSueldosNetos() {
		return 0;
	}
	
	public double totalSueldosBrutos() {
		return 0;
	}
	
	public double totalRetenciones() {
		return 0;
	}
	
	public void liquidarSueldos() {
		
	}
}
