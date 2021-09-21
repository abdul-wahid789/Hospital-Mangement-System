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
import javax.swing.JPanel;

/**
 *
 * @author Parvez
 */
public class FileWrite {

    public void fileWritePatient(Patient aPaitent) {

        List<Patient> list = new ArrayList<Patient>();
        list.add(aPaitent);

        File dir = new File("PatientDB.txt");

        if (dir.exists()) {
            List<Patient> localList = new ArrayList<Patient>();

            try {
                FileInputStream fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);

                List<Patient> tempList = (ArrayList<Patient>) ois.readObject();
                localList = tempList;
                ois.close();
                fis.close();

                localList.add(aPaitent);

                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(localList);
                    oos.close();
                    fos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dir);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
               
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }
    }

    public void fileWriteDoctor(Doctor aDoctor) {

        List<Doctor> list = new ArrayList<Doctor>();
        list.add(aDoctor);

        File dir = new File("DoctorDB.txt");

        if (dir.exists()) {
            List<Doctor> localList = new ArrayList<Doctor>();

            try {
                FileInputStream fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);

                List<Doctor> tempList = (ArrayList<Doctor>) ois.readObject();
                localList = tempList;
                ois.close();
                fis.close();

                localList.add(aDoctor);

                FileOutputStream fos = new FileOutputStream(dir);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(localList);
                oos.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }
    }
    
    public void fileWritePharmacist(Pharmacist aPharmacist) {

        List<Pharmacist> list = new ArrayList<Pharmacist>();
        list.add(aPharmacist);

        File dir = new File("PharmacistDB.txt");

        if (dir.exists()) {
            List<Pharmacist> localList = new ArrayList<Pharmacist>();

            try {
                FileInputStream fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);

                List<Pharmacist> tempList = (ArrayList<Pharmacist>) ois.readObject();
                localList = tempList;
                ois.close();
                fis.close();

                localList.add(aPharmacist);

                FileOutputStream fos = new FileOutputStream(dir);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(localList);
                oos.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }
    }

    public void fileWriteReceptionist(Receptionist aReceptionist) {

        List<Receptionist> list = new ArrayList<Receptionist>();
        list.add(aReceptionist);

        File dir = new File("ReceptionistDB.txt");

        if (dir.exists()) {
            List<Receptionist> localList = new ArrayList<Receptionist>();

            try {
                FileInputStream fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);

                List<Receptionist> tempList = (ArrayList<Receptionist>) ois.readObject();
                localList = tempList;
                ois.close();
                fis.close();

                localList.add(aReceptionist);

                FileOutputStream fos = new FileOutputStream(dir);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(localList);
                oos.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }
    }
    
    public void fileWritePrescription(Prescription aPrescription) {

        List<Prescription> list = new ArrayList<Prescription>();
        list.add(aPrescription);

        File dir = new File("PrescriptionDB.txt");

        if (dir.exists()) {
            List<Prescription> localList = new ArrayList<Prescription>();

            try {
                FileInputStream fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);

                List<Prescription> tempList = (ArrayList<Prescription>) ois.readObject();
                localList = tempList;
                ois.close();
                fis.close();

                localList.add(aPrescription);

                FileOutputStream fos = new FileOutputStream(dir);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(localList);
                oos.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }
    }
    
    public void fileWriteAppointment(Appointment aAppointment) {

        List<Appointment> list = new ArrayList<Appointment>();
        list.add(aAppointment);

        File dir = new File("AppointmentDB.txt");

        if (dir.exists()) {
            List<Appointment> localList = new ArrayList<Appointment>();

            try {
                FileInputStream fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);

                List<Appointment> tempList = (ArrayList<Appointment>) ois.readObject();
                localList = tempList;
                ois.close();
                fis.close();

                localList.add(aAppointment);

                FileOutputStream fos = new FileOutputStream(dir);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(localList);
                oos.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }
    }
    public void fileWriteAppointmentFinal(Appointment aAppointment) {

        List<Appointment> list = new ArrayList<Appointment>();
        list.add(aAppointment);

        File dir = new File("AppointmentDBFinal.txt");

        if (dir.exists()) {
            List<Appointment> localList = new ArrayList<Appointment>();

            try {
                FileInputStream fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);

                List<Appointment> tempList = (ArrayList<Appointment>) ois.readObject();
                localList = tempList;
                ois.close();
                fis.close();

                localList.add(aAppointment);

                FileOutputStream fos = new FileOutputStream(dir);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(localList);
                oos.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dir);
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(list);
                    oos.close();
                    fos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }
    }
}
