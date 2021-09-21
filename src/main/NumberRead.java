/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Parvez
 */
public class NumberRead {
    public int read(){
        int i=-1;
        FileReader fr = null;
        try {
            fr = new FileReader("number.txt");
            
            i = (int) fr.read();
           
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }catch(IOException e){
            
        }
         return i;
    }
    public int consult(){
        int i=-1;
        FileReader fr = null;
        try {
            fr = new FileReader("consult.txt");
            
            i = (int) fr.read();
           
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }catch(IOException e){
            
        }
         return i;
    }
    public int tableint(){
        int i=1;
        FileReader fr = null;
        try {
            fr = new FileReader("TableInt.txt");
             BufferedReader input = new BufferedReader(fr);
            String str=null;
            str=input.readLine();
            i=Integer.parseInt(str);
           
            input.close();
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }catch(IOException e){
            
        }
         return i;
    }
    public int tableintrecp(){
        int i=1;
        FileReader fr = null;
        try {
            fr = new FileReader("TableIntRecp.txt");
             BufferedReader input = new BufferedReader(fr);
            String str=null;
            str=input.readLine();
            i=Integer.parseInt(str);
           
            input.close();
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }catch(IOException e){
            
        }
         return i;
    }
}
