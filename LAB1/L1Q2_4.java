/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.io.*;
public class L1Q2_4 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Data Structure\\text4.txt";
        int numChar = 0;
        String alpha = "";
        String num = "";
        String con = "";
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            while((con=read.readLine())!=null){
                char [] tempt = con.toCharArray();
                numChar+=tempt.length;
                for (int i = 0; i < tempt.length; i++) {
                    if(Character.isAlphabetic(tempt[i]))
                       alpha += tempt[i];
                    else
                       num += tempt[i];
                }
            }
            read.close();
        } 
        catch (FileNotFoundException e) {System.out.println("File Not Found");}
        catch (IOException e) {System.out.println("Error occurs in ReadFile");}
        System.out.println("Number of character : " + numChar);
        System.out.println("Alphabet : " + alpha);
        System.out.println("Number   : " + num);
    }
}
