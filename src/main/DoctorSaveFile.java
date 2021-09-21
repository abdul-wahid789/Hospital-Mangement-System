/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parvez
 */
public class DoctorSaveFile {

    public void saveDoctor(Doctor aDoctor) {
        List<Doctor> doctorList = new ArrayList<Doctor>();
        doctorList.add(aDoctor);
        File dic = new File("DoctorDB.txt");
        if (dic.exists()) {
            
            try{
            FileInputStream fis=new FileInputStream(dic);
            ObjectInputStream ois=new ObjectInputStream(fis);
            List<Doctor> tempList = (ArrayList<Doctor>) ois.readObject();
            tempList.add(aDoctor);
            ois.close();
            fis.close();
           
            
            
            
            
            
            try {
                FileOutputStream fos = new FileOutputStream(dic);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(tempList);
                oos.close();
                fos.close();

            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }

            }
            catch(FileNotFoundException e){
                
            }
            catch (IOException e)
            {
                
            }
            catch (ClassNotFoundException e)
            {
                
            }
            
            
        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dic);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(doctorList);
                oos.close();
                fos.close();

            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }
        }
    }
}
