package ar.edu.unrn.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import ar.edu.unrn.modelo.Empleado;
import ar.edu.unrn.modelo.RepositorioEmpleados;

public class EnDiscoCargaEmpleados implements RepositorioEmpleados{
	


	@Override
	public ArrayList<Empleado> leerEmpleados(String archivo) {
		ArrayList<Empleado> empleados= new ArrayList<Empleado>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
			
			
			Empleado aux = (Empleado) ois.readObject();
			while (aux!=null)
			{
				empleados.add(aux);
			    aux = (Empleado) ois.readObject();
			}
			ois.close();
		} catch (IOException e) {		
		} catch (ClassNotFoundException e) {
			System.out.println("No existe el fichero.");
		}
		
		return empleados;
	}

	@Override
	public boolean cargarEmpleados(Empleado empleado, String archivo) {
		boolean x=false;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
			oos.writeObject(empleado);
			oos.close();
			x=true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	return x;
	}
	
}


