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
public class AccountDatabase {
    private final Account[] accounts;
    
    public AccountDatabase(){
        accounts = new Account[2];
        
        accounts[0] = new Account("12345", "54321", 1000.00, 1200.00);        
        accounts[1] = new Account("67890", "09876", 825.00, 1025.00);
    }
    
    public boolean authenticateUser(String accNmbr, String aPin){
        for(Account key : accounts){
            if (key.getAccountNumber().equals(accNmbr)) {
                if(key.getPin().equals(aPin)) return true;
            }
        }
        
        return false;
    }
    
    public Account getAccount(String accNmbr){
        for(Account key : accounts){
            if(key.getAccountNumber().equals(accNmbr)) return key;
        }
        return null;
    }
}
