package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado,double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecio() {
		return super.getPrecio() * this.descuento;
	}
}
