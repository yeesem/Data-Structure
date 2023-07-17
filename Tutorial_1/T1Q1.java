/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_1;

public class T1Q1 {
    public static void main(String[] args) {
//        Telephone [] tele ={new Telephone("03","79676300"),
//                             new Telephone("03","79676301"), 
//                             new Telephone("03","79676302"), 
//                             new Telephone("03","79676303"), 
//                             new Telephone("03","79676304")}; 

        Telephone [] tele = new Telephone[5];
        
        for (int i = 0; i < tele.length; i++) {
            tele[i] = new Telephone("03","7967630" + i);
        }
    
        for(Telephone tempt : tele){
            System.out.println(tempt.makeFullNumber());
        }
    }
}

class Telephone{
    String areaCode = "";
    String number = "";
    static int numberOfTelephoneObject;
    
    public Telephone(String areaCode,String number){
        this.areaCode = areaCode;
        this.number = number;
        //Track the number of Telephone object created
        numberOfTelephoneObject++;
    }
    
    public String getAreaCode(){return areaCode;}
    public String getNumber(){return number;}
    
    public String makeFullNumber(){
        return getAreaCode()+"-"+getNumber();
    }
}