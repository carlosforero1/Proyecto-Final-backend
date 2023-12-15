package com.proyecto.Correos;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class enviarCorreos {

	    private final String username;
	    private final String password;

	    public enviarCorreos(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    public void enviarCorreo(String destinatario, String asunto, String contenido) {
	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");

	        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	        });

	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(username));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
	            message.setSubject(asunto);
	            message.setText(contenido);

	            Transport.send(message);

	            System.out.println("Correo enviado con éxito.");

	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	    }
}

	 


