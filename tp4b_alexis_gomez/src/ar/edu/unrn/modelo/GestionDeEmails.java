package ar.edu.unrn.modelo;

import java.util.ArrayList;

import ar.edu.unrn.libreriaexception.SmtpException;

public class GestionDeEmails {
	RepositorioEmails email;
	RepositorioEmpleados empleados;
	public GestionDeEmails(RepositorioEmails email, RepositorioEmpleados empleados) {
		super();
		this.email = email;
		this.empleados = empleados;
	}
	
	public boolean enviarEmailFelicitacion(String archivo) throws SmtpException {
		boolean x=false;
		ArrayList<Empleado> listaEmpleados=empleados.leerEmpleados(archivo);
		
		for(Empleado e: listaEmpleados) {
			if(e.cumpleaños()) {
				System.out.println("Se felicito a "+ e.nombre() + " "+ e.apellido());
				email.enviarEmailDeFelicitacion(e.email()); 
				x=true;
			}
		}
		return x;
	}
	
}
