/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class L1Q2_1 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Data Structure\\text.txt";
        String content = "";
        String con = "";
        int numChar = 0;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            while ((con=read.readLine())!=null) {
                String [] chars = con.split(",");
                numChar += chars.length;
                for(String tempt : chars)
                    content += tempt;
                content += "\n";
            }
            read.close();
        } 
        catch (FileNotFoundException e) {System.out.println("File Not File");}
        catch (IOException e){System.out.println("Error occurs in ReadFile");}
        System.out.println("Number of character : " + numChar);
        System.out.println("Content of text file : ");
        System.out.println(content);
    }
}
