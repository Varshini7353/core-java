class BankAccount {

    public BankAccount(){
		System.out.println("BankAccount cons invoked");
	}
	
	double balance;
	public double getBalance(){
		return balance;
	}
	
	public void credit(double amount){
		System.out.println("Credit intiated");
		if(amount>0)
			balance=balance+amount;
		else
			System.out.println("invalid amount");
			System.out.println("Credit successfull");
	}
	
	public void debit(double amount){
		System.out.println("debit intiated");
		if(amount<=balance)
			balance=balance-amount;
		else
			System.out.println("insufficient balance");
			System.out.println("debit successfull");
	}
	
	public void transfer(BankAccount receipientAccount,double amount){
		System.out.println("");
		System.out.println("Transfer intiated");
		this.debit(amount);
		receipientAccount.credit(amount);
		System.out.println("transfer successfull");
	}
}
	