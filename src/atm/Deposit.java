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
public class Deposit extends Transaction{
    private DepositSlot depositSlot;
    private AccountDatabase accountDatabase;
    private Scanner scanner;
    
    public Deposit(DepositSlot cd, AccountDatabase ad){
        depositSlot = cd;
        accountDatabase = ad;
        scanner = new Scanner(System.in);
    }
    
    public void setTransactionAmount(){
        System.out.print("Deposit Amount : ");
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
        if( (depositSlot.getMaxDepositSlotCash() - depositSlot.getDepositSlotCash()) > this.getTransactionAmount()){
            depositSlot.depositCash(this.getTransactionAmount());
            accountDatabase.getAccount(accNmbr).increaseBalance(this.getTransactionAmount());
        }
    }    
}
