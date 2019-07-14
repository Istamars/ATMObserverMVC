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
public class Transfer extends Transaction {
    private CashDispenser cashDispenser;
    private AccountDatabase accountDatabase;
    private Scanner scanner;
    
    public Transfer(AccountDatabase ad){
        accountDatabase = ad;
        scanner = new Scanner(System.in);
    }
    
    public void setTransactionAmount(){
        System.out.print("Transfer Amount : ");
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
        System.out.print("Destination Account : ");
        String accNmbrDstn = scanner.next();
        if(accountDatabase.getAccount(accNmbrDstn) != null){
            accountDatabase.getAccount(accNmbrDstn).increaseBalance(this.getTransactionAmount());
            accountDatabase.getAccount(accNmbr).decreaseBalance(this.getTransactionAmount());
        }
    }
}
