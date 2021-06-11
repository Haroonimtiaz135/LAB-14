/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.o_handling;
import java.io.*;
import java.util.*;




public class File_input {
    public static void main(String[]arg){
    
           
        Account a0= new Account("001", 10000);
        Account a1= new Account("002", 56000);
        Account a2= new Account("003", 700);
        Account a3= new Account("004", 50000);
        Account a4= new Account("005", 67000);
        Account a5= new Account("006", 23000);
        Account a6= new Account("007", 34560);
        Account a7= new Account("008", 90000);
        Account a8= new Account("009", 78000);
        Account a9= new Account("010", 35000);
        
        
        try{
            ObjectOutputStream obj = new  ObjectOutputStream(new FileOutputStream("accounts"));
             obj = new  ObjectOutputStream(new FileOutputStream("accounts"));
            
            obj.writeObject(a0);
            obj.writeObject(a1);
            obj.writeObject(a2);
            obj.writeObject(a3);
            obj.writeObject(a4);
            obj.writeObject(a5);
            obj.writeObject(a6);
            obj.writeObject(a7);
            obj.writeObject(a8);
            obj.writeObject(a9);
            obj.close();
            
            
            if (obj!=null){
                System.out.println("data saved successfully");
            }
            
        }
        
        catch (IOException e){
            System.out.print("problem with file");
        }
    

    try{   
        
    
    ObjectInputStream read = new ObjectInputStream(new FileInputStream("accounts"));
    Account b0 = (Account)read.readObject();
    Account b1 = (Account)read.readObject();
    Account b2 = (Account)read.readObject();
    Account b3 = (Account)read.readObject();
    Account b4 = (Account)read.readObject();
    Account b5 = (Account)read.readObject();
    Account b6 = (Account)read.readObject();
    Account b7 = (Account)read.readObject();
    Account b8 = (Account)read.readObject();
    Account b9 = (Account)read.readObject();
    
    
    
     
    
     
    System.out.println(b6.balance_inquiry());
    }
    
    catch (ClassNotFoundException ex) {
ex.printStackTrace();
}
    
    catch (IOException e){
            System.out.print("problem with file");
        }
    }
}

    
      
       


    
    
