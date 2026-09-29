class HealthInsurance extends Insurance{
	
	@Override
	public double calculatePremium(){
		
		System.out.println("Insurance premium payed");
		return 20000.00;
	}
}