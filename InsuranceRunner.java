class InsuranceRunner{
	
	public static void main(String []aaa){
		
		Insurance insurance=new Insurance();
		insurance.claimInsurance();
		insurance.calculatePremium();

		System.out.println("------------------------------");
		
		Insurance healthInsurance=new HealthInsurance();
		healthInsurance.claimInsurance();
		healthInsurance.calculatePremium();
	}
}