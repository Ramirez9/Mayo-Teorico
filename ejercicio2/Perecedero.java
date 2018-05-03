package ejercicio2;

import java.time.LocalDate;

public class Perecedero extends Producto{

	private LocalDate fecha;
	public Perecedero(String descripcion, LocalDate fecha) {
		super(descripcion);
		this.fecha = fecha;
	}

}
