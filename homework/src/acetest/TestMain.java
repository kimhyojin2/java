package acetest;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class TestMain {
	public static void main(String[] args) {
		String host = "smtp.naver.com";
		String user = "네이버아이디";
		String password = "패스워드";
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 465);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.naver.com");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(user, password);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("메일주소"));
			message.setSubject("[테스트]메일제목");
			message.setText("테스트 입니다.");
			Transport.send(message);
			System.out.println("Success Message Send");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
