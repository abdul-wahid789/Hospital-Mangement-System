
package main;

import java.io.File;
import main.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parvez
 */
public class FileRead {

    public List<Patient> fileReadPatient() {
        List<Patient> listArray=new ArrayList<Patient>();
        try {
            File dir = new File("PatientDB.txt");
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Patient> list = (ArrayList<Patient>) ois.readObject();
            listArray=list;
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            
        }
        return listArray;
    }
    
    public List<Doctor> fileReadDoctor() {
        List<Doctor> listArray=new ArrayList<Doctor>();
        try {
            File dir = new File("DoctorDB.txt");
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Doctor> list = (ArrayList<Doctor>) ois.readObject();
            listArray=list;
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
        return listArray;
    }
    
    public List<Login> fileReadLogin() {
        List<Login> listArray=new ArrayList<Login>();
        try {
            File dir = new File("LoginDB.txt");
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Login> list = (ArrayList<Login>) ois.readObject();
            listArray=list;
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            
        }
        return listArray;
    }
    
    public List<Pharmacist> fileReadPharmacist() {
        List<Pharmacist> listArray=new ArrayList<Pharmacist>();
        try {
            File dir = new File("PharmacistDB.txt");
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Pharmacist> list = (ArrayList<Pharmacist>) ois.readObject();
            listArray=list;
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            
        }
        return listArray;
    }
    
    public List<Receptionist> fileReadReceptionist() {
        List<Receptionist> listArray=new ArrayList<Receptionist>();
        try {
            File dir = new File("ReceptionistDB.txt");
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Receptionist> list = (ArrayList<Receptionist>) ois.readObject();
            listArray=list;
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            
        }
        return listArray;
    }
    
    public List<Prescription> fileReadPrescription() {
        List<Prescription> listArray=new ArrayList<Prescription>();
        try {
            File dir = new File("PrescriptionDB.txt");
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Prescription> list = (ArrayList<Prescription>) ois.readObject();
            listArray=list;
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            
        }
        return listArray;
    }
    public List<Appointment> fileReadAppointment() {
        List<Appointment> listArray=new ArrayList<Appointment>();
        try {
            File dir = new File("AppointmentDB.txt");
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Appointment> list = (ArrayList<Appointment>) ois.readObject();
            listArray=list;
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            
        }
        return listArray;
    }
    public List<Appointment> fileReadAppointmentFinal() {
        List<Appointment> listArray=new ArrayList<Appointment>();
        try {
            File dir = new File("AppointmentDBFinal.txt");
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Appointment> list = (ArrayList<Appointment>) ois.readObject();
            listArray=list;
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            
        }
        return listArray;
    }
}
