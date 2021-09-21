/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Parvez
 */
public class FileUpdate {

    public void fileUpdateDoctor(int i, Doctor aDoctor) {
         List<Doctor> list = new ArrayList<Doctor>();
        FileRead fr=new FileRead();
        list=fr.fileReadDoctor();
        list.set(i, aDoctor);
        try {
                FileOutputStream fos = new FileOutputStream("DoctorDB.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
    }
     public void fileUpdatePatient(int i, Patient aPatient) {
         List<Patient> list = new ArrayList<Patient>();
        FileRead fr=new FileRead();
        list=fr.fileReadPatient();
        list.set(i, aPatient);
        try {
                FileOutputStream fos = new FileOutputStream("PatientDB.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
    }
 public void fileUpdateLogin(int i, Login aLogin) {
         List<Login> list = new ArrayList<Login>();
        FileRead fr=new FileRead();
        list=fr.fileReadLogin();
        list.set(i, aLogin);
        try {
                FileOutputStream fos = new FileOutputStream("LoginDB.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
    }
 public void fileUpdateReceptionist(int i, Receptionist aReceptionist) {
         List<Receptionist> list = new ArrayList<Receptionist>();
        FileRead fr=new FileRead();
        list=fr.fileReadReceptionist();
        list.set(i, aReceptionist);
        try {
                FileOutputStream fos = new FileOutputStream("ReceptionistDB.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
    }
 public void fileUpdatePharmacist(int i, Pharmacist aPharmacist) {
         List<Pharmacist> list = new ArrayList<Pharmacist>();
        FileRead fr=new FileRead();
        list=fr.fileReadPharmacist();
        list.set(i, aPharmacist);
        try {
                FileOutputStream fos = new FileOutputStream("PharmacistDB.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
    }
 public void fileUpdatePrescription(int i, Prescription aPrescription) {
         List<Prescription> list = new ArrayList<Prescription>();
        FileRead fr=new FileRead();
        list=fr.fileReadPrescription();
        list.set(i, aPrescription);
        try {
                FileOutputStream fos = new FileOutputStream("PrescriptionDB.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
    }
public void fileUpdateAppointment(int i, Appointment aAppointment) {
         List<Appointment> list = new ArrayList<Appointment>();
        FileRead fr=new FileRead();
        list=fr.fileReadAppointment();
        list.set(i, aAppointment);
        try {
                FileOutputStream fos = new FileOutputStream("AppointmentDB.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
    }
public void fileUpdateAppointmentFinal(int i, Appointment aAppointment) {
         List<Appointment> list = new ArrayList<Appointment>();
        FileRead fr=new FileRead();
        list=fr.fileReadAppointment();
        list.set(i, aAppointment);
        try {
                FileOutputStream fos = new FileOutputStream("AppointmentDBFinal.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
    }


}