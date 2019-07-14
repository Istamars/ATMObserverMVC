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
public class Balance {
    
    private double  availableBalance;
    private double  totalBalance;
    
    public Balance(double avBlnc, double ttlBlnc) {
        availableBalance    = avBlnc;
        totalBalance        = ttlBlnc;
    }
    
    public double getAvailableBalance(){
        return availableBalance;
    }
    
    public double getTotalBalance(){
        return totalBalance;
    }
    
    public void increaseBalance(double amount){
        availableBalance    += amount;
        totalBalance        += amount;
    }
    
    public void decreaseBalance(double amount){
        availableBalance    -= amount;
        totalBalance        -= amount;
    }
    
}
