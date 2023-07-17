/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class L1Q1_2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Data Structure\\Oon Yee Sem_S2143263.txt";
        String content = L1Q1_1.readFile(fileName);
        String fileName2 = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Data Structure\\Oon Yee Sem_S2143263_2.txt";
        writeFile(fileName2,content);
    }
    
    public static void writeFile(String fileName,String content){
    try{
       PrintWriter write = new PrintWriter(new FileWriter(fileName));   
       write.write(content);
       write.close();
    }
    catch(FileNotFoundException e){System.out.println("File Not Found");}
    catch(IOException e){System.out.println("Error occurs in writeFile");}
    }
}
