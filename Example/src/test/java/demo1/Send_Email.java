package demo1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Send_Email
{

public void sendMAil() throws EmailException
{
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("prashanthiece92@gmail.com", "shanthi&123"));
	email.setSSLOnConnect(true);
	email.setFrom("prashanthiece92@gmail.com");
	email.setSubject("TestMail");
	email.setMsg("This is a test mail ... :-)");
	email.addTo("prashanthiece92@gmail.com");
	email.send();
	System.out.println("-------- EMAIL SENT ------");
}
}
