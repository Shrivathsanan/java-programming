/*** Dynamic method Dispatch */

import java.util.*;

interface Notifiable{
	void sendMessage(String recipient,String message);
}
class EmailNotification implements Notifiable{
	public void sendMessage(String recipient,String message) {
		System.out.println("--- Email Notification ---");
		System.out.println("Sending Email to "+recipient);
		System.out.println("Message: "+message);
		
	}
}
	class SMSNotification implements Notifiable{
		public void sendMessage(String recipient,String message) {
			System.out.println("--- SMS Notification ---");
			System.out.println("Sending SMS to "+recipient);
			System.out.println("Message: "+message);
			
		}
}
	class PushNotification implements Notifiable{
		public void sendMessage(String recipient,String message) {
			System.out.println("--- Push Notification ---");
			System.out.println("Sending Push Notification to "+recipient);
			System.out.println("Message: "+message);
			
		}
}
	class Notification {
		public static void main(String args[]) {
			Scanner c = new Scanner(System.in);
			String str1,str2,str3,str4,str5,str6;
			System.out.println("Enter recipient details to email: ");
			str1=c.next();
			System.out.println("Enter message to email: ");
			str2=c.next();
			System.out.println("Enter recipient details to sms: ");
			str3=c.next();
			System.out.println("Enter message to sms: ");
			str4=c.next();
			System.out.println("Enter recipient details to push notification: ");
			str5=c.next();
			System.out.println("Enter message to push notification: ");
			str6=c.next();
			Notifiable email = new EmailNotification();
			Notifiable sms = new SMSNotification();
			Notifiable push = new PushNotification();
			email.sendMessage(str1, str2);
			sms.sendMessage(str3, str4);
			push.sendMessage(str5, str6);
		}
	}