class NotificationRunner{
	
	public static void main(String []args){
		
		Notification email=new Notification();
		email.sendNotification();
		email.displayNotification();
		
		System.out.println("------------------------------------");
		
		Notification emailnotification=new EmailNotification();
		emailnotification.sendNotification();
		emailnotification.displayNotification();
	}
}