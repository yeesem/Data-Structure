/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.text.SimpleDateFormat;
import java.util.Date;
public class L1Q3 {
    public static void main(String[] args) {
        Account a = new Account(1122,20000,4.5);
        a.withdraw(2500);
        a.deposit(3000);
    }
}

class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    public Account(){}
    
    public Account(int id,double balance,double interestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = interestRate;
        dateCreated = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E,MMMM dd/MM/YYYY - hh:mma");
        System.out.println("Date account created : " + formatter.format(dateCreated));
        System.out.println("ID : " + id);
        System.out.println("Balance : RM " + balance);
        System.out.println("Annual Interest Rate : " + annualInterestRate + "%\n");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate/100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12/100;
    }
    
    public double getMonthlyInterest(){
        return balance*(annualInterestRate/12/100);
    }
    
    public void withdraw(double amount){
        System.out.println("Balance : RM " + balance);
        balance -= amount;
        System.out.println("Balance after withdraw: RM " + balance + "\n");
    }
    
    public void deposit(double amount){
        System.out.println("Balance : RM " + balance);
        balance += amount;
        System.out.println("Balance after deposit: RM " + balance + "\n");
    }
}

