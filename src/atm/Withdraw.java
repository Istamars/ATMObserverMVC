/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Istamars
 */
public class Withdraw extends Transaction {
    private CashDispenser cashDispenser;
    private AccountDatabase accountDatabase;
    private Scanner scanner;
    
    public Withdraw(CashDispenser cd, AccountDatabase ad){
        cashDispenser = cd;
        accountDatabase = ad;
        scanner = new Scanner(System.in);
    }
    
    public void setTransactionAmount(){
        System.out.print("Withdraw Amount : ");
        double amount = scanner.nextDouble();
        super.setTransactionAmount(amount);
    }
    
    @Override
    public double getTransactionAmount(){
        return super.getTransactionAmount();
    }

    @Override
    public void doTransaction(String accNmbr) {
        this.setTransactionAmount();
        if(cashDispenser.getDispenserCash() > this.getTransactionAmount()){
            cashDispenser.dispenseCash(this.getTransactionAmount());
            accountDatabase.getAccount(accNmbr).decreaseBalance(this.getTransactionAmount());
        }
    }
}
