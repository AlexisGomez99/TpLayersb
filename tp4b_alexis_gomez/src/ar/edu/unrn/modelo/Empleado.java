package ar.edu.unrn.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Empleado implements Serializable{
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String email;
	public Empleado(String nombre, String apellido, String fechaNacimiento, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
	}
	
	public String nombre() {
		return nombre;
	}
	public String apellido() {
		return apellido;
	}
	public boolean cumpleaños() {
		boolean x=false;
		LocalDate hoy= LocalDate.now();
		LocalDate fecha= LocalDate.parse(fechaNacimiento);
		if(hoy.getDayOfMonth()== fecha.getDayOfMonth() && hoy.getMonthValue()== fecha.getMonthValue()) {
			
			x=true;
		}
		return x;
	}

	public String fecha() {
		return fechaNacimiento;
	}
	public String email() {
		return email;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", email=" + email + "]\n";
	}
	
	public boolean esIgual(Empleado empleado) {
		boolean x=false;
		if(nombre.equalsIgnoreCase(empleado.nombre())&& apellido.equalsIgnoreCase(empleado.apellido())
				&&fechaNacimiento.equalsIgnoreCase(empleado.fecha())&&email.equalsIgnoreCase(empleado.email())) {
			x=true;
		}
		
		
		return x;
	}
	
	
	

}
