class BankAccountRunner {

    public static void main(String[] args) {

        // Object 1 - Savings Account
        SavingsAccount savings = new SavingsAccount();

        savings.accountNumber = 1234567890L;
        savings.accountHolderName = "Varshini";
        savings.balance = 25000;
        savings.interestRate = 6.5;

        System.out.println("----- Savings Account 1 -----");

        savings.getAccountDetails();
        savings.deposit(5000);
        savings.withdraw(2000);
        savings.calculateInterest();


        System.out.println("-----------------------------");


        // Object 2 - Savings Account
        SavingsAccount savings1 = new SavingsAccount();

        savings1.accountNumber = 987654321L;
        savings1.accountHolderName = "Abhi";
        savings1.balance = 50000;
        savings1.interestRate = 9.0;

        System.out.println("----- Savings Account 2 -----");

        savings1.getAccountDetails();
        savings1.deposit(10000);
        savings1.withdraw(5000);
        savings1.calculateInterest();


        System.out.println("-----------------------------");


        // Object 3 - Current Account
        CurrentAccount current = new CurrentAccount();

        current.accountNumber = 456789123L;
        current.accountHolderName = "ABC Traders";
        current.balance = 75000;
        current.overdraftLimit = 100000;

        System.out.println("----- Current Account -----");

        current.getAccountDetails();
        current.deposit(15000);
        current.withdraw(10000);
        current.displayOverdraftLimit();
    }
}