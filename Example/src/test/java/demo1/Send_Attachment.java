package demo1;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Send_Attachment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EmailException {
        System.out.println("sending email");
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("D:\\FireballAutomation\\FireBallAutomation\\test-output\\emailable-report.html");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("TestNG Report");
        attachment.setName("QA");

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setSSLOnConnect(true);
        email.setAuthenticator(new DefaultAuthenticator("prashanthiece92@gmail.com", "shanthi&123"));
        email.setFrom("prashanthiece92@gmail.com");

        email.addTo("prashanthiece92@gmail.com");
        email.setSubject("Test NG Execution Report");
        email.attach(attachment);
        email.send();
        System.out.println("email sent");
    }
}
