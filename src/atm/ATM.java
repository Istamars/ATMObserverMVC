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
public class ATM {
    private Scanner scanner;
    private AccountDatabase accountDatabase;
    private DepositSlot depositSlot;
    private CashDispenser dispenser;
    private static final int unitNumber = 109;
    private int menu;
    private boolean isAuth = false;
    private double amount;
    private String accountNumber, pin, transactionDate;
    
    public ATM(){
        scanner             = new Scanner(System.in);
        accountDatabase     = new AccountDatabase();
        depositSlot         = new DepositSlot(300,3000);
        dispenser           = new CashDispenser(2000);
    }
    
    public void enterAccount(){
        while(!isAuth){
            System.out.print("ATM Observer\nYour Account Number : ");
            accountNumber = scanner.next();
            System.out.print("Your PIN : ");
            pin = scanner.next();

            isAuth = accountDatabase.authenticateUser(accountNumber,pin);
        }
        
        this.chooseTransaction();
    }
    
    public void viewBalance(){
        System.out.println("Your balance : $" + this.accountDatabase.getAccount(accountNumber).getAvailableBalance() );
    }
    
    public void createTransaction(int menu){
        Transaction temp;
        switch(menu){
            case 1 : this.viewBalance();
                break;
            case 2 :
                temp = new Withdraw(dispenser,accountDatabase);
                temp.doTransaction(accountNumber);
                break;
            case 3 : 
                temp = new Deposit(depositSlot,accountDatabase);
                temp.doTransaction(accountNumber);
                break;
            case 4 : 
                temp = new Transfer(accountDatabase);
                temp.doTransaction(accountNumber);
                break;
            case 5 : isAuth = false;
                break;
        }
    }
    
    public void chooseTransaction(){
        System.out.println("ATM Observer\n1. View Balance\n2. Withdraw\n3. Deposit\n4. Transfer\n5. Exit");
        System.out.print("Choose Action : ");
        menu = scanner.nextInt();
        this.createTransaction(menu);
        this.enterAccount();
    }
}
