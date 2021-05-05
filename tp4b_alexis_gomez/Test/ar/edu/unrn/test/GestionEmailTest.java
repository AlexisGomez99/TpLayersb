package ar.edu.unrn.test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import ar.edu.unrn.libreriaexception.SmtpException;
import ar.edu.unrn.modelo.Empleado;
import ar.edu.unrn.modelo.GestionDeEmails;
import ar.edu.unrn.modelo.RepositorioEmpleados;
import ar.edu.unrn.persistencia.EnDiscoCargaEmpleados;
import ar.edu.unrn.serviciomail.ServicioEmails;

public class GestionEmailTest {

	@Test
	public void verificarQueSeFelicitoALaPersonaQueCumpleAñosHoy() {
		LocalDate hoy= LocalDate.now();
		Empleado p1 = new Empleado("Alexis", "Gomez", hoy.toString(), "ralexisge@gmail.com");
		String archivo= "C:\\Users\\Alexis\\Desktop\\EmpleadosTest.txt";
		RepositorioEmpleados empleados= new EnDiscoCargaEmpleados();
		empleados.cargarEmpleados(p1,archivo);
		GestionDeEmails gestorEmails= new GestionDeEmails(new ServicioEmails(), new EnDiscoCargaEmpleados());
		try {
			assertTrue(gestorEmails.enviarEmailFelicitacion(archivo));
		} catch (SmtpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
