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
public class DepositSlot {
    private double depositSlotCash;
    private double maxDepositSlotCash;
    
    public DepositSlot(double amount, double maxAmount){
        depositSlotCash = amount;
        maxDepositSlotCash = maxAmount;
    }

    public double getMaxDepositSlotCash() {
        return maxDepositSlotCash;
    }

    public double getDepositSlotCash() {
        return depositSlotCash;
    }
    
    public void depositCash(double amount){
        depositSlotCash += amount;
    }
}
