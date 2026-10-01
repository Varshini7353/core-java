package com.rbi.banks.bank;

public class BankofIndia implements Rbi{

    @Override
    public void kyc() {
        System.out.println("kyc process completed");
    }

    @Override
    public void openAccount(){
        System.out.println("Open a new account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Close account");
    }

    @Override
    public void depositMoney() {
        System.out.println("Deposit Money ");
    }

    @Override
    public void withdrawMoney(){
        System.out.println("Withdraw money");
    }

    @Override
    public void transferMoney(){
        System.out.println("Transfer money");
    }

    @Override
    public void checkBalance(){
        System.out.println("Check balance");
    }

    @Override
    public void updateAccountDetails(){
        System.out.println("Update the account details");
    }

    @Override
    public void verifyCustomer(){
        System.out.println("Account verified");
    }

    @Override
    public void issueDebitCard(){
        System.out.println("Issue the debit card");
    }

    @Override
    public void blockDebitCard() {
        System.out.println("Block debit card");
    }

    @Override
    public void activateDebitCard() {
        System.out.println("Activate debit card");
    }

    @Override
    public void issueCreditCard() {
        System.out.println("Issue credit card");
    }

    @Override
    public void blockCreditCard() {
        System.out.println("Block credit card");
    }

    @Override
    public void approveLoan() {
        System.out.println("Loan approved");
    }

    @Override
    public void rejectLoan() {
        System.out.println("Loan rejected");
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest caluclated");
    }

    @Override
    public void updateInterestRate() {
        System.out.println("Interest updated");
    }

    @Override
    public void checkKycStatus() {
        System.out.println("Check kyc status");
    }

    @Override
    public void updateKycDetails() {
        System.out.println("Update kyc details");
    }

    @Override
    public void generateBankStatement() {
        System.out.println("Generate bank statement");
    }

    @Override
    public void processCheque() {
        System.out.println("Process cheque");
    }

    @Override
    public void stopChequePayment() {
        System.out.println("Stop cheque payment");
    }

    @Override
    public void updateNominee() {
        System.out.println("update nominee");
    }

    @Override
    public void freezeAccount() {
        System.out.println("Freeze account");
    }

    @Override
    public void unfreezeAccount() {
        System.out.println("Unfreeze account");
    }
}
