package com.github.zia;

public class BankAccount {
    private float accountBalance;

    public BankAccount(float startingAmount) {
        this.accountBalance = startingAmount;
    }
    public float getBalance(){
        return accountBalance;
    }
    public float deposit (float depositAmount){
        if (depositAmount > 0){
            this.accountBalance = accountBalance + depositAmount;
            System.out.println("You recieved "+(int)depositAmount+" your balance is "+(int)accountBalance);
            return accountBalance;
        } else {
            return 0;
        }
    }
    public float withdraw (float withdrawAmount)throws InsufficientBalanceException {
        if (withdrawAmount<=accountBalance){
            this.accountBalance = accountBalance - withdrawAmount;
            System.out.println("You withdraw "+(int)withdrawAmount+" your balance is "+(int)accountBalance);
            return accountBalance;
        } else {
            throw new InsufficientBalanceException("You tried to withdraw " + withdrawAmount + " but balance is " + accountBalance);
        }
    }
    public static void main (String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(500);
        BankAccount account3 = new BankAccount(2000);
        System.out.println("[====Account 1 details====]");
        account1.deposit(200);
        account1.withdraw(500);
       try {
            account1.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Account 1 balance is: " +(int)account1.getBalance());
        System.out.println("[====Account 2 details====]");
        account2.deposit(130);
        account2.withdraw(200);
       try {
            account2.withdraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Account 2 balance is: " +(int)account2.getBalance());
        System.out.println("[====Account 3 details====]");
        account3.deposit(130);
        account3.withdraw(1000);
        try {
            account3.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Account 3 balance is: " +(int)account3.getBalance());
    }
}