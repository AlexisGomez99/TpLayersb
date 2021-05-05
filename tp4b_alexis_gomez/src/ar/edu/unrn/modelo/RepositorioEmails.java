package ar.edu.unrn.modelo;

import ar.edu.unrn.libreriaexception.SmtpException;

public interface RepositorioEmails {

	void enviarEmailDeFelicitacion(String email) throws SmtpException;

}
