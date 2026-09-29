class ApplicationRunner{
	
	public static void main(String []a){
		
		Application appli=new Application();
		appli.streaming();
		appli.getPremium();
		
		System.out.println("------------------------");
		
		Application application=new Spotify();
		application.streaming();
		application.getPremium();
		
		
	}
}