package ar.edu.unrn.serviciomail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.edu.unrn.libreria.Email;
import ar.edu.unrn.libreriaexception.SmtpException;
import ar.edu.unrn.modelo.RepositorioEmails;




public class ServicioEmails implements RepositorioEmails{
	
	@Override
	public void enviarEmailDeFelicitacion(String email) throws SmtpException{
		
		new Email(email,"Felicidades!",
				"Buenos dias, por parte de nuestra empresa le deseamos un feliz cumpleaños.").enviar();	
	}
}