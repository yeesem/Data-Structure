/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class L1Q1_1 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Data Structure\\Oon Yee Sem_S2143263.txt";
        System.out.println(readFile(fileName));
    }
    
    public static String readFile(String fileName){
        String content = "";
        String con = "";
        try{
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            while((content=read.readLine())!=null){
                con += content + "\n";
            }
            read.close();
        }
        catch(FileNotFoundException e){System.out.println("File Not Found");;}
        catch(IOException e){System.out.println("Error occurs in readFile");}
        
        return con;
    }
}


