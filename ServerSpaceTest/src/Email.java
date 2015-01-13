// File Name SendEmail.java


import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

public class Email
{
	
	public Email(){}
	
	public Email(String rec, String sender, String serv)
	{
		String to = rec;
		String from = sender;
		String host = serv;
		
	}
	
	public Email(String [] rec, String sender, String serv)
	{
		String [] to = rec;
		String from = sender;
		String host = serv;
		
	}
	
	public void SendEmail(String  rec, String sender, String serv, String subject, String content)
	{
		    
		
		String to = rec;
		String from = sender;
		String host = serv;
		Date date = new Date();
			
		// Recipient's email ID needs to be mentioned.
		     

		// Sender's email ID needs to be mentioned
		    

		// Assuming you are sending email from localhost
		      

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.setProperty("mail.smtp.host", host);

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties);

		try
		{
		// Create a default MimeMessage object.
		MimeMessage message = new MimeMessage(session);

		// Set From: header field of the header.
		message.setFrom(new InternetAddress(from));

		// Set To: header field of the header.
		        
		         
		message.addRecipient(Message.RecipientType.TO,
		                                  new InternetAddress(to));
				
		// Set Subject: header field
		message.setSubject(subject);

		// Now set the actual message
		message.setText(content);

		// Send message
		Transport.send(message);
		System.out.println("Sent message successfully on: " + date.toString() + " To: " + to);
		}catch (MessagingException mex) 
			{
				mex.printStackTrace();
		    }	
	}
	
	public void sendEmails(String [] rec, String sender, String serv, String subject, String content)
	{
		int i = 0;
		while(i < rec.length)
		{
			SendEmail(rec [i], sender, serv, subject, content);
			i++;
		}
		
	}
}