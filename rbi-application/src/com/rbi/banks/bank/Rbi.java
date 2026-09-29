package com.rbi.banks.bank;

public interface Rbi {

    public void kyc();
    public void openAccount();
    public void closeAccount();
    public void depositMoney();
    public void withdrawMoney();
    public void transferMoney();
    public void checkBalance();
    public void updateAccountDetails();
    public void verifyCustomer();
    public void issueDebitCard();
    public void blockDebitCard();
    public void activateDebitCard();
    public void issueCreditCard();
    public void blockCreditCard();
    public void approveLoan();
    public void rejectLoan();
    public void calculateInterest();
    public void updateInterestRate();
    public void checkKycStatus();
    public void updateKycDetails();
    public void generateBankStatement();
    public void processCheque();
    public void stopChequePayment();
    public void updateNominee();
    public void freezeAccount();
    public void unfreezeAccount();
}
