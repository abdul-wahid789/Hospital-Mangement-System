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
import javax.swing.JOptionPane;

/**
 *
 * @author Parvez
 */
public class FileRemove {

    public void fileRemoveDoctor(List<Doctor> list) {
        File dir = new File("DoctorDB.txt");

        if (dir.exists()) {

            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                    JOptionPane.showMessageDialog(null, "Data remove Successfully",
                            "Success", JOptionPane.WARNING_MESSAGE);
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No Data Found",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }

    }
    public void fileRemovePatient(List<Patient> list) {
        File dir = new File("PatientDB.txt");

        if (dir.exists()) {

            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                    JOptionPane.showMessageDialog(null, "Data remove Successfully",
                            "Success", JOptionPane.WARNING_MESSAGE);
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No Data Found",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }

    }
    public void fileRemoveReceptionist(List<Receptionist> list) {
        File dir = new File("ReceptionistDB.txt");

        if (dir.exists()) {

            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                    JOptionPane.showMessageDialog(null, "Data remove Successfully",
                            "Success", JOptionPane.WARNING_MESSAGE);
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No Data Found",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }

    }
    public void fileRemovePharmacist(List<Pharmacist> list) {
        File dir = new File("PharmacistDB.txt");

        if (dir.exists()) {

            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                    JOptionPane.showMessageDialog(null, "Data remove Successfully",
                            "Success", JOptionPane.WARNING_MESSAGE);
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No Data Found",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }

    }
    public void fileRemoveAppointment(List<Appointment> list) {
        File dir = new File("AppointmentDB.txt");

        if (dir.exists()) {

            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                    
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No Data Found",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }

    }
    public void fileRemoveAppointmentFinal(List<Appointment> list) {
        File dir = new File("AppointmentDBFinal.txt");

        if (dir.exists()) {

            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                    
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No Data Found",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }

    }
    

}
