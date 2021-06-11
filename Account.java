/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.o_handling;
import java.io.*;

/**
 *
 * @author g
 */
public class Account implements Serializable
{
    
    public String account_num;
    public int balance;
    
    public Account(String account_num, int balance){
        
        this.balance = balance;
        this.account_num = account_num;
        
    }
    
    public int withdraw(String account_num, int ammount){
        
        return this.balance-ammount;
    }
    
    public int deposit(String account_num, int ammount){
        
        return this.balance+ammount;
    }
    
    public int transfer(String account_num, int ammount){
        
        return this.balance-ammount;
    }
    
    public int balance_inquiry(){
        return this.balance;
    }
    
}
