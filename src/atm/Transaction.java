/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Istamars
 */

public abstract class Transaction {
    private double transactionAmount;
    
    public abstract void doTransaction(String accNmbr);
    
    public void setTransactionAmount(double amount){
        transactionAmount = amount;
    }
    
    public double getTransactionAmount(){
        return transactionAmount;
    }
    
    public String getCurrentDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	
        return dateFormat.format(date);
    }
}
