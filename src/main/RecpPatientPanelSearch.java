/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Parvez
 */
public class RecpPatientPanelSearch extends javax.swing.JFrame {
int n = 0, c = 0,nn=-1;
    List<Patient> list = new ArrayList<Patient>();
    /**
     * Creates new form PatientPanel
     */
    public RecpPatientPanelSearch() {
        initComponents();
        set();
    }
public void set() {

        List<Receptionist> list = new ArrayList<Receptionist>();
        NumberRead num = new NumberRead();
        nn = num.read();

        FileRead fw = new FileRead();
        list = fw.fileReadReceptionist();
        name.setText(list.get(nn).getName());
}
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMaritialCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jGenderCombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPatientTypeCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPhoneNo = new javax.swing.JTextField();
        jSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSearchButtton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jBloodGroupCombo = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        add5 = new javax.swing.JLabel();
        update4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        update5 = new javax.swing.JLabel();
        update6 = new javax.swing.JLabel();
        update7 = new javax.swing.JLabel();
        update8 = new javax.swing.JLabel();
        update9 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Management System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(24, 44, 97));

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search Patient");

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hms60.png"))); // NOI18N
        jLabel1.setText("HMS");

        name.setEditable(false);
        name.setBackground(new java.awt.Color(24, 44, 97));
        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        name.setText("Abdul Wahid");
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(232, 65, 24));
        jLabel15.setText("(Logout)");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Full Name");

        jFullName.setEditable(false);
        jFullName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("Age");

        jAge.setEditable(false);
        jAge.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel9.setText("Gender");

        jMaritialCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMaritialCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Marrired", "Unmarried" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel10.setText("Address");

        jAddress.setEditable(false);
        jAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddressActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel11.setText("Marital status ");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel12.setText("Date");

        jGenderCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel13.setText("Patient Type");

        jPatientTypeCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jPatientTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Indoor", "Outdoor" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel14.setText("Phone No.");

        jPhoneNo.setEditable(false);
        jPhoneNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        jSearch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Enter Patient's name to Search");

        jSearchButtton.setBackground(new java.awt.Color(6, 82, 221));
        jSearchButtton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jSearchButtton.setForeground(new java.awt.Color(255, 255, 255));
        jSearchButtton.setText("Search");
        jSearchButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButttonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel18.setText("Blood Group");

        jBloodGroupCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBloodGroupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        jPanel13.setBackground(new java.awt.Color(24, 44, 97));

        add5.setBackground(new java.awt.Color(0, 204, 204));
        add5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        add5.setForeground(new java.awt.Color(255, 255, 255));
        add5.setText("Appointments");
        add5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add5addMouseClicked(evt);
            }
        });

        update4.setBackground(new java.awt.Color(0, 204, 204));
        update4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        update4.setForeground(new java.awt.Color(255, 255, 255));
        update4.setText("Edit Profile");
        update4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update4updateMouseClicked(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        update5.setBackground(new java.awt.Color(0, 204, 204));
        update5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        update5.setForeground(new java.awt.Color(255, 255, 255));
        update5.setText("Add Patient");
        update5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update5updateMouseClicked(evt);
            }
        });

        update6.setBackground(new java.awt.Color(0, 204, 204));
        update6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        update6.setForeground(new java.awt.Color(255, 255, 255));
        update6.setText("Update Patient");
        update6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update6updateMouseClicked(evt);
            }
        });

        update7.setBackground(new java.awt.Color(0, 204, 204));
        update7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        update7.setForeground(new java.awt.Color(255, 255, 255));
        update7.setText("Remove Patient");
        update7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update7updateMouseClicked(evt);
            }
        });

        update8.setBackground(new java.awt.Color(0, 204, 204));
        update8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        update8.setForeground(new java.awt.Color(255, 255, 255));
        update8.setText("Patients list");
        update8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update8updateMouseClicked(evt);
            }
        });

        update9.setBackground(new java.awt.Color(0, 204, 204));
        update9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        update9.setForeground(new java.awt.Color(255, 255, 255));
        update9.setText("Search Patient");
        update9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update9updateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(add5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(update6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(add5)
                .addGap(31, 31, 31)
                .addComponent(update5)
                .addGap(35, 35, 35)
                .addComponent(update7)
                .addGap(28, 28, 28)
                .addComponent(update9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(update6)
                .addGap(31, 31, 31)
                .addComponent(update8)
                .addGap(33, 33, 33)
                .addComponent(update4)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jDate.setDateFormatString("d MMM, yyyy");
        jDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSearchButtton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(jFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(127, 127, 127)
                                .addComponent(jAge, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(90, 90, 90)
                                .addComponent(jGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(84, 84, 84)
                                .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jMaritialCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(56, 56, 56)
                                .addComponent(jPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(118, 118, 118)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(32, 32, 32)
                                .addComponent(jBloodGroupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(33, 33, 33)
                                .addComponent(jPatientTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSearchButtton))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jMaritialCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jPatientTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jBloodGroupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButttonActionPerformed
       String find = jSearch.getText();
        FileRead fw = new FileRead();
        clear();
        list = fw.fileReadPatient();
        int i = -1;
        c = 0;
        for (Patient dc : list) {
            i++;
            if (find.equalsIgnoreCase(dc.getName())) {
                c = 1;
                break;
            }

        }
        if (c == 0) {
            JOptionPane.showMessageDialog(null, "No Data Found",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
            clear();

        } else {
            jFullName.setText(list.get(i).getName());
            jAge.setText(list.get(i).getAge());
            jGenderCombo.setSelectedItem(list.get(i).getGender());
            jAddress.setText(list.get(i).getAddress());
            jMaritialCombo.setSelectedItem(list.get(i).getMaritial());
            jPhoneNo.setText(list.get(i).getPhone());
            jBloodGroupCombo.setSelectedItem(list.get(i).getBlood());
            jPatientTypeCombo.setSelectedItem(list.get(i).getPatientType());
            jDate.setDate(list.get(i).getDate());
            n = i;
        }
    }//GEN-LAST:event_jSearchButttonActionPerformed
public void clear() {
        jSearch.setText("");
        jFullName.setText("");
        jAge.setText("");
        jGenderCombo.setSelectedItem("Select");
        jAddress.setText("");
        jMaritialCombo.setSelectedItem("Select");
        jPhoneNo.setText("");
        jBloodGroupCombo.setSelectedItem("Select");
        jPatientTypeCombo.setSelectedItem("Select");
        jDate.setDate(null);
    }
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        LoginAsFrame al=new LoginAsFrame();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void add5addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add5addMouseClicked
        RecpPanelAppointment pa=new RecpPanelAppointment();
        pa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add5addMouseClicked

    private void update4updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update4updateMouseClicked
        RecpPanelEdit pupdate=new RecpPanelEdit();
        pupdate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update4updateMouseClicked

    private void update5updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update5updateMouseClicked
        RecpPatientPanelAdd rppa=new RecpPatientPanelAdd();
        rppa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update5updateMouseClicked

    private void update6updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update6updateMouseClicked
        RecpPatientPanelUpdate rpps=new RecpPatientPanelUpdate();
        rpps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update6updateMouseClicked

    private void update7updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update7updateMouseClicked
        RecpPatientPanelRemove rppr=new RecpPatientPanelRemove();
        rppr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update7updateMouseClicked

    private void update8updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update8updateMouseClicked
        RecpPatientPanelList rppl=new RecpPatientPanelList();
        rppl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update8updateMouseClicked

    private void update9updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update9updateMouseClicked
        
    }//GEN-LAST:event_update9updateMouseClicked

    private void jAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddressActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecpPatientPanelSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecpPatientPanelSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecpPatientPanelSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecpPatientPanelSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecpPatientPanelSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add5;
    private javax.swing.JTextField jAddress;
    private javax.swing.JTextField jAge;
    private javax.swing.JComboBox<String> jBloodGroupCombo;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JTextField jFullName;
    private javax.swing.JComboBox<String> jGenderCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMaritialCombo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jPatientTypeCombo;
    private javax.swing.JTextField jPhoneNo;
    private javax.swing.JTextField jSearch;
    private javax.swing.JButton jSearchButtton;
    private javax.swing.JTextField name;
    private javax.swing.JLabel update4;
    private javax.swing.JLabel update5;
    private javax.swing.JLabel update6;
    private javax.swing.JLabel update7;
    private javax.swing.JLabel update8;
    private javax.swing.JLabel update9;
    // End of variables declaration//GEN-END:variables
}
