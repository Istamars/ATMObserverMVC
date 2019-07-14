/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Istamars
 */
public class Account {
    private String accountNumber;
    private String pin;
    private final Balance balance;
    
    public Account(String accNmbr, String aPin, double avBlnc, double ttlBlnc){
        accountNumber   = accNmbr;
        pin             = aPin;
        balance         = new Balance(avBlnc,ttlBlnc);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getAvailableBalance() {
        return this.balance.getAvailableBalance();
    }
    
    public double getTotalBalance() {
        return this.balance.getTotalBalance();
    }
    
    public void increaseBalance(double amount){
        this.balance.increaseBalance(amount);
    }
    
    public void decreaseBalance(double amount){
        this.balance.decreaseBalance(amount);
    }
}
