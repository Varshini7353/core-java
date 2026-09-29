class FundsRunner{
	
	public static void main(String []args){
		
		System.out.println("Main Started");
		MutualFunds funds=new MutualFunds();
		
		funds.invest();
		funds.getMutualFundsdetails();
		System.out.println("Main ended");
		
	}
}
