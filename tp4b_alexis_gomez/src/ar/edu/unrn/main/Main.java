package ar.edu.unrn.main;

import ar.edu.unrn.libreriaexception.SmtpException;
import ar.edu.unrn.modelo.Empleado;
import ar.edu.unrn.modelo.GestionDeEmails;
import ar.edu.unrn.modelo.RepositorioEmpleados;
import ar.edu.unrn.persistencia.EnDiscoCargaEmpleados;
import ar.edu.unrn.serviciomail.ServicioEmails;

public class Main {

	public static void main(String[] args) {
		
		RepositorioEmpleados empleados= new EnDiscoCargaEmpleados();
		String archivo= "C:\\Users\\Alexis\\Desktop\\Empleados.txt";
		Empleado p1 = new Empleado("Alexis", "Gomez", "1999-12-27", "ralexisge@gmail.com");
		Empleado p2 = new Empleado("Miguel", "Esperanza", "2000-04-28", "m_esperanza@gmail.com");
		Empleado p3 = new Empleado("Maria", "Lopez", "1986-11-25", "lopezmaria@gmail.com");
		empleados.cargarEmpleados(p1,archivo);
		empleados.cargarEmpleados(p2,archivo);
		empleados.cargarEmpleados(p3,archivo);
		
		GestionDeEmails gestorEmails= new GestionDeEmails(new ServicioEmails(),new EnDiscoCargaEmpleados());
		
		try {
			gestorEmails.enviarEmailFelicitacion(archivo);
		} catch (SmtpException e) {
			System.out.println(e.getMessage());
		}
	}

}
