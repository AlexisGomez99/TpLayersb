package ar.edu.unrn.modelo;

import java.util.ArrayList;

public interface RepositorioEmpleados {
	
	ArrayList<Empleado> leerEmpleados(String archivo);
	
	boolean cargarEmpleados(Empleado empleado,String archivo);

}
