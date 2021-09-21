
package main;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Parvez
 */
public class Patient extends Person implements Serializable{

   
    private String patientType;
    private Date date;
    private String disease;
    private String medicineName;
    private String dose;
    private String time;
    private String discription;
    private Date prescriptionDate;

    public Patient(String patientType, 
            Date date,
            String disease,
            String medicineName,
            String dose,
            String time,
            String discription,
            Date prescriptionDate,
            String name,
            String age, 
            String gender, 
            String address,
            String maritial,
            String phone,
            String blood,
            String username,
            String password) {
        super(name, age, gender, address, maritial, phone, blood, username, password);
        this.patientType = patientType;
        this.date = date;
        this.disease = disease;
        this.medicineName = medicineName;
        this.dose = dose;
        this.time = time;
        this.discription = discription;
        this.prescriptionDate = prescriptionDate;
    }
    public String strDate() {
                    SimpleDateFormat DateFor = new SimpleDateFormat("dd-MM-yyyy");
        String stringDate= DateFor.format(date);
        return stringDate;
    }
    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

   
    
    
}