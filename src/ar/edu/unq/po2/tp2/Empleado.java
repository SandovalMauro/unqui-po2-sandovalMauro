package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private double sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, 
			LocalDate fechaDeNacimiento, double sueldoBasico) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}
	
	public int edad() {
		int edad = LocalDate.now().getYear() - this.getFechaDeNacimiento().getYear();
		if(this.getFechaDeNacimiento().getDayOfYear()> LocalDate.now().getDayOfYear()) {edad--;}
		return edad;
	}
	
	public abstract double sueldoBruto();
	
	public abstract double retenciones();
	
	public double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
}
