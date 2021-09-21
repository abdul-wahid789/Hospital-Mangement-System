/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Parvez
 */
public class NumberWrite {

    public void write(int i) {
        try {
            FileWriter fw = new FileWriter("number.txt");
            fw.write((int) i);
            fw.close();
        } catch (IOException e) {

        }
    }

    public void consult(int i) {
        try {
            FileWriter fw = new FileWriter("consult.txt");
            fw.write((int) i);
            fw.close();
        } catch (IOException e) {

        }
    }
    public void tableint(int i) {
       try {
           String str=Integer.toString(i);
            FileWriter fw = new FileWriter("TableInt.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
        } catch (IOException e) {

        }
    }
    public void tableintrecp(int i) {
       try {
           String str=Integer.toString(i);
            FileWriter fw = new FileWriter("TableIntRecp.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
        } catch (IOException e) {

        }
    }
}
