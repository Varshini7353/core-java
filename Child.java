class Child  extends Parent{
	
	@Override
	public double doBusiness(){
		super.doBusiness();
		System.out.println("Travel Buiness");
		return 2000.00;
	}
		
		public void service(){
		System.out.println("private job");
	
	}
}