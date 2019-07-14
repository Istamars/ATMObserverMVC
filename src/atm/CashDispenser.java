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
public class CashDispenser {
    private double dispenserCash;
    
    public CashDispenser(double amount){
        dispenserCash = amount;
    }

    public double getDispenserCash() {
        return dispenserCash;
    }
    
    public void dispenseCash(double amount){
        dispenserCash -= amount;
    }
}
