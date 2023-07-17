/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.util.ArrayList;
import java.util.Date;
public class Account1 extends Account{
    private String name;
    private ArrayList<Transaction>transaction = new ArrayList<>();
            
    public Account1(int id,double balance,double interestRate,String name){
        super(id,balance,interestRate);
        this.name = name;
    }
    
    public void withdraw(double amount,String description){
        super.setBalance(super.getBalance()-amount);
        transaction.add(new Transaction('W',amount,super.getBalance(),description));
    }
    
    public void deposit(double amount,String description){
        super.setBalance(super.getBalance()+amount);
        transaction.add(new Transaction('D',amount,super.getBalance(),description));
    }
    
    public void showAccountSummary(){
        System.out.printf("=======================\nAccount summary for %s\n=======================\nBalance: $%s\nInterest Rate: %s%s\n\n",this.name,
        super.getBalance(),super.getMonthlyInterestRate(),"%");
        
        for(Transaction tempt : transaction){
            System.out.println(tempt.getTransactionData());
        }
    }
    
    public static void main(String[] args) {
        Account1 acc = new Account1(1122,1000,1.5,"Sem");
        acc.withdraw(500,"Tution");
        acc.withdraw(200,"Brought Earphone");
        acc.deposit(500,"Salary");
        acc.showAccountSummary();
        
    }
}

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type,double amount,double balance,String description){
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public String getTransactionData(){
        return String.format("Transaction on %s\nType: %s\nAmount: %s\nBalance: %s\nDescription: %s\n",
                             this.date.toString(),(this.type=='W')? "Withdraw" : "Deposit",this.amount,this.balance,this.description);
    }
}