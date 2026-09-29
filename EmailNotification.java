class EmailNotification extends Notification{
	
	@Override
	public String displayNotification(){
		
		System.out.println("Notification disappered");
		return "mailDetails";
	}
}