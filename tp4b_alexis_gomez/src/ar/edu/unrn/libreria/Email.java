package ar.edu.unrn.libreria;

import ar.edu.unrn.libreriaexception.SmtpException;

public class Email {
	public String destinatarioEmail;
	public String tituloEmail;
	public String cuerpoEmail;

	public Email(String destinatarioEmail, String tituloEmail, String cuerpoEmail) {
		this.destinatarioEmail = destinatarioEmail;
		this.tituloEmail = tituloEmail;
		this.cuerpoEmail = cuerpoEmail;
	}

	
	public String destinatarioEmail() {
		return destinatarioEmail;
	}


	public String tituloEmail() {
		return tituloEmail;
	}


	public String cuerpoEmail() {
		return cuerpoEmail;
	}


	public void enviar() throws SmtpException {
//conectar con el servidor SMTP para el envio
//Si algo sale mal, se lanza una SmtpException
//Si todo sale bien
		System.out.println("Se envió el email correctamente");
	}
}