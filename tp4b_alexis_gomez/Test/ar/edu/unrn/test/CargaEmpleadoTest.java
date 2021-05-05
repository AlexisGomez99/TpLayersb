package ar.edu.unrn.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unrn.modelo.Empleado;
import ar.edu.unrn.modelo.RepositorioEmpleados;
import ar.edu.unrn.persistencia.EnDiscoCargaEmpleados;

public class CargaEmpleadoTest {
	
	@Test
	public void verificarQueSeIngresanPersonasAlArchivo() {
		Empleado p1 = new Empleado("Alexis", "Gomez", "1999-12-27", "ralexisge@gmail.com");
		String archivo= "C:\\Users\\Alexis\\Desktop\\EmpleadosTest.txt";
		RepositorioEmpleados empleados= new EnDiscoCargaEmpleados();
		assertTrue(empleados.cargarEmpleados(p1,archivo));
		
	}
	@Test
	public void verificarQueSeLeePersonasDelArchivo() {
		Empleado p1 = new Empleado("Alexis", "Gomez", "1999-12-27", "ralexisge@gmail.com");
		String archivo= "C:\\Users\\Alexis\\Desktop\\EmpleadosTest.txt";
		RepositorioEmpleados empleados= new EnDiscoCargaEmpleados();
		empleados.cargarEmpleados(p1,archivo);
		assertTrue(p1.esIgual(empleados.leerEmpleados(archivo).get(0))); 
		
	}

}
