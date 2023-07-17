/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class L1Q1_3 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Data Structure\\Oon Yee Sem_S2143263.txt";
        writeFile(fileName);
    }
    
    public static void writeFile(String fileName){
        Scanner input = new Scanner(System.in);
        String line = "";
        String content = "";
        System.out.println("Enter content : ");
        line = input.nextLine();
        while (!line.equals("")) {
            content += line + "\n";
            line = input.nextLine();
        }
        
        try{
            PrintWriter write = new PrintWriter(new FileOutputStream(fileName,true));
            write.write(content);
            write.close();
        }
        catch(FileNotFoundException e){System.out.println("File Not Found");}
    }
}
