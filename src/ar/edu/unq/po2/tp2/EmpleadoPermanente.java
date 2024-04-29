package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			double sueldoBasico) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sueldoBruto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double retenciones() {
		// TODO Auto-generated method stub
		return 0;
	}

}
