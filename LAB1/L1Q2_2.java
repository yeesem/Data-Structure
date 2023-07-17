/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class L1Q2_2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Data Structure\\text2.txt";
        String content = "";
        String con = "";
        int numChar = 0;
        try{
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            while((con=read.readLine())!=null){
                String [] tempt = con.split(", ");
                numChar += tempt.length;
                for (int i = 0; i < tempt.length; i++) {
                    content+= tempt[i] + " ";
                }
                content+="\n";
            }
            read.close();
        }
        catch(FileNotFoundException e){System.out.println("File Not Found");}
        catch(IOException e){System.out.println("Error occurs in ReadFile");}
        
        System.out.println("Number of Characters : " + numChar);
        System.out.println("Content in text file : ");
        System.out.println(content);
    }
}
