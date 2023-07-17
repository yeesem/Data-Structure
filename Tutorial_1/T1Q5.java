/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_1;

public class T1Q5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(20);
        System.out.println(account.withdraw(1000));
    }
}

interface Account{
    public int deposit(int cash);
    public boolean withdraw(int cash);
}

class BankAccount implements Account{
    int balance;
    
    public BankAccount(int balance){
        this.balance = balance;
    }
    
    @Override
    public int deposit(int cash){
        return balance + cash;
    }
    
    @Override
    public boolean withdraw(int cash){
        if(cash > balance) return false;
        this.balance -= cash;
        return true;
    }
}
