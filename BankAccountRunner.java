class BankAccountRunner {

    public static void main(String[] args) {

       BankAccount varshaBankAccount=new BankAccount();
	   
	   double balance=varshaBankAccount.getBalance();
	   System.out.println("Available balance:"+balance);
	   
	   varshaBankAccount.credit(50000.00);
	   balance=varshaBankAccount.getBalance();
	   System.out.println("Available balance:"+balance);
	   
	   varshaBankAccount.debit(20000.00);
	   balance=varshaBankAccount.getBalance();
	   System.out.println("Available balance:"+balance);
	   
	   
	   
	   
	   System.out.println(" ");
	   SavingsAccount momaccount=new SavingsAccount();
	   
	   balance=momaccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   momaccount.credit(60000.00);
	   balance=momaccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   momaccount.debit(30000.00);
	   balance=momaccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	 
	   
	   
	   System.out.println(" ");
	   SavingsAccount momaccount1=new SavingsAccount();
	   
	   balance=momaccount1.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   momaccount1.credit(40000.00);
	   balance=momaccount1.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   momaccount1.debit(20000.00);
	   balance=momaccount1.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   
	    System.out.println(" ");
	   SavingsAccount abhiAccount=new SavingsAccount();
	   
	   balance=abhiAccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   abhiAccount.credit(40000.00);
	   balance=abhiAccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   abhiAccount.debit(20000.00);
	   balance=abhiAccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   
	  
	   System.out.println(" ");
	   CurrentAccount dadaccount=new CurrentAccount();
	   
	   balance=dadaccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   dadaccount.credit(70000.00);
	   balance=dadaccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   dadaccount.debit(40000.00);
	   balance=dadaccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   
	   System.out.println(" ");
	   CurrentAccount currentAccount=new CurrentAccount();
	   
	   balance=currentAccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   currentAccount.credit(50000.00);
	   balance=currentAccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   currentAccount.debit(25000.00);
	   balance=currentAccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   
	    System.out.println(" ");
	   CurrentAccount harshaAccount=new CurrentAccount();
	   
	   balance=harshaAccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   harshaAccount.credit(50000.00);
	   balance=harshaAccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   harshaAccount.debit(25000.00);
	   balance=harshaAccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   
	   
	   
	   
	   //polymorphism
	   momaccount.transfer(momaccount1,10000);
	    balance=momaccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   balance=momaccount1.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   
	   currentAccount.transfer(momaccount,2000);
	   balance=currentAccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   balance=momaccount.getBalance();
	   System.out.println("Available balance:"+balance);
	   
	   
	   
	   harshaAccount.transfer(varshaBankAccount,200);
	   balance=harshaAccount.getBalance();
	   System.out.println("Available balance in CurrentAccount:"+balance);
	   
	   balance=varshaBankAccount.getBalance();
	   System.out.println("Available balance:"+balance);
	   
	   abhiAccount.transfer(momaccount,800);
	   balance=abhiAccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   balance=momaccount.getBalance();
	   System.out.println("Available balance in SavingsAccount:"+balance);
	   
	   
	   
	   
	}
}

	   